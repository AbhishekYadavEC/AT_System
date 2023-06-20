package service;

import model.CustomerChecker;
import model.CustomerMaker;

import javax.transaction.Transactional;
import java.util.List;
//@Component
@Transactional
public interface MakerCustomerService {
    public void registerCustomer(CustomerMaker customer);

    public void updateCustomer(CustomerMaker customer);

    public void deleteCustomer(CustomerMaker customer);

    CustomerMaker getCustomerByCode(String customerCode);
    public List<CustomerMaker> detailsOfCustomer();
    void deleteCustomerByCode(String customerCode);
}
