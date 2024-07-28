package V1.DAO;

import java.util.List;

import V1.entity.NguoiDung;
import V1.entity.TaiKhoan;

public interface TaiKhoanDAO {
    public List<TaiKhoan> getDSTaiKhoan();
    public boolean doesUserExist(String email);
    public NguoiDung createUser(NguoiDung nguoiDung);
    public boolean updateTaiKhoan(TaiKhoan taiKhoan);
}
