package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<IkmProduct, Integer> {
   
	IkmProduct findByName(@Param("name") String name);


	  // List<IkmProduct> findByName(@Param("name") String name);
     // IkmProduct findByCategory(@Param("category") String category);
    
}
