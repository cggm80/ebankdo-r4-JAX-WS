package com.tomasjimenez.ebankdo.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomasjimenez.ebankdo.ws.dataaccess.CustomerDao;
import com.tomasjimenez.ebankdo.ws.domain.Customer;
import com.tomasjimenez.ebankdo.ws.domain.Product;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> findByProduct(Product product) {
		
		return customerDao.findByProfession(product);
	}
}
