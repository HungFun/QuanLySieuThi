package daos;

import java.util.List;

import entities.TaiKhoan;

public interface TaiKhoanDAO {
	void themTaiKhoan(TaiKhoan tk);
	void xoaTaiKhoan(TaiKhoan tk);
	void suaTaiKhoan(TaiKhoan tk);
	TaiKhoan getTaiKhoan(String tentk);
	List<TaiKhoan> getDSTaiKhoan(int max);
}
