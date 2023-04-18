package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ikm_product")
public class IkmProduct {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    //@Column(name="id")
	    private int id;

	    private String name;

	    private String description;

	    private String category;

	    private float price;
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }
	    public float getPrice() {
	        return price;
	    }

	    public void setPrice(float price) {
	        this.price = price;
	    }

}



/*
 * spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
 * spring.datasource.username=postgres spring.datasource.password=ikm
 */