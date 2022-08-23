package com.example.Coupons.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name= "coupons")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of="id")
@ToString
@Builder
public class Coupon {


    @Id
    @GeneratedValue
    @Column(name = "coupon_id")
    private int ID;

//
//    @ManyToOne(fetch = FetchType.LAZY,
//            cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    @JsonIgnoreProperties({"coupons"})
    @Column(name = "company_id")
    private int companyID;

    @Column(name = "coupon_category")
    @Enumerated (EnumType.ORDINAL)
    private Locale.Category category;

    @Column(name = "coupon_title")
    private String title;

    @Column(name = "coupon_description")
    private String description;

    @Column(name = "coupon_start_date")
    private java.util.Date startDate;

    @Column(name = "coupon_end_date")
    private java.util.Date endDate;

    @Column(name = "coupon_amount")
    private int amount;

    @Column(name = "coupon_price")
    private double price;

    @Column(name = "coupon_image")
    private String image;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "customers_coupons", joinColumns = @JoinColumn(name = "coupon_id"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
    List<Customer> customers = new ArrayList<Customer>();


}
