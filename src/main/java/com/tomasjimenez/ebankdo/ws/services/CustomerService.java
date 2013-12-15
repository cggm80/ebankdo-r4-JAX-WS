package com.tomasjimenez.ebankdo.ws.services;

import java.util.List;

import com.tomasjimenez.ebankdo.ws.domain.Customer;
import com.tomasjimenez.ebankdo.ws.domain.Product;

public interface CustomerService {
	public abstract List<Customer> findByProduct(Product product);
}