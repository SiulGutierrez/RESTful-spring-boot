package mx.com.rootcrash.restful.services.impl;

import mx.com.rootcrash.restful.dao.CustomerDAO;
import mx.com.rootcrash.restful.entities.Customer;
import mx.com.rootcrash.restful.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerDAO.findAll();
    }

    @Override
    public Customer getInfoOneCustomer(Long idCustomer) {
        return customerDAO.findById(idCustomer).get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public void deleteCustomer(Long idCustomer) {
        customerDAO.deleteById(idCustomer);
    }

    @Override
    public void softDeleteCustomer(Long idCustomer) {

    }
}
