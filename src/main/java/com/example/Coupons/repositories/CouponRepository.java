package com.example.Coupons.repositories;

import com.example.Coupons.entities.Coupon;
import com.example.Coupons.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
}
