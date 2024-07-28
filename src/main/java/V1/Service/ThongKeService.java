package V1.Service;

import java.util.Date;

import V1.Service.ThongKeServiceImpl.LabelCount;
import V1.Service.ThongKeServiceImpl.LineChartObject;

public interface ThongKeService {
	public long tongDoanhThu(Date from, Date to);
	public long tongLoiNhuan(Date from, Date to);
	public int tongSoDonHang(Date from, Date to);
	public int tongSoThiepBan(Date from, Date to);
	public LineChartObject doanhThuVaLoiNhuan(Date from, Date to);
	public LabelCount soDanhMucBanRa(Date from, Date to);
	public LineChartObject soDonHang(Date from, Date to);
	public LabelCount soSanPhamBanRa(Date from, Date to);
}
