package com.tomasjimenez.ebankdo.ws.dataaccess;

import java.util.List;

import com.tomasjimenez.ebankdo.ws.domain.Customer;
import com.tomasjimenez.ebankdo.ws.domain.Product;

public interface CustomerDao {

	List<Customer> findByProfession(Product product);
}
