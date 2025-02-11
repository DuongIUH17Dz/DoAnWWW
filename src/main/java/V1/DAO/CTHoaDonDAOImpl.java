package V1.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import V1.entity.*;

@Repository
public class CTHoaDonDAOImpl implements CTHoaDonDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<ChiTietHoaDon> getDSCTHoaDon() {
		Session currentSession = sessionFactory.getCurrentSession();
		String queryStr = "select ct.maHD, ct.soLuong, ct.giaBan, " + "sp.maSp, sp.tenSp, sp.giaSP, sp.hinhAnh "
				+ "from ChiTietHoaDon ct, SanPham sp " + "where ct.maSp = sp.maSp ";

		List<Object[]> results = currentSession.createNativeQuery(queryStr).getResultList();
		List<ChiTietHoaDon> dataList = new ArrayList<>();
		results.stream().forEach(item -> {
			int soLuong = Integer.parseInt(item[1].toString());
			double giaBan = Double.parseDouble(item[2].toString());
			int maSp = Integer.parseInt(item[3].toString());
			String tenSp = item[4].toString();
			double giaSp = Double.parseDouble(item[5].toString());
			String hinhAnh = item[6].toString();
			// SanPham sanPham = new SanPham(maSp, tenSp, hinhAnh, giaSp);
			// ChiTietHoaDon ctHoaDon = new ChiTietHoaDon(sanPham, soLuong, giaBan);
			// dataList.add(ctHoaDon);
		});

		return dataList;
	}

	@Override
	@Transactional
	public ChiTietHoaDon addChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(chiTietHoaDon);
		
		return chiTietHoaDon;
	}

	@Override
	public List<ChiTietHoaDon> getChiTietHoaDonByMaHD(int maHD) {
		Session currentSession = sessionFactory.getCurrentSession();
		String queryStr = "select ct.maHD, ct.soLuong, ct.giaBan, " + "sp.maSp, sp.tenSp, sp.giaSP, sp.hinhAnh "
				+ "from ChiTietHoaDon ct, SanPham sp " + "where ct.maSp = sp.maSp and maHD = "+maHD;

		List<Object[]> results = currentSession.createNativeQuery(queryStr).getResultList();
		List<ChiTietHoaDon> dataList = new ArrayList<>();
		results.stream().forEach(item -> {
			int soLuong = Integer.parseInt(item[1].toString());
			double giaBan = Double.parseDouble(item[2].toString());
			int maSp = Integer.parseInt(item[3].toString());
			String tenSp = item[4].toString();
			double giaSp = Double.parseDouble(item[5].toString());
			String hinhAnh = item[6].toString();
			SanPham sanPham = new SanPham(maSp, tenSp, hinhAnh, giaSp);
			ChiTietHoaDon ctHoaDon = new ChiTietHoaDon(sanPham, soLuong, giaBan);
			dataList.add(ctHoaDon);
		});

		return dataList;
	}

	@Override
	public void delete(ChiTietHoaDon chiTietHoaDon) {

		Session currentSession = sessionFactory.getCurrentSession();
//		ChiTietHoaDonPK cthdPK = new ChiTietHoaDonPK();
//		cthdPK.setHoaDon(chiTietHoaDon.getHoaDon().getMaHD());
//		cthdPK.setSanPham(chiTietHoaDon.getSanPham().getMaSp());
//		currentSession.delete(currentSession.find(ChiTietHoaDon.class, cthdPK));
		currentSession.createNativeQuery("delete from ChiTietHoaDon where maHD="+chiTietHoaDon.getHoaDon().getMaHD()+" and maSp = "+chiTietHoaDon.getSanPham().getMaSp()+";");
		System.out.println("delete");
	}
	
	@Transactional
	public List<ChiTietHoaDon> getDSCTHoaDonByMaHD(int mHD) {
		Session currentSession = sessionFactory.getCurrentSession();
		String query="select * from ChiTietHoaDon where maHD ="+mHD;
		List<ChiTietHoaDon> cthd=new ArrayList<ChiTietHoaDon>();
		cthd=currentSession.createNativeQuery(query,ChiTietHoaDon.class).getResultList();
		return cthd;
	}

}
