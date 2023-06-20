package config;



import dao.CustomerDao;
import dao.CustomerDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.CustomerService;
import services.CustomerServiceImpl;

@Configuration
@ComponentScan(basePackages = {"model","dao","services","helper"})

public class AppConfiguration {
   /* //Here we are using Bean for Loan Agreement Details
    @Bean
    LoanAgreementDAO loanAgreementDAO(){
        return new LoanAgreementDAOImpl ();
    }

    @Bean
    LoanService loanService(){
        return new LoanServiceImpl ();
    }*/

    //Here we are using for Bean for Customer Details
    @Bean
    CustomerDao customerDAO(){
        return new CustomerDaoImpl ();
    }
    @Bean
    CustomerService customerService(){
        return new CustomerServiceImpl ();
    }

}