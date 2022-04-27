package org.objectworld.book.customer.repository;

import java.util.List;

import javax.sql.DataSource;

import org.objectworld.book.customer.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("CustomerRepo")
public class CustomerRepo {

    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
    	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
	public List<Customer> findByCustomerMap() {

	    String sql = "SELECT * FROM CUSTOMERS";
	    List<Customer> customer = jdbcTemplate.query(sql,  new CustomerRowMapper());
	    return customer;

	}
}
