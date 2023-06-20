package dao;

import model.CustomerChecker;

import java.util.List;

import model.CustomerMaker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import service.ObjectConverter;

@Repository
public class CheckerCustomerDaoImpl implements CheckerCustomerDao {
    @Autowired
    private SessionFactory factory;

    @Override
    public boolean insertAuthorizedRecord(CustomerMaker customerMaker) {
        try {
            CustomerChecker customerChecker = ObjectConverter.convertIntoChecker (customerMaker);
            customerChecker.setRecordStatus ("A");
            customerChecker.setAuthorizedBy ("CHECKER");
            Session session = factory.getCurrentSession ();
            session.save(customerChecker);
            session.delete (customerMaker);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CustomerChecker> showAllCustomerList() {
        try {
            Session session = factory.getCurrentSession ();
            return session.createQuery("FROM CustomerChecker", CustomerChecker.class).getResultList ();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateAuthorizedRecord(CustomerChecker customer) {
        try {
            Session session = factory.getCurrentSession ();
            session.update(customer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public CustomerChecker getCustomerByCode(String customerCode) {
        try{
            Session session= factory.getCurrentSession ( );
            session.save (customerCode);
            return null;
        }catch (Exception e){
            e.printStackTrace (  );
            return null;
        }
    }

}
