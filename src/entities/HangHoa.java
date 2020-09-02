package entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name = "getHangHoas", query = "select * from HangHoa", resultClass = HangHoa.class)
})
public class HangHoa {

	@Id
	private String maHH;
	// HH : Hang Hoa 
	private String tenHH;
	private String moTa;
	private double donGiaMua;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NCC_id", foreignKey = @ForeignKey())
	private NhaCungCap nhaCungCap;
	
	@OneToMany(mappedBy = "hangHoa",cascade = CascadeType.ALL)
	private List<ChiTietHoaDon> listCTHD;
	
	
	/**
	 * @return the maHH
	 */
	public String getMaHH() {
		return maHH;
	}
	/**
	 * @param maHH the maHH to set
	 */
	public void setMaHH(String maHH) {
		this.maHH = maHH;
	}
	/**
	 * @return the tenHH
	 */
	public String getTenHH() {
		return tenHH;
	}
	/**
	 * @param tenHH the tenHH to set
	 */
	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}
	/**
	 * @return the moTa
	 */
	public String getMoTa() {
		return moTa;
	}
	/**
	 * @param moTa the moTa to set
	 */
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	/**
	 * @return the donGiaMua
	 */
	public double getDonGiaMua() {
		return donGiaMua;
	}
	/**
	 * @param donGiaMua the donGiaMua to set
	 */
	public void setDonGiaMua(double donGiaMua) {
		this.donGiaMua = donGiaMua;
	}
	/**
	 * @param maHH
	 * @param tenHH
	 * @param moTa
	 * @param donGiaMua
	 */
	public HangHoa(String maHH, String tenHH, String moTa, double donGiaMua) {
		super();
		this.maHH = maHH;
		this.tenHH = tenHH;
		this.moTa = moTa;
		this.donGiaMua = donGiaMua;
	}
	/**
	 * 
	 */
	public HangHoa() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HangHoa [maHH=");
		builder.append(maHH);
		builder.append(", tenHH=");
		builder.append(tenHH);
		builder.append(", moTa=");
		builder.append(moTa);
		builder.append(", donGiaMua=");
		builder.append(donGiaMua);
		builder.append("]");
		return builder.toString();
	}
	
	
}
