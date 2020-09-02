package entities;

import javax.persistence.Embeddable;

@Embeddable
public class DiaChi {
	
	private String sonha;
	private String duong;
	private String phuong;
	private String quan;
	private String thanhpho;
	/**
	 * @return the sonha
	 */
	public String getSonha() {
		return sonha;
	}
	/**
	 * @param sonha the sonha to set
	 */
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	/**
	 * @return the duong
	 */
	public String getDuong() {
		return duong;
	}
	/**
	 * @param duong the duong to set
	 */
	public void setDuong(String duong) {
		this.duong = duong;
	}
	/**
	 * @return the phuong
	 */
	public String getPhuong() {
		return phuong;
	}
	/**
	 * @param phuong the phuong to set
	 */
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	/**
	 * @return the quan
	 */
	public String getQuan() {
		return quan;
	}
	/**
	 * @param quan the quan to set
	 */
	public void setQuan(String quan) {
		this.quan = quan;
	}
	/**
	 * @return the thanhpho
	 */
	public String getThanhpho() {
		return thanhpho;
	}
	/**
	 * @param thanhpho the thanhpho to set
	 */
	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}
	/**
	 * @param sonha
	 * @param duong
	 * @param phuong
	 * @param quan
	 * @param thanhpho
	 */
	public DiaChi(String sonha, String duong, String phuong, String quan, String thanhpho) {
		super();
		this.sonha = sonha;
		this.duong = duong;
		this.phuong = phuong;
		this.quan = quan;
		this.thanhpho = thanhpho;
	}
	/**
	 * 
	 */
	public DiaChi() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DiaChi [sonha=");
		builder.append(sonha);
		builder.append(", duong=");
		builder.append(duong);
		builder.append(", phuong=");
		builder.append(phuong);
		builder.append(", quan=");
		builder.append(quan);
		builder.append(", thanhpho=");
		builder.append(thanhpho);
		builder.append("]");
		return builder.toString();
	}
	
	
}
