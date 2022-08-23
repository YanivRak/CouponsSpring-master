package com.example.Coupons.repositories;

import com.example.Coupons.entities.Company;
import com.example.Coupons.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Integer> {

}
