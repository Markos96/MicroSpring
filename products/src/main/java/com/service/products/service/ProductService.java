package com.service.products.service;

import com.service.products.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.service.products.repository.ProductRepository;

import java.util.List;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product findByProduct(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
