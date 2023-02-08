package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
