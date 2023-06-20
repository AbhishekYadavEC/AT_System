package service;

import model.CustomerMaker;
import model.CustomerChecker;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
//@Component
@Transactional
public interface CheckerCustomerService {
    boolean insertAuthorizedRecord(CustomerMaker customer);
    List<CustomerChecker> showAllCustomerList();
    boolean updateAuthorizedRecord(CustomerChecker customer);
    CustomerChecker getAllCustomer(CustomerMaker customer);
    CustomerChecker getCustomerByCode(String customerCode);

    void rejectedCustomer(CustomerMaker customerMaker);

}
