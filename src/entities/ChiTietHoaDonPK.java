package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonPK implements Serializable {

	@Column(name = "hanghoa_id")
	private String hangHoa;
	@Column(name = "hoadon_id")
	private String hoaDon;
	/**
	 * @return the hangHoa
	 */
	public String getHangHoa() {
		return hangHoa;
	}
	/**
	 * @param hangHoa the hangHoa to set
	 */
	public void setHangHoa(String hangHoa) {
		this.hangHoa = hangHoa;
	}
	/**
	 * @return the hoaDon
	 */
	public String getHoaDon() {
		return hoaDon;
	}
	/**
	 * @param hoaDon the hoaDon to set
	 */
	public void setHoaDon(String hoaDon) {
		this.hoaDon = hoaDon;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hangHoa == null) ? 0 : hangHoa.hashCode());
		result = prime * result + ((hoaDon == null) ? 0 : hoaDon.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDonPK other = (ChiTietHoaDonPK) obj;
		if (hangHoa == null) {
			if (other.hangHoa != null)
				return false;
		} else if (!hangHoa.equals(other.hangHoa))
			return false;
		if (hoaDon == null) {
			if (other.hoaDon != null)
				return false;
		} else if (!hoaDon.equals(other.hoaDon))
			return false;
		return true;
	}
	/**
	 * @param hangHoa
	 * @param hoaDon
	 */
	public ChiTietHoaDonPK(String hangHoa, String hoaDon) {
		super();
		this.hangHoa = hangHoa;
		this.hoaDon = hoaDon;
	}
	/**
	 * 
	 */
	public ChiTietHoaDonPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChiTietHoaDonPK [hangHoa=");
		builder.append(hangHoa);
		builder.append(", hoaDon=");
		builder.append(hoaDon);
		builder.append("]");
		return builder.toString();
	}
	
	
}
