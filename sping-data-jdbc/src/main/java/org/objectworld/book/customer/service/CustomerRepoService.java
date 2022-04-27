package org.objectworld.book.customer.service;

import java.util.List;

import org.objectworld.book.customer.domain.Customer;
import org.objectworld.book.customer.repository.CustomerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerRepoService {

	private final Logger log = LoggerFactory.getLogger(CustomerRepoService.class);
	private final CustomerRepo customerRepo;
 
    public CustomerRepoService(CustomerRepo customerRepo) {
       this.customerRepo = customerRepo;
    }

    public List<Customer> SelectCustMap() {
        return customerRepo.findByCustomerMap();
    }
}
