package dao;

import model.Customer;


import java.util.List;

public interface CustomerDao {

    void add(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    Customer getById(int id);

    List<Customer> getAll();

}


