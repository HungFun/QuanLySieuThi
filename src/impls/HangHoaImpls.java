package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.HangHoaDAO;
import entities.HangHoa;

public class HangHoaImpls implements HangHoaDAO {
	private EntityManager em;
	
	/**
	 * @param em
	 */
	public HangHoaImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themHangHoa(HangHoa hh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(hh);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaHangHoa(HangHoa hh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(HangHoa.class,hh.getMaHH()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaHangHoa(HangHoa hh) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(hh);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public HangHoa getHangHoa(String maHH) {
		// TODO Auto-generated method stub
		return em.find(HangHoa.class,maHH);
	}

	@Override
	public List<HangHoa> getDSHangHoa(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getHangHoas",HangHoa.class)
				.setMaxResults(max)
				.getResultList();
	}

}
