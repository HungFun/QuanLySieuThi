package daos;

import java.util.List;

import entities.NhanVien;

public interface NhanVienDAO {
	void themNhanVien(NhanVien nv);
	void xoaNhanVien(NhanVien nv);
	void suaNhanVien(NhanVien nv);
	NhanVien getNhanVien(String maNV);
	List<NhanVien> getDSNhanVien(int max);
}
