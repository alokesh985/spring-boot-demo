package com.alakesh.simplewebapp.repositories;

import com.alakesh.simplewebapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Product, Integer> {
}
