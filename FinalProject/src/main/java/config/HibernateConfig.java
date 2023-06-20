package config;

import model.CustomerChecker;
import model.CustomerMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {
    @Bean
    public DataSource dataSource() {
        System.out.println("****************creating data source******************");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@10.1.50.198:1535:nsbt19c");
        dataSource.setUsername("training");
        dataSource.setPassword("training");
        return dataSource;
    }
    @Bean
    public LocalSessionFactoryBean getSessionFactoryBean() {
        System.out.println("*************getting session factory*************");
        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setDataSource(dataSource());
        bean.setHibernateProperties(hibernateProperties());
        bean.setAnnotatedClasses(CustomerMaker.class,
                CustomerChecker.class);
        return bean;
    }
    @Bean
    public Properties hibernateProperties() {
        Properties properties = new Properties ();
        properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("current_session_context_class", "thread");
        return properties;
    }
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactoryBean().getObject());
        return transactionManager;
    }
}
