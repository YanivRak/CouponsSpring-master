package com.example.Coupons.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name= "customers")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of="id")
@ToString
@Builder
public class Customer {


    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private int ID;

    @Column(name = "customer_first_name")
    private String firstName;

    @Column(name = "customer_last_name")
    private String lastName;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_password")
    private String password;

//    @Column(name = "customer_coupon")
//    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy = "customers")
    private ArrayList<Coupon> coupons;


}
