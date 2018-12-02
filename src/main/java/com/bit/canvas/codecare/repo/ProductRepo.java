package com.bit.canvas.codecare.repo;

import com.bit.canvas.codecare.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : r0v0040 (Rituraj.Vats@walmartlabs.com)
 * Date : 02/12/18
 */
@Repository
public interface ProductRepo extends JpaRepository<Product,Long>{
}
