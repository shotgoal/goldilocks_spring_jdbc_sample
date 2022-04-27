package org.objectworld.book.customer.repository;

import org.objectworld.book.customer.domain.Customer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerRowMapper implements RowMapper<Customer>  {

	 @Override
	    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

	        Customer customer = new Customer();
	        customer.setFirstName(rs.getString("first_Name"));
	        customer.setLastName(rs.getString("last_Name"));
	        customer.setLast_modified_date(rs.getTimestamp("last_modified_date").toString());
	        customer.setEmail(rs.getString("email"));
	        customer.setTelephone(rs.getString("telephone"));
	        return customer;
	    }
}
