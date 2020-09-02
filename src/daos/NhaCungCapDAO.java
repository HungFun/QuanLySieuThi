package daos;

import java.util.List;

import entities.NhaCungCap;

public interface NhaCungCapDAO {
	void themNhaCungCap(NhaCungCap ncc);
	void xoaNhaCungCap(NhaCungCap ncc);
	void suaNhaCungCap(NhaCungCap ncc);
	NhaCungCap getCungCap(String maNCC);
	List<NhaCungCap> getDSNhaCung(int max);
}
