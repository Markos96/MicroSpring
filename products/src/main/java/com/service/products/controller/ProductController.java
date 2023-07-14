package com.service.products.controller;

import com.service.products.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.service.products.service.ProductService;
import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/getByProduct/{id}")
    public ResponseEntity<Product> getByProduct(@PathVariable Integer id){
        return new ResponseEntity<>(productService.findByProduct(id), HttpStatus.OK);
    }

    @PostMapping("/saveProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);
    }

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }


}
