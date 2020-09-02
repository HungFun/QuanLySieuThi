package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "getKhachHangs", query = "select * from KhachHang", resultClass = KhachHang.class)
})
public class KhachHang {

	@Id
	private String maKH;
	private String hoKH;
	private String tenKH;
	private String dienThoai;
	private String email;
	
	@OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
	private List<HoaDon> listHD;
	
	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}
	/**
	 * @param maKH the maKH to set
	 */
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	/**
	 * @return the hoKH
	 */
	public String getHoKH() {
		return hoKH;
	}
	/**
	 * @param hoKH the hoKH to set
	 */
	public void setHoKH(String hoKH) {
		this.hoKH = hoKH;
	}
	/**
	 * @return the tenKH
	 */
	public String getTenKH() {
		return tenKH;
	}
	/**
	 * @param tenKH the tenKH to set
	 */
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	/**
	 * @return the dienThoai
	 */
	public String getDienThoai() {
		return dienThoai;
	}
	/**
	 * @param dienThoai the dienThoai to set
	 */
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param maKH
	 * @param hoKH
	 * @param tenKH
	 * @param dienThoai
	 * @param email
	 */
	public KhachHang(String maKH, String hoKH, String tenKH, String dienThoai, String email) {
		super();
		this.maKH = maKH;
		this.hoKH = hoKH;
		this.tenKH = tenKH;
		this.dienThoai = dienThoai;
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KhachHang [maKH=");
		builder.append(maKH);
		builder.append(", hoKH=");
		builder.append(hoKH);
		builder.append(", tenKH=");
		builder.append(tenKH);
		builder.append(", dienThoai=");
		builder.append(dienThoai);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * 
	 */
	public KhachHang() {
		super();
	}
	
	
}
