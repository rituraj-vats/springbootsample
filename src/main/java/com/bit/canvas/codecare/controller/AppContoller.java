package com.bit.canvas.codecare.controller;

import com.bit.canvas.codecare.entities.Product;
import com.bit.canvas.codecare.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : r0v0040 (Rituraj.Vats@walmartlabs.com)
 * Date : 02/12/18
 */
@RestController
public class AppContoller {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/products",produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity getProducts() throws Exception {
        return ResponseEntity.ok(productService.getAllProduct());
    }


    @PostMapping(path="/product" ,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity addProduct(@RequestBody Product product) throws Exception {
        productService.addProduct(product);
        return ResponseEntity.ok("SUCCESS");
    }
}
