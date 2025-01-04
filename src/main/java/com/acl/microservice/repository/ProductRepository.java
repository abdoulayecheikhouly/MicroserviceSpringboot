package com.acl.microservice.repository;

import com.acl.microservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
//    Optional<Product> findByIdAndCategorieId(long id, long categorieId);
//    Optional<Product> findById(long id);
//    List<Product> findAllByCategory_Id(long categorieId);
}
