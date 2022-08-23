package com.example.Coupons.entities;

import jdk.jfr.Enabled;
import lombok.*;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;


@Entity
@Table(name= "companies")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(of="id")
@ToString
@Builder
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private int id;

    @Column(name = "company_name")
    private String name;

    @Column(name = "company_email")
    private String email;

    @Column(name = "company_password")
    private String password;

}
