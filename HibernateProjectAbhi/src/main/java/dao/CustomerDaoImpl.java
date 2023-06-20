package dao;

import model.Customer;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public void update(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
    }

    @Override
    public void delete(Customer customer) {
        sessionFactory.getCurrentSession().delete(customer);
    }

    @Override
    public Customer getById(int id) {
        return sessionFactory.getCurrentSession().get(Customer.class, id);
    }

    @Override
    public List<Customer> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Customer", Customer.class).getResultList();
    }
}
