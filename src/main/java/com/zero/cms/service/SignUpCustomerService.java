package com.zero.cms.service;

import com.zero.cms.domain.SignUpForm;
import com.zero.cms.domain.model.Customer;
import com.zero.cms.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpCustomerService {
    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form) {
        return customerRepository.save(Customer.from(form));
    }

}
