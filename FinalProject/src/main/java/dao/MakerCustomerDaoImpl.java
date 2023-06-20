package dao;

import model.CustomerMaker;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MakerCustomerDaoImpl implements MakerCustomerDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public void registerCustomer(CustomerMaker customer) {
        Session session=factory.getCurrentSession ();
        session.save(customer);
    }

    @Override
    public void updateCustomer(CustomerMaker customer) {
        Session session=factory.getCurrentSession ();
        session.update(customer);

    }

    @Override
    public void deleteCustomer(CustomerMaker customer) {
        customer.setRecordStatus("D");
//        Session session=factory.getCurrentSession ();
        updateCustomer(customer);
    }

    @Override
    public void deleteCustomerByCode(String customerCode) {
        Session session=factory.getCurrentSession ();
        CustomerMaker customer = session.get(CustomerMaker.class, customerCode);
        session.delete(customer);
    }


    @Override
    public List<CustomerMaker> detailsOfCustomer() {
        Session session=factory.getCurrentSession ();
        return session.createQuery("from CustomerMaker", CustomerMaker.class).getResultList();
    }
    @Override
    public CustomerMaker getCustomerByCode(String customerCode) {
        Session session=factory.getCurrentSession ();
        CustomerMaker customer = session.get(CustomerMaker.class, customerCode);
        return customer;
    }

}
