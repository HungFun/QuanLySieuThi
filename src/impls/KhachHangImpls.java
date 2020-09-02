package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.KhachHangDAO;
import entities.KhachHang;

public class KhachHangImpls implements KhachHangDAO {
	private EntityManager em;
	
	/**
	 * @param em
	 */
	public KhachHangImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themKhachHang(KhachHang kh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(kh);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaKhachHang(KhachHang kh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(KhachHang.class,kh.getMaKH()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaKhachHang(KhachHang kh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(kh);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public KhachHang getKhachHang(String maKH) {
		// TODO Auto-generated method stub
		return em.find(KhachHang.class,maKH);
	}

	@Override
	public List<KhachHang> getDSKhachHang(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getKhachHangs",KhachHang.class)
				.setMaxResults(max)
				.getResultList();
	}

}
