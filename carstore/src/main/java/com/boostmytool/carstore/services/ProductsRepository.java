package com.boostmytool.carstore.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boostmytool.carstore.models.Product;
public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
