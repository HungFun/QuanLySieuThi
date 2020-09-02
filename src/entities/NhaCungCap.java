package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "getNhaCungCaps", query = "select * from NhaCungCap", resultClass = KhachHang.class)
})
public class NhaCungCap {

	@Id
	private String maNCC;
	private String tenNCC;
	private String dienThoai;
	private String email;

	@Embedded
	private DiaChi diaChi;
	
	@OneToMany(mappedBy = "nhaCungCap",cascade = CascadeType.ALL)
	private List<HangHoa> listHH;
	/**
	 * @return the maNCC
	 */
	public String getMaNCC() {
		return maNCC;
	}
	/**
	 * @param maNCC the maNCC to set
	 */
	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}
	/**
	 * @return the tenNCC
	 */
	public String getTenNCC() {
		return tenNCC;
	}
	/**
	 * @param tenNCC the tenNCC to set
	 */
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
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
	 * @param maNCC
	 * @param tenNCC
	 * @param dienThoai
	 * @param email
	 */
	public NhaCungCap(String maNCC, String tenNCC, String dienThoai, String email) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.dienThoai = dienThoai;
		this.email = email;
	}
	/**
	 * 
	 */
	public NhaCungCap() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NhaCungCap [maNCC=");
		builder.append(maNCC);
		builder.append(", tenNCC=");
		builder.append(tenNCC);
		builder.append(", dienThoai=");
		builder.append(dienThoai);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
}
