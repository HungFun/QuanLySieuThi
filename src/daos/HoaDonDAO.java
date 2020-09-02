package daos;

import java.util.List;

import entities.HoaDon;

public interface HoaDonDAO {
	void themHoaDon(HoaDon hd);
	void xoaHoaDon(HoaDon hd);
	void suaHoaDon(HoaDon hd);
	HoaDon getHoaDon(String maHD);
	List<HoaDon> getDSHoaDon(int max);
}
