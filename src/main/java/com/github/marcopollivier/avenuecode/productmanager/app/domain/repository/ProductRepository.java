package com.github.marcopollivier.avenuecode.productmanager.app.domain.repository;

import com.github.marcopollivier.avenuecode.productmanager.app.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {



}