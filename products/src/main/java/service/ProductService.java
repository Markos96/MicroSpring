package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.ProductRepository;

import java.util.List;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
