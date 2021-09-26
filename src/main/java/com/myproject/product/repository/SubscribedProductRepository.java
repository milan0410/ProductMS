package com.myproject.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.product.entity.SubscribedProduct;
@Repository
public interface SubscribedProductRepository extends JpaRepository<SubscribedProduct, Integer> {

}
