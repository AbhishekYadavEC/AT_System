package service;

import dao.MakerCustomerDao;
import model.CustomerMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakerCustomerServiceImpl implements MakerCustomerService {
    @Autowired
    MakerCustomerDao makerCustomerDao;

    @Override
    public void registerCustomer(CustomerMaker customer) {
        makerCustomerDao.registerCustomer(customer);
    }

    @Override
    public void updateCustomer(CustomerMaker customer) {
        makerCustomerDao.updateCustomer (customer);
    }

    @Override
    public void deleteCustomer(CustomerMaker customer) {
        makerCustomerDao.deleteCustomer (customer);
    }

    @Override
    public CustomerMaker getCustomerByCode(String customerCode) {
        return makerCustomerDao.getCustomerByCode (customerCode);
    }


    @Override
    public List<CustomerMaker> detailsOfCustomer() {
        return makerCustomerDao.detailsOfCustomer ();
    }

    @Override
    public void deleteCustomerByCode(String customerCode) {
        makerCustomerDao.deleteCustomerByCode(customerCode);
    }
}
