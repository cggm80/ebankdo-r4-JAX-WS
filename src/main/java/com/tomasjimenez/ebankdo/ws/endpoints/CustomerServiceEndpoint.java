package com.tomasjimenez.ebankdo.ws.endpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomasjimenez.ebankdo.ws.domain.Customer;
import com.tomasjimenez.ebankdo.ws.domain.Product;
import com.tomasjimenez.ebankdo.ws.services.CustomerService;

// This will be the port name appended with the word port at the end of the name
@Service("CustomerServiceEndpoint")
// This will be the service name
@WebService(serviceName="CustomerService")
public class CustomerServiceEndpoint{

	@Autowired
	 private CustomerService customerService;

	@WebMethod
	public List<Customer> findByProduct(Product product){
		return customerService.findByProduct(product);
	}
}
