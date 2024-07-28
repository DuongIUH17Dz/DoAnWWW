package V1.Service;

import java.util.List;

import V1.DTO.SanPhamMua;
import V1.entity.*;

public interface GioHangService {
	public void deleteGioHangByIdNguoiDung(int maND);
	
	public void deleteGioHangByIdNguoiDungAndSanPhamMuas(int maND, List<SanPhamMua> sanPhamMuas);
	
	public void deleteGioHangByIdNguoiDungAndIdSanPham(int maND, int idSanPham);

	public List<GioHang> getDSGioHang();

	public List<GioHang> findAll();

	public List<GioHang> findAll(int page);

	public int getNumberOfPage();

	public GioHang addGioHang(GioHang gioHang);

	public List<GioHang> findGioHangByUserId(int maND);

	public boolean saveGioHang(GioHang gioHang);
	
	public int getNumOfSanPhamInGioHangByEmail(String email);
	
	public void updateDanhSachGioHang(int maND, List<GioHang> dsgh);
}
