package dao;

import model.CustomerChecker;
import model.CustomerMaker;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Component
public interface CheckerCustomerDao {
    boolean insertAuthorizedRecord(CustomerMaker customer);
    List<CustomerChecker> showAllCustomerList();
    boolean updateAuthorizedRecord(CustomerChecker customer);
    CustomerChecker getCustomerByCode(String customerCode);
}
