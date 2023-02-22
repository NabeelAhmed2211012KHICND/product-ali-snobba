package com.nabeel.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nabeel.product.Model.Product;

public interface IProductRepository extends JpaRepository <Product,Long> {
    
}
