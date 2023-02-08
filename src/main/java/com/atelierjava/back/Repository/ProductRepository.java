package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
