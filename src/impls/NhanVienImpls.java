package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.NhanVienDAO;
import entities.NhanVien;
import entities.TaiKhoan;

public class NhanVienImpls implements NhanVienDAO {
	private EntityManager em;
	
	/**
	 * @param em
	 */
	public NhanVienImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themNhanVien(NhanVien nv) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(nv);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaNhanVien(NhanVien nv) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(TaiKhoan.class,nv.getMaNV()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaNhanVien(NhanVien nv) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(nv);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public NhanVien getNhanVien(String maNV) {
		// TODO Auto-generated method stub
		return em.find(NhanVien.class,maNV);
	}

	@Override
	public List<NhanVien> getDSNhanVien(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getNhanViens",NhanVien.class)
				.setMaxResults(max)
				.getResultList();
	}

}
