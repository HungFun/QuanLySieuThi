package entities;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietHoaDonPK.class)
public class ChiTietHoaDon {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "hoadon_id", foreignKey = @ForeignKey())
	private HoaDon hoaDon;

	@Id
	@ManyToOne
	@JoinColumn(name="hanghoa_id",foreignKey = @ForeignKey())
	private HangHoa hangHoa;
	
	private double donGiaBan;
	private int soLuong;
	/**
	 * @return the hoaDon
	 */
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	/**
	 * @param hoaDon the hoaDon to set
	 */
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	/**
	 * @return the hangHoa
	 */
	public HangHoa getHangHoa() {
		return hangHoa;
	}
	/**
	 * @param hangHoa the hangHoa to set
	 */
	public void setHangHoa(HangHoa hangHoa) {
		this.hangHoa = hangHoa;
	}
	/**
	 * @return the donGiaBan
	 */
	public double getDonGiaBan() {
		return donGiaBan;
	}
	/**
	 * @param donGiaBan the donGiaBan to set
	 */
	public void setDonGiaBan(double donGiaBan) {
		this.donGiaBan = donGiaBan;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @param hoaDon
	 * @param hangHoa
	 * @param donGiaBan
	 * @param soLuong
	 */
	public ChiTietHoaDon(HoaDon hoaDon, HangHoa hangHoa, double donGiaBan, int soLuong) {
		super();
		this.hoaDon = hoaDon;
		this.hangHoa = hangHoa;
		this.donGiaBan = donGiaBan;
		this.soLuong = soLuong;
	}
	/**
	 * 
	 */
	public ChiTietHoaDon() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChiTietHoaDon [hoaDon=");
		builder.append(hoaDon);
		builder.append(", hangHoa=");
		builder.append(hangHoa);
		builder.append(", donGiaBan=");
		builder.append(donGiaBan);
		builder.append(", soLuong=");
		builder.append(soLuong);
		builder.append("]");
		return builder.toString();
	}
	
	

}
