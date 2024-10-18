package com.alakesh.simplewebapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
}
