package top.BinGCU.dao;

import org.springframework.stereotype.Repository;
import top.BinGCU.pojo.Customer;

@Repository
public interface CustomerMapper {

    Customer getCustomerByName(String name);

    int insertOneCustomer(Customer customer);

    int deleteCustomersByName(String name);
}
