package V1.Service;

import java.util.List;

import V1.entity.ChiTietLoaiSP;
import V1.entity.SanPham;

public interface CTLoaiSPService {
    public List<ChiTietLoaiSP> getDSCTLoaiSP();
    public List<ChiTietLoaiSP> getDSCTLSPByMaSP(int maSp);
    public void save(ChiTietLoaiSP chiTietLoaiSP);
    public void updateChiTietLoaiSP(SanPham sanPham);
}
