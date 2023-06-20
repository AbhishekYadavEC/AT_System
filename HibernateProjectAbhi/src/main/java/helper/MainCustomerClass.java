package helper;


import model.Address;
import model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


import java.time.LocalDate;

import java.util.*;
public class MainCustomerClass {

    public static void main(String[] args) {
        // Create session factory
        Configuration configuration = new Configuration ( );
        configuration.addAnnotatedClass (Customer.class).addAnnotatedClass (Address.class).configure ();
        SessionFactory sessionFactory = configuration.buildSessionFactory ();
        // Create session

        // Perform CRUD operations
        Session session = null;
        try (sessionFactory) {
            session = sessionFactory.getCurrentSession ( );
            session.beginTransaction ( );

            // Create a new customer
            Customer customer = new Customer ( );
            customer.setName ("John Doe");
            customer.setDob (LocalDate.of (1990, 1, 1));
            customer.setPhoneNumbers (Arrays.asList ("1234567890", "0987654321"));
            customer.setEmailAddressSet (new HashSet<> (Arrays.asList ("john.doe@example.com", "jdoe@example.com")));
            Address address = new Address ( );
            address.setAddressId (69);
            address.setCity ("New York");
            address.setState ("NY");
            address.setZip (2300023);
            customer.setAddress (address);
            customer.setMonthlyIncome (5000.0);
            customer.setProfession ("Software Engineer");
            customer.setDesignation ("Senior Developer");
            customer.setCompanyName ("ABC Company");

            // Save the customer
            session.save (customer.getAddress ());
            session.save (customer);

//            // Retrieve the customer by id
//            int customerId = customer.getCustId ( );
//            Customer retrievedCustomer = session.get (Customer.class, customerId);
//            System.out.println ("Retrieved customer: " + retrievedCustomer);
//
//            // Update the customer
//            retrievedCustomer.setMonthlyIncome (6000.0);
//            session.update (retrievedCustomer);
//
//            // Delete the customer
//            session.delete (retrievedCustomer);
//
//            session.getTransaction ( ).commit ( );
        } catch (Exception e) {

            e.printStackTrace ( );
        }
    }
}
