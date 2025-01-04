package com.acl.microservice.repository;

import com.acl.microservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CategoryRepository extends JpaRepository<Category, Long>{

    //Optional<Category>findById(long id);
}
