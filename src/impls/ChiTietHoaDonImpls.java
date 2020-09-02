package impls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import daos.ChiTietHoaDonDAO;
import entities.ChiTietHoaDon;

public class ChiTietHoaDonImpls implements ChiTietHoaDonDAO {
	private EntityManager em;
		
	/**
	 * @param em
	 */
	public ChiTietHoaDonImpls(EntityManager em) {
		this.em = em;
	}

	@Override
	public void themChiTietHoaDon(ChiTietHoaDon cthd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(cthd);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void xoaChietHoaDon(ChiTietHoaDon cthd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove((em.createNamedQuery("getChiTietHoaDon",ChiTietHoaDon.class).getSingleResult()));
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public void suaChiTietHoaDon(ChiTietHoaDon cthd) {
		// TODO Auto-generated method stub
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(cthd);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
	}

	@Override
	public ChiTietHoaDon getChiTietHoaDon(String maHD, String maHH) {
		// TODO Auto-generated method stub
		return em.createQuery("select * from ChiTietHoaDon cthd where cthd.hoadon_id =: x and cthd.hanghoa_id =: y ", ChiTietHoaDon.class)
				.setParameter("x",maHD).setParameter("y",maHH).getSingleResult();
	}

	@Override
	public List<ChiTietHoaDon> getDSChiTietHoaDon(int max) {
		// TODO Auto-generated method stub
		return em.createNamedQuery("getChiTietHoaDons",ChiTietHoaDon.class)
				.setMaxResults(max)
				.getResultList();
	}

}
