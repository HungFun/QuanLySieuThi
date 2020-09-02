package entities;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "getTaiKhoans", query = "select * from TaiKhoan", resultClass = TaiKhoan.class)
})
public class TaiKhoan {

	@Id
	private String maTaiKhoan;
	private String MatKhau;
	private String chucVu;
	
	
	@OneToOne
	@JoinColumn(name = "nhanvien_id", foreignKey = @ForeignKey())
	private NhanVien nhanVien;
	
	
	/**
	 * @return the maTaiKhoan
	 */
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	/**
	 * @param maTaiKhoan the maTaiKhoan to set
	 */
	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return MatKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	/**
	 * @return the chucVu
	 */
	public String getChucVu() {
		return chucVu;
	}
	/**
	 * @param chucVu the chucVu to set
	 */
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	/**
	 * @param maTaiKhoan
	 * @param matKhau
	 * @param chucVu
	 */
	public TaiKhoan(String maTaiKhoan, String matKhau, String chucVu) {
		super();
		this.maTaiKhoan = maTaiKhoan;
		MatKhau = matKhau;
		this.chucVu = chucVu;
	}
	/**
	 * 
	 */
	public TaiKhoan() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaiKhoan [maTaiKhoan=");
		builder.append(maTaiKhoan);
		builder.append(", MatKhau=");
		builder.append(MatKhau);
		builder.append(", chucVu=");
		builder.append(chucVu);
		builder.append("]");
		return builder.toString();
	}

}
