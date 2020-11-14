package org.datanucleus.samples.jdo.tutorial;


import java.util.Date;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;







public class Main {

	public static void main(String[] args) {
		try {
			PersistenceManagerFactory persistentManagerFactory = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
			
			//Insert data in the DB
			PersistenceManager persistentManager = persistentManagerFactory.getPersistenceManager();				
			Transaction transaction = persistentManager.currentTransaction();				
			
			try {
				
			    transaction.begin();
			    
			    
			    Usuario u1 = new Usuario(1,"usuario1", "Ander", "Perez", "anderPerez@gmail.com");
			    Usuario u2 = new Usuario(2,"usuario2", "Aitor", "Fernandez", "aitorFernandez@gmail.com");
			    Usuario u3 = new Usuario(3,"usuario3", "Iker", "Lopez", "ikerLopez@gmail.com");
			    Usuario u4 = new Usuario(4,"usuario4", "Leire", "Garcia", "leireGarcia@gmail.com");
			    Usuario[] pasajeros = new Usuario[4];
			    pasajeros[0] = u1; pasajeros[1] = u2; pasajeros[2] = u3; pasajeros[3] = u4;
			    Pago pago = new Pago(1,150.52);
			    Aeropuerto ap1 = new Aeropuerto(1,"Loiu");
			    Aeropuerto ap2 = new Aeropuerto(2, "Barajas");
			    Aerolinea al1 = new Aerolinea(1,"vueling");
			    Vuelo v1 = new Vuelo(1, 22, 75.60,new Date(120/10/14), new Date(120/10/14));//anyo(empieza en 1900), mes(0-11), dia(1-31)
			    Reserva r1 = new Reserva(1,4,pasajeros,180.99);
			    
			    
			    persistentManager.makePersistent(u1);
			    persistentManager.makePersistent(pago);
			    persistentManager.makePersistent(r1);

			
			    
			    transaction.commit();
			} catch(Exception ex) {
				System.err.println("* Exception inserting data into db: " + ex.getMessage());
			} finally {		    
				if (transaction.isActive()) {
			        transaction.rollback();
			    }
			    
			    persistentManager.close();
			}
			
			//Select data using a Query
			persistentManager = persistentManagerFactory.getPersistenceManager();
			transaction = persistentManager.currentTransaction();
				
			try {
			    transaction.begin();
	
//			    
			    @SuppressWarnings("unchecked")
				Query<Usuario> q = persistentManager.newQuery("SELECT FROM " + Usuario.class.getName() + " WHERE username = 'usuario1'");
			    
			 
			    for (Usuario c: q.executeList()) {
			    	
			    	System.out.println("Selected user: "+ c.getNombre());
			    	
			    }
//			  
	
			    transaction.commit();
			} catch(Exception ex) {
				System.err.println("* Exception executing a query: " + ex.getMessage());
			} finally {
				if (transaction.isActive()) {
			        transaction.rollback();
			    }
	
			    persistentManager.close();
			}
			
			
			 try {
				    transaction.begin();
		
				    
				    Extent<Reserva> reservas = persistentManager.getExtent(Reserva.class);
				    
				    for (Reserva r : reservas) {
				    	r.cambiarPrecio(999);
				    }
		
				    transaction.commit();
				} catch(Exception ex) {
					System.err.println("* Exception executing a query: " + ex.getMessage());
				} finally {
					if (transaction.isActive()) {
				        transaction.rollback();
				    }
		
				    persistentManager.close();
				}
			 

			 try {
				    transaction.begin();
		
				    
				    Extent<Reserva> reservas = persistentManager.getExtent(Reserva.class);
				    
				    for (Reserva r : reservas) {
				    	persistentManager.deletePersistent(r);
				    }
		
				    transaction.commit();
				} catch(Exception ex) {
					System.err.println("* Exception executing a query: " + ex.getMessage());
				} finally {
					if (transaction.isActive()) {
				        transaction.rollback();
				    }
		
				    persistentManager.close();
				}
           
           
		} catch (Exception ex) {
			System.err.println("* Exception: " + ex.getMessage());
		}
	}
}