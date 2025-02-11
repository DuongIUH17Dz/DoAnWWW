package V1.Service;

import java.util.List;

import V1.entity.HoaDon;

public interface HoaDonService {
    public List<HoaDon> getDSHoaDon();
    public HoaDon addHoaDon(HoaDon hoaDon);
    public void saveHoaDon(HoaDon hoaDon);
    public HoaDon findHoaDonById(int maHD);
    public void delete(int maHD);
    public List<HoaDon> findAll();
    public List<HoaDon> findAll(int page);
    public int getNumberOfPage();
    public List<HoaDon> findHoaDonByUserId(int maND);
    
}
