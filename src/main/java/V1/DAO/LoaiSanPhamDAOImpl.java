package V1.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import V1.entity.*;

@Repository
public class LoaiSanPhamDAOImpl implements LoaiSanPhamDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private final int pageSize = 20;
    
    @Override
    public List<LoaiSanPham> findAll() {
    	Session currentSession = sessionFactory.getCurrentSession();
        Query<LoaiSanPham> query = currentSession.createQuery("from LoaiSanPham", LoaiSanPham.class);
        return query.getResultList();
    }


	@Override
	public List<LoaiSanPham> findAll(int page) {
		Session currentSession = sessionFactory.getCurrentSession();
        Query<LoaiSanPham> query = currentSession.createQuery("from LoaiSanPham", LoaiSanPham.class);
        query.setHibernateFirstResult((page-1)*pageSize);
        query.setMaxResults(pageSize);
        return query.getResultList();
	}
	
	@Override
	public LoaiSanPham findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		LoaiSanPham loaiSanPham = currentSession.get(LoaiSanPham.class, id);
		return loaiSanPham;
	}
	
	@Override
    public void save(LoaiSanPham lsp) {
    	Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(lsp);
    }

	@Override
	public void delete(int maLSP) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.delete(currentSession.find(LoaiSanPham.class, maLSP));
	}

	@Override
	public int getNumberOfPage() {
		return (findAll().size() + pageSize - 1)/pageSize;
	}

    @Override
    public boolean addLoaiSanPham(LoaiSanPham loaiSanPham) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(loaiSanPham);
        return true;
    }
}
