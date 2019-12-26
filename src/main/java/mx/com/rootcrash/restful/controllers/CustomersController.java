package mx.com.rootcrash.restful.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.com.rootcrash.restful.entities.Customer;
import mx.com.rootcrash.restful.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customers")
@Api(value = "CRUD Customer", tags = "Scheduler API")
public class CustomersController {

    private final CustomerService customerService;

    @Autowired
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String customer() {
        return "Hello";
    }

    @ApiOperation(value = "View a list of available customers", response = List.class)
    @RequestMapping(value = "/all-customers", method = RequestMethod.GET)
    public List<Customer> getDataCustomer() {
        return customerService.getAllCustomers();
    }

    @ApiOperation(value = "Get a customer by Id", response = Object.class)
    @RequestMapping(value = "/info-customer/{idCustomer}", method = RequestMethod.GET)
    public Customer getInfoCustomer(@PathVariable(value = "idCustomer") Long idCustomer) {
        return customerService.getInfoOneCustomer(idCustomer);
    }

    @RequestMapping(value = "/add-customer", method = RequestMethod.POST)
    public Customer addInfoCustomer(@RequestBody @Valid Customer customer) {
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/update-customer/{idCustomer}", method = RequestMethod.POST)
    public Customer updateInfoCustomer(@PathVariable(value = "idCustomer") Long idCustomer,
                                       @RequestBody @Valid Customer customer) {
        customer.setIdCustomer(idCustomer);
        return customerService.updateCustomer(customer);
    }

    @RequestMapping(value = "/delete-customer/{idCustomer}", method = RequestMethod.POST)
    public void deleteCustomer(@PathVariable(value = "idCustomer") Long idCustomer) {
        customerService.deleteCustomer(idCustomer);
    }
}
