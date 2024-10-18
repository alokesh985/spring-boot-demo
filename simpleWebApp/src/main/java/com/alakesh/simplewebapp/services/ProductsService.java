package com.alakesh.simplewebapp.services;

import com.alakesh.simplewebapp.models.Product;
import com.alakesh.simplewebapp.repositories.ProductsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private final ProductsRepo repo;

    ProductsService(ProductsRepo repo) {
        // Injection dependency of ProductsRepo into this class using constructor dependency
        this.repo = repo;
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        // This will find and match the primary key, and then replace it
        repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
}
