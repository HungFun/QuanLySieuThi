package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "getNhanViens", query = "select * from NhanVien", resultClass = NhanVien.class)
})
public class NhanVien {
	
	@Id
	private String maNV;
	private String hoNV;
	private String tenNV;
	private String ngaySinh;
	private String gioiTinh;
	private String dienThoai;
	
	@Embedded
	
	private DiaChi diaChi;
	
	@OneToOne(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	private TaiKhoan TaiKhoan;
	
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	private List<HoaDon> listHD;
	
	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}
	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	/**
	 * @return the hoNV
	 */
	public String getHoNV() {
		return hoNV;
	}
	/**
	 * @param hoNV the hoNV to set
	 */
	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}
	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}
	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	/**
	 * @return the ngaySinh
	 */
	public String getNgaySinh() {
		return ngaySinh;
	}
	/**
	 * @param ngaySinh the ngaySinh to set
	 */
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
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
	 * @param maNV
	 * @param hoNV
	 * @param tenNV
	 * @param ngaySinh
	 * @param gioiTinh
	 * @param dienThoai
	 */
	public NhanVien(String maNV, String hoNV, String tenNV, String ngaySinh, String gioiTinh, String dienThoai) {
		super();
		this.maNV = maNV;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.dienThoai = dienThoai;
	}
	/**
	 * 
	 */
	public NhanVien() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NhanVien [maNV=");
		builder.append(maNV);
		builder.append(", hoNV=");
		builder.append(hoNV);
		builder.append(", tenNV=");
		builder.append(tenNV);
		builder.append(", ngaySinh=");
		builder.append(ngaySinh);
		builder.append(", gioiTinh=");
		builder.append(gioiTinh);
		builder.append(", dienThoai=");
		builder.append(dienThoai);
		builder.append("]");
		return builder.toString();
	}
	
	
}
