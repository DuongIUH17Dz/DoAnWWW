package V1.Service;

import java.util.List;

import V1.entity.DanhGia;

public interface DanhGiaService {
	public List<DanhGia> getDanhGiasBySanPhamIdAndPageNumber(int idSanPham, int pageNumber);
	
	public List<DanhGia> getDsDanhGias();
	
	public int getNumberOfDanhGiaBySanPhamId(int sanPhamId);
	
	public boolean addDanhGia(DanhGia danhGia);

}
