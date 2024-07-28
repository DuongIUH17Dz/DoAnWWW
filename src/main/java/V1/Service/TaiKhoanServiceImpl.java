package V1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import V1.DAO.TaiKhoanDAO;
import V1.entity.NguoiDung;
import V1.entity.TaiKhoan;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanDAO TaiKhoanDAO;

    @Override
    @Transactional
    public List<TaiKhoan> getDSTaiKhoan() {
        return TaiKhoanDAO.getDSTaiKhoan();
    }

	@Override
    @Transactional
	public boolean doesUserExist(String email) {
		return TaiKhoanDAO.doesUserExist(email);
	}

	@Override
    @Transactional
	public NguoiDung createUser(NguoiDung nguoiDung) {
		return TaiKhoanDAO.createUser(nguoiDung);
	}

	@Override
	@Transactional
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) {
		
		return TaiKhoanDAO.updateTaiKhoan(taiKhoan);
	}

}
