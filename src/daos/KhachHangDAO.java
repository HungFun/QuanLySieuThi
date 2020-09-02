package daos;

import java.util.List;

import entities.KhachHang;

public interface KhachHangDAO {
	void themKhachHang(KhachHang kh);
	void xoaKhachHang(KhachHang kh);
	void suaKhachHang(KhachHang kh);
	KhachHang getKhachHang(String maKH);
	List<KhachHang> getDSKhachHang(int max);
}
