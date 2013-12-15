package com.tomasjimenez.ebankdo.ws.dataaccess;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tomasjimenez.ebankdo.ws.domain.Customer;
import com.tomasjimenez.ebankdo.ws.domain.Product;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> findByProfession(Product product) {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Customer.class,"per")
				.createAlias("per.product", "pro")
				.add(Restrictions.eq("pro.name", product.getName()))
				.list();
	}
}
