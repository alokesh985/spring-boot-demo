package com.alakesh.simplewebapp.controllers;

import com.alakesh.simplewebapp.models.Product;
import com.alakesh.simplewebapp.services.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    final ProductsService productsService;

    ProductController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productsService.getProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable int id) {
        return productsService.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productsService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        productsService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id) {
        productsService.deleteProduct(id);
    }
}
