package com.example.Coupons.entities;

import javax.persistence.Table;
import java.util.Random;

@Table(name= "Categories")
public enum Category {

    FOOD, ELECTRICITY, RESTAURANT, VACATION, SPA, SPORTS, CINEMA, THEATER;


    public static Category getRandomCategory() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

