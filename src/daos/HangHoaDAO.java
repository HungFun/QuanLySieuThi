package daos;

import java.util.List;

import entities.HangHoa;

public interface HangHoaDAO {
		void themHangHoa(HangHoa hh);
		void xoaHangHoa(HangHoa hh);
		void suaHangHoa(HangHoa hh);
		HangHoa getHangHoa(String maHH);
		List<HangHoa> getDSHangHoa(int max);
}
