package dao;

import model.CustomerMaker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MakerCustomerDao {
    void registerCustomer(CustomerMaker customer);

    void updateCustomer(CustomerMaker customer);

    void deleteCustomer(CustomerMaker customer);
    void deleteCustomerByCode(String customerCode);
    
    CustomerMaker getCustomerByCode(String customerCode);

    List<CustomerMaker> detailsOfCustomer();

}
