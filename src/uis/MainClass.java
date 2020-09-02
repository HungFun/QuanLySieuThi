package uis;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.omg.CosNaming.IstringHelper;

import daos.ChiTietHoaDonDAO;
import daos.HangHoaDAO;
import daos.HoaDonDAO;
import daos.TaiKhoanDAO;
import entities.ChiTietHoaDon;
import entities.HangHoa;
import entities.HoaDon;
import entities.TaiKhoan;
import impls.ChiTietHoaDonImpls;
import impls.HangHoaImpls;
import impls.HoaDonImpls;
import impls.TaiKhoanImpls;

public class MainClass {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("QuanLySieuThi_ORM")
				.createEntityManager();
//		TaiKhoan tk1 = new TaiKhoan("111","Drag","Ban Hang");
//		TaiKhoan tk2 = new TaiKhoan("222","MaNa","Ban Hang");
//		TaiKhoan tk3 = new TaiKhoan("333","Ukm","Quan Ly");
//		TaiKhoanDAO taiKhoanDAO = new TaiKhoanImpls(em);
//		taiKhoanDAO.themTaiKhoan(tk1);
//		taiKhoanDAO.themTaiKhoan(tk2);
//		taiKhoanDAO.themTaiKhoan(tk3);
//		
//		TaiKhoan tk4 = taiKhoanDAO.getTaiKhoan("111");
//		System.out.println(tk4);
//		
//		System.out.println("===========");
//		List<TaiKhoan> listTK = taiKhoanDAO.getDSTaiKhoan(10);
//		System.out.println(listTK);
		
//		taiKhoanDAO.xoaTaiKhoan(tk);
		
		HoaDonDAO hoaDonDAO = new HoaDonImpls(em);
		HangHoaDAO hangHoaDAO = new HangHoaImpls(em);
		ChiTietHoaDonDAO chiTietHoaDonDAO = new ChiTietHoaDonImpls(em);
		
		HoaDon hd1 = new HoaDon("111",LocalDate.now());
		HangHoa hh1 = new HangHoa("222","Ly","Hoa",1500);
		ChiTietHoaDon cthd1 = new ChiTietHoaDon(hd1,hh1,2000,3);
		
		HoaDon hd2 = new HoaDon("333",LocalDate.now());
		HangHoa hh2 = new HangHoa("444","Lo","Vat dung",8000);
		ChiTietHoaDon cthd2 = new ChiTietHoaDon(hd2,hh2,12000,5);
		ChiTietHoaDon cthd3 = new ChiTietHoaDon(hd2,hh1,12000,5);
		
		hoaDonDAO.themHoaDon(hd1);
		hoaDonDAO.themHoaDon(hd2);
		
		hangHoaDAO.themHangHoa(hh1);
		hangHoaDAO.themHangHoa(hh2);
		
		chiTietHoaDonDAO.themChiTietHoaDon(cthd1);
//		chiTietHoaDonDAO.themChiTietHoaDon(cthd2);
//		chiTietHoaDonDAO.themChiTietHoaDon(cthd3);
//		
//		ChiTietHoaDon cthd4 = chiTietHoaDonDAO.getChiTietHoaDon(hd2.getMaHD(),hh1.getMaHH());
//		
//		System.out.println("----------------");
//		System.out.println(cthd4);
//		
//		System.out.println("----------------");
//		
//		List<ChiTietHoaDon> listCTHD = chiTietHoaDonDAO.getDSChiTietHoaDon(4);
//		System.out.println(listCTHD);
		
		
	}
	
	
}
