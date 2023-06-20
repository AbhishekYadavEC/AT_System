package service;

import dao.CheckerCustomerDao;
import dao.MakerCustomerDao;
import model.CustomerMaker;
import model.CustomerChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class CheckerCustomerServiceImpl implements CheckerCustomerService {
    @Autowired
    CheckerCustomerDao checkerCustomerDao;
    @Autowired
    MakerCustomerDao makerCustomerDao;


    @Override
    public boolean insertAuthorizedRecord(CustomerMaker customer) {

        return checkerCustomerDao.insertAuthorizedRecord (customer);
    }

    @Override
    public List<CustomerChecker> showAllCustomerList() {
        return checkerCustomerDao.showAllCustomerList ( );
    }

    @Override
    public boolean updateAuthorizedRecord(CustomerChecker customer) {
        return checkerCustomerDao.updateAuthorizedRecord (customer);
    }

    @Override
    public CustomerChecker getAllCustomer(CustomerMaker customer) {
        CustomerChecker customer1 = new CustomerChecker ( );
        customer1.setCustomerId (customer.getCustomerId ( ));
        customer1.setCustomerCode (customer.getCustomerCode ( ));
        customer1.setCustomerName (customer.getCustomerName ( ));
        customer1.setCustomerAddr1 (customer.getCustomerAddr1 ( ));
        customer1.setCustomerAddr2 (customer.getCustomerAddr2 ( ));
        customer1.setCustomerEmail (customer.getCustomerEmail ( ));
        customer1.setCustomerContactNumber (customer.getCustomerContactNumber ( ));
        customer1.setCustomerPinCode (customer.getCustomerPinCode ( ));
        customer1.setPrimaryContactPerson (customer.getPrimaryContactPerson ( ));
        customer1.setRecordStatus (customer.getRecordStatus ( ));
        customer1.setActiveFlag (customer.getActiveFlag ( ));
        customer1.setCreateDate (customer.getCreateDate ( ));
        customer1.setCreatedBy (customer.getCreatedBy ( ));
        customer1.setModifiedDate (customer.getModifiedDate ( ));
        customer1.setModifiedBy (customer.getModifiedBy ( ));
//        customer1.setAuthorizedDate (customer.getAuthorizedDate ( ));
        customer1.setAuthorizedBy (customer.getAuthorizedBy ( ));
        return customer1;
    }

    @Override
    public CustomerChecker getCustomerByCode(String customerCode) {
        return checkerCustomerDao.getCustomerByCode (customerCode);
    }

    @Override
    public void rejectedCustomer(CustomerMaker customerMaker) {
        if (customerMaker.getRecordStatus() == "N")
            makerCustomerDao.updateCustomer(customerMaker.setRecordStatus ("NR"));
        else if (customerMaker.getRecordStatus() == "M")
            makerCustomerDao.updateCustomer(customerMaker.setRecordStatus("MR"));
        else if (customerMaker.getRecordStatus() == "D")
            makerCustomerDao.updateCustomer(customerMaker.setRecordStatus("DR"));
    }

}