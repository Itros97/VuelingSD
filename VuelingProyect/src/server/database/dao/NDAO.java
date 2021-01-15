package server.database.dao;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;


import server.data.Cliente;
import server.data.Recibo;


public class NDAO {

	private static NDAO instance = null;
	
	PersistenceManagerFactory pmf;

	public NDAO() {
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
	}
	
	public static NDAO getInstance() {
		if (instance == null) {
			instance = new NDAO();
			
		}		
		
		return instance;
	}
	
	public Cliente getCliente(String  email) {
		
		PersistenceManager pm = pmf.getPersistenceManager();
		
		pm.setDetachAllOnCommit(true);
		
		Transaction tx = pm.currentTransaction();
		
		Cliente cliente = null;
		
		try {
			tx.begin();
			
			Extent<Cliente> extent = pm.getExtent(Cliente.class, true);
			for (Cliente c : extent) {
				if (c.getEmail().equals(email)) {
					cliente = c;
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
		
		return cliente;
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
				
				Recibo r = new Recibo("01",s);
				
				persistentManager.makePersistent(r);

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
