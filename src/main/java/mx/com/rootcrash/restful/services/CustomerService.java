package mx.com.rootcrash.restful.services;

import mx.com.rootcrash.restful.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getInfoOneCustomer(Long idCustomer);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long idCustomer);
    void softDeleteCustomer(Long idCustomer);
}
