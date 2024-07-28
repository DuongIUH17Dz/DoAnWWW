package V1.DTO;

import java.util.Date;

import V1.Service.ThongKeServiceImpl.LabelCount;

public interface ThongKeDTO {
	public long tongDoanhThu(Date from, Date to);
	public long tongLoiNhuan(Date from, Date to);
	public int tongSoDonHang(Date from, Date to);
	public int tongSoThiepBan(Date from, Date to);
	public LabelCount soDanhMucBanRa(Date from, Date to);
	public LabelCount soSanPhamBanRa(Date from, Date to);
	
}
