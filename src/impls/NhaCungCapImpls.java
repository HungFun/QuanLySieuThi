package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.NhaCungCapDAO;
import entities.NhaCungCap;

public class NhaCungCapImpls implements NhaCungCapDAO {
	private EntityManager em;
	
	
	/**
	 * @param em
	 */
	public NhaCungCapImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themNhaCungCap(NhaCungCap ncc) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(ncc);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaNhaCungCap(NhaCungCap ncc) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(em.find(NhaCungCap.class, ncc.getMaNCC()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaNhaCungCap(NhaCungCap ncc) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(ncc);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public NhaCungCap getCungCap(String maNCC) {
		// TODO Auto-generated method stub
		return em.find(NhaCungCap.class,maNCC);
	}

	@Override
	public List<NhaCungCap> getDSNhaCung(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getNhanCungCaps",NhaCungCap.class)
				.setMaxResults(max)
				.getResultList();
	}

}
