package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.TaiKhoanDAO;
import entities.TaiKhoan;

public class TaiKhoanImpls implements TaiKhoanDAO {
	private EntityManager em;
	/**
	 * @param em
	 */
	public TaiKhoanImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themTaiKhoan(TaiKhoan tk) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(tk);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaTaiKhoan(TaiKhoan tk) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(TaiKhoan.class, tk.getMaTaiKhoan()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaTaiKhoan(TaiKhoan tk) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(tk);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public TaiKhoan getTaiKhoan(String tentk) {
		// TODO Auto-generated method stub
		
		return em.find(TaiKhoan.class,tentk);
	}

	@Override
	public List<TaiKhoan> getDSTaiKhoan(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getTaiKhoans",TaiKhoan.class)
				.setMaxResults(max)
				.getResultList();
	}

}
