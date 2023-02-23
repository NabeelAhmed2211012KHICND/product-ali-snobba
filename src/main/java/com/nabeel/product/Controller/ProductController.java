package com.nabeel.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nabeel.product.Model.Product;
import com.nabeel.product.Repository.IProductRepository;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {
      
        @Autowired
        private IProductRepository repo;
    
        @PostMapping("/addproduct")
        public void addNewProduct(@RequestBody Product product) {
            repo.save(product);
        }
    
        @GetMapping("/getproduct")
        private List<Product> getProduct() {    
            return repo.findAll();
        }
    
        @GetMapping("/{id}")
        private Product getProduct(@PathVariable Long id) {
            return repo.findById(id).orElse(null);
        }

    }
    





