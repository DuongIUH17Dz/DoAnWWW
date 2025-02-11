package V1.Service;

import java.util.List;

import V1.entity.NguoiDung;

public interface NguoiDungService {
    public List<NguoiDung> findAll();
    public List<NguoiDung> findAll(int page);
    public int getNumberOfPage();
    public void save(NguoiDung nguoiDung);
    public NguoiDung findNguoiDungById(int id);
    public NguoiDung findNguoiDungByEmail(String email);
    public boolean updateNguoiDung(NguoiDung nguoiDung);
}
