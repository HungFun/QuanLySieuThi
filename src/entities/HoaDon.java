package entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HoaDon {

	@Id
	private String maHD;
	//HD: Hoa Don
	
	private LocalDate ngayLapHD;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nhanvien_id", foreignKey = @ForeignKey())
	private NhanVien nhanVien;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "khachhang_id", foreignKey = @ForeignKey())
	private KhachHang khachHang;
	
	@OneToMany(mappedBy = "hoaDon",cascade = CascadeType.ALL)
	private List<ChiTietHoaDon> listCTHD;
	
	/**
	 * @return the maHD
	 */
	public String getMaHD() {
		return maHD;
	}

	/**
	 * @param maHD the maHD to set
	 */
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	/**
	 * @return the ngayLapHD
	 */
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}

	/**
	 * @param ngayLapHD the ngayLapHD to set
	 */
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	/**
	 * @param maHD
	 * @param ngayLapHD
	 */
	public HoaDon(String maHD, LocalDate ngayLapHD) {
		super();
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
	}

	/**
	 * 
	 */
	public HoaDon() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HoaDon [maHD=");
		builder.append(maHD);
		builder.append(", ngayLapHD=");
		builder.append(ngayLapHD);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
