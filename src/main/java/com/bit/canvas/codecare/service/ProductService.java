package com.bit.canvas.codecare.service;

import com.bit.canvas.codecare.entities.Product;
import com.bit.canvas.codecare.repo.ProductRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;

/**
 * @author : r0v0040 (Rituraj.Vats@walmartlabs.com)
 * Date : 02/12/18
 */
@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    private static final Logger LOGGER = LogManager.getLogger(ProductService.class);

    @Transactional
    public void addProduct(Product product) throws Exception {
        try{
            product.setId(UUID.randomUUID().toString());
            productRepo.save(product);
        }catch (Exception e){
            LOGGER.error("Error while saving Product",e);
            throw new Exception("Oops.. something went wrong. We couldn't add product");
        }
    }

    @Transactional (readOnly = true)
    public List<Product> getAllProduct() throws Exception {
        List<Product> result;
        try{
            result = productRepo.findAll();
        }catch (Exception e){
            LOGGER.error("Error while fetching Product",e);
            throw new Exception("Oops.. something went wrong. We couldn't get products");
        }
        return result;
    }



    @PostConstruct
    @Transactional
    public void testData(){
        Product product1 = new Product(UUID.randomUUID().toString(),"NOKIA",250);
        Product product2 = new Product(UUID.randomUUID().toString(),"MOTOG",189);
        Product product3 = new Product(UUID.randomUUID().toString(),"IPHONE",520);

        productRepo.save(product1);
        productRepo.save(product2);
        productRepo.save(product3);
    }
}
