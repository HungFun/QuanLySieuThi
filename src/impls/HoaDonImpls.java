package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.HoaDonDAO;
import entities.HoaDon;

public class HoaDonImpls implements HoaDonDAO {
	private EntityManager em;
	
	/**
	 * @param em
	 */
	public HoaDonImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themHoaDon(HoaDon hd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(hd);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaHoaDon(HoaDon hd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(HoaDon.class, hd.getMaHD()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaHoaDon(HoaDon hd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(hd);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public HoaDon getHoaDon(String maHD) {
		// TODO Auto-generated method stub
		return em.find(HoaDon.class,maHD);
	}

	@Override
	public List<HoaDon> getDSHoaDon(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getHoaDons",HoaDon.class)
				.setMaxResults(max)
				.getResultList();
	}

}
