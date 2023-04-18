package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestProduct {

    @Autowired
    ProductRepository pdtRepository;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<String> SaveProduct(@RequestParam(value = "name", required = true) String name,
                                              @RequestParam("category") String category, @RequestParam("price") float price) {

        ResponseEntity<String> response;
        IkmProduct ikmproduct;

        if (name == null) {

            response = new ResponseEntity<>("Name cannot be empty", HttpStatus.BAD_REQUEST);
            return response;

        } else {

            ikmproduct = pdtRepository.findByName(name);

            if (ikmproduct != null) {
                response = new ResponseEntity<>("This Product is Already Existing", HttpStatus.BAD_REQUEST);
                return response;

            } else if (!category.equalsIgnoreCase("book") || !category.equalsIgnoreCase("pencil") || !category.equalsIgnoreCase("pen")) {

                response = new ResponseEntity<>("Category sholud be either Book or Pen or Pencil", HttpStatus.BAD_REQUEST);
                return response;

            } else if (price < 0f || price > 100f) {

                response = new ResponseEntity<>("Price should  be within the Range of 0-100", HttpStatus.BAD_REQUEST);
                return response;

            } else {

                ikmproduct = new IkmProduct();
                ikmproduct.setCategory(category);
                ikmproduct.setName(name);
                ikmproduct.setPrice(price);
                pdtRepository.save(ikmproduct);

                response = new ResponseEntity<>("The Product is Saved Successfully and Product Id is " + ikmproduct.getId(), HttpStatus.CREATED);
                return response;
            }
        }
    }

}

