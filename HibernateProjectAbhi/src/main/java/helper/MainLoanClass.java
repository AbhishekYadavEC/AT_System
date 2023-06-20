package helper;
/*Code Is Developed By Abhishek*/

import model.LoanAgreement;
import model.LoanStatus;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.time.LocalDate;

public class MainLoanClass {
    public static void main(String[] args) {

        // Create a Hibernate configuration
        Configuration configuration=new Configuration ();
        configuration.configure();

        // Create a session factory from the configuration
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create a session from the session factory
        Session session = sessionFactory.openSession();

        // Create a new loan agreement
        LoanAgreement loanAgreement = new LoanAgreement();
        loanAgreement.setLoanProduct("Home Loan");
        loanAgreement.setLoanAmount(1000000);
        loanAgreement.setLoanStatus(LoanStatus.ACTIVE);
        loanAgreement.setTenure(240);
        loanAgreement.setRoi(8.5);
        loanAgreement.setEmiPerMonth(9000);
        loanAgreement.setLoanDisbursalDate(LocalDate.of(2021, 1, 1));
        loanAgreement.setRepaymentFrequency(1);

        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        // Save the loan agreement
        session.save(loanAgreement);

        // Commit the transaction
        transaction.commit();

        // Get the loan agreement by id
        int loanAgreementId = loanAgreement.getLoanAgreementId();
        LoanAgreement retrievedLoanAgreement = session.get(LoanAgreement.class, loanAgreementId);
        System.out.println("Retrieved loan agreement: " + retrievedLoanAgreement);

        // Update the loan agreement
        retrievedLoanAgreement.setLoanAmount(1200000);

        // Begin a new transaction
        transaction = session.beginTransaction();

        // Update the loan agreement
        session.update(retrievedLoanAgreement);

        // Commit the transaction
        transaction.commit();
        // Get all loan agreements
        System.out.println("All loan agreements:");
        for (LoanAgreement la : session.createQuery("from LoanAgreement", LoanAgreement.class).list()) {
            System.out.println(la);
        }

         //Delete the loan agreement
        transaction = session.beginTransaction();
        session.delete(retrievedLoanAgreement);
        transaction.commit();

        // Close the session and the session factory
        session.close();
        sessionFactory.close();
    }
}
