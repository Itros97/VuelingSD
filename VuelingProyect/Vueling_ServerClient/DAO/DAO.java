package DAO;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import Data.Pago;
import Data.Usuario;



public class DAO {

	private static DAO instance = null;
	
	PersistenceManagerFactory pmf;

	public DAO() {
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	public static DAO getInstance() {
		if (instance == null) {
			instance = new DAO();
			
		}		
		
		return instance;
	}
	
	public Usuario getCliente(String  email) {
		
		PersistenceManager pm = pmf.getPersistenceManager();
		
		pm.setDetachAllOnCommit(true);
		
		Transaction tx = pm.currentTransaction();
		
		Usuario usuario = null;
		
		try {
			tx.begin();
			
			Extent<Usuario> extent = pm.getExtent(Usuario.class, true);
			for (Usuario u : extent) {
				if (u.getEmail().equals(email)) {
					usuario = u;
					break;
				}
			}
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (tx != null && tx.isActive()) {
				
	    		tx.rollback();
	    	}
			
			pm.close();
		}
		
		return usuario;
	}
	public void m(String s) {
		try {
			System.out.println("-----------DAO---------------");
			System.out.println(s);
			

			// Insert data in the DB
			PersistenceManager persistentManager = pmf.getPersistenceManager();
			Transaction transaction = persistentManager.currentTransaction();

			try {

				transaction.begin();
				
				Pago p = new Pago();
				
				persistentManager.makePersistent(p);

				transaction.commit();
			} catch (Exception ex) {
				System.err.println("* Exception inserting data into db: " + ex.getMessage());
			} finally {
				if (transaction.isActive()) {
					transaction.rollback();
				}

				persistentManager.close();
			}
	}catch (Exception e) {
		System.out.println("----------DAO ERROR----------");
		System.out.println(e.getMessage());
	}
	
}
}
