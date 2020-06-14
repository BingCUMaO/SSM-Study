package daoTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.BinGCU.dao.CustomerMapper;
import top.BinGCU.pojo.Customer;

public class CustomerTest {

    @Test
    public void getCustomerByNameTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);

        System.out.println(customerMapper.getCustomerByName("zhangsan"));
    }

    @Test
    public void insertOneCustomerTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);

        Customer cstm = new Customer("小陈", 20);
        System.out.println(customerMapper.insertOneCustomer(cstm));
    }

    @Test
    public void deleteCustomersByNameTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);

        System.out.println(customerMapper.deleteCustomersByName("小陈"));
    }
}
