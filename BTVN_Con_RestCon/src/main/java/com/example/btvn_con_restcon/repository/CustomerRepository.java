package com.example.btvn_con_restcon.repository;

import com.example.btvn_con_restcon.Model.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer, Integer> {
}
