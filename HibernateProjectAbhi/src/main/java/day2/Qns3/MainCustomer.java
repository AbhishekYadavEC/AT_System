package day2.Qns3;

import javax.persistence.*;

public class MainCustomer {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CustomerPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            // Strategy 1: Generate primary key using auto-increment in the database
            tx.begin();
            Customers customer1 = new Customers();
            em.persist(customer1);
            tx.commit();
            System.out.println("Customer ID with auto-increment strategy: " + customer1.getId());

            // Strategy 2: Generate primary key using UUID
            tx.begin();
            Customers customer2 = new Customers();
            em.persist(customer2);
            tx.commit();
            System.out.println("Customer UUID with UUID strategy: " + customer2.getUuid());

            // Strategy 3: Generate primary key using a sequence in the database
            tx.begin();
            Customers customer3 = new Customers();
            em.persist(customer3);
            tx.commit();
            System.out.println("Customer ID with sequence strategy: " + customer3.getIdWithSequence());
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
