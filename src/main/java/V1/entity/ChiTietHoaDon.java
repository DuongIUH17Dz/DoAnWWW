package V1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietHoaDonPK.class)
public class ChiTietHoaDon implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maHD", columnDefinition = "INT")
    private HoaDon hoaDon;

    @Id
    @JoinColumn(name = "maSp", columnDefinition = "INT")
    @ManyToOne(fetch = FetchType.EAGER)
    private SanPham sanPham;

    @Column(name = "soLuong", nullable = false, columnDefinition = "INT DEFAULT(1) CHECK(soLuong >= 1)")
    private int soLuong;

    @Column(name = "giaBan", nullable = false, columnDefinition = "MONEY DEFAULT(0) CHECK(giaBan >= 0)")
    private double giaBan;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, int soLuong, double giaBan) {
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}

	public ChiTietHoaDon(SanPham sanPham, int soLuong, double giaBan) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return this.giaBan * this.soLuong;
    }

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [sanPham=" + sanPham.getMaSp() + ", soLuong=" + soLuong + ", giaBan="
				+ giaBan + "]";
	}
}
