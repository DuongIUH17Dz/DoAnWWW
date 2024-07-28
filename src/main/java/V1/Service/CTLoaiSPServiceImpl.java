package V1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import V1.DAO.CTLoaiSPDAO;
import V1.entity.ChiTietLoaiSP;
import V1.entity.SanPham;

@Service
public class CTLoaiSPServiceImpl implements CTLoaiSPService {
    @Autowired
    private CTLoaiSPDAO ctLoaiSPDAO;

    @Override
    @Transactional
    public List<ChiTietLoaiSP> getDSCTLoaiSP() {
        return ctLoaiSPDAO.getDSChiTietLoaiSP();
    }

	@Override
	public List<ChiTietLoaiSP> getDSCTLSPByMaSP(int maSp) {
		return ctLoaiSPDAO.getDSCTLSPByMaSP( maSp);
	}

	@Override
	public void save(ChiTietLoaiSP chiTietLoaiSP) {
		ctLoaiSPDAO.save( chiTietLoaiSP);
	}

	@Override
	public void updateChiTietLoaiSP(SanPham sanPham) {
		ctLoaiSPDAO.updateChiTietLoaiSP(sanPham);
	}
    
}
