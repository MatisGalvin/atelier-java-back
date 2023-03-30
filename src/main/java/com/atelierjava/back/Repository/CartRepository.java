package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Cart;
import com.atelierjava.back.Entity.CartDetails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CartRepository extends CrudRepository<Cart, Long> {
    @Transactional
    @Query("SELECT cart FROM Cart cart WHERE cart.user.id = ?1")
    Cart findByUserId(Long ID);

}
