package hoa.shopping.service;

import hoa.shopping.entities.Product;
import hoa.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(int id){
        return productRepository.findById(id);
    }
}
