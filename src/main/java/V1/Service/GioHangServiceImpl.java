package V1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import V1.DAO.GioHangDAO;
import V1.DTO.SanPhamMua;
import V1.entity.GioHang;

@Service
public class GioHangServiceImpl implements GioHangService {

	@Autowired
	private GioHangDAO gioHangDAO;
	
	@Override
	@Transactional
	public void deleteGioHangByIdNguoiDung(int maND) {
		gioHangDAO.deleteGioHangByIdNguoiDung(maND);
		
	}
	
	@Override
	@Transactional
	public void deleteGioHangByIdNguoiDungAndSanPhamMuas(int maND, List<SanPhamMua> sanPhamMuas) {
		gioHangDAO.deleteGioHangByIdNguoiDungAndSanPhamMuas(maND, sanPhamMuas);
		
	}
	
	@Override
	@Transactional
	public void deleteGioHangByIdNguoiDungAndIdSanPham(int maND, int idSanPham) {
		gioHangDAO.deleteGioHangByIdNguoiDungAndIdSanPham(maND, idSanPham);
	}

	@Override
	@Transactional
	public boolean saveGioHang(GioHang gioHang) {
		return gioHangDAO.saveGioHang(gioHang);
	}

	@Override
	@Transactional
	public List<GioHang> getDSGioHang() {
		return gioHangDAO.getDSGioHang();
	}

	@Override
	@Transactional
	public List<GioHang> findAll() {
		return gioHangDAO.findAll();
	}

	@Override
	@Transactional
	public List<GioHang> findAll(int page) {
		return gioHangDAO.findAll(page);
	}

	@Override
	@Transactional
	public int getNumberOfPage() {
		return gioHangDAO.getNumberOfPage();
	}

	@Override
	@Transactional
	public GioHang addGioHang(GioHang gioHang) {
		return gioHangDAO.addGioHang(gioHang);
	}

	@Override
	@Transactional
	public List<GioHang> findGioHangByUserId(int maND) {
		return gioHangDAO.findGioHangByUserId(maND);
	}

	@Override
	@Transactional
	public int getNumOfSanPhamInGioHangByEmail(String email) {
		return gioHangDAO.getNumOfSanPhamInGioHangByEmail(email);
	}
	
	@Override
	@Transactional
	public void updateDanhSachGioHang(int maND, List<GioHang> dsgh) {
		gioHangDAO.deleteGioHangByIdNguoiDung(maND);
		dsgh.forEach(gioHang -> {
			gioHangDAO.addGioHang(gioHang);
		});
	}
}
