package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import model.Admin;



public class AdminDao{
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cvtheque");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction tx = em.getTransaction();
	public static  boolean Add(Admin obj) {
		boolean res = false;
		
		if(res == true) {
			res = false;
		}
		else {
			tx.begin();
			try {
				em.persist(obj);
				tx.commit();
				res = true;
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return res;
		
		
				
	}
	
	
	public static Admin FindById(int id) {
		Admin a = em.find(Admin.class, id);
		return a;
	}
	public static List<Admin> FindAll() {
		Query query = em.createQuery("SELECT a FROM Admin a");
		List<Admin> lst = query.getResultList();
		return lst;
		
	}
	
	
	

}
