package daos;

import java.util.List;

import entities.ChiTietHoaDon;

public interface ChiTietHoaDonDAO {
	void themChiTietHoaDon(ChiTietHoaDon cthd);
	void xoaChietHoaDon(ChiTietHoaDon cthd);
	void suaChiTietHoaDon(ChiTietHoaDon cthd);
	ChiTietHoaDon getChiTietHoaDon(String maHD, String maHH);
	List<ChiTietHoaDon> getDSChiTietHoaDon(int max);
}
