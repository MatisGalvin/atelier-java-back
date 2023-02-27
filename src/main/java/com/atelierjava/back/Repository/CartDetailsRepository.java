package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.CartDetails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CartDetailsRepository extends CrudRepository<CartDetails, Long> {
    @Transactional
    @Modifying
    @Query("SELECT cd FROM CartDetails cd, Cart c WHERE cd.cart.id = c.id AND c.user.id = ?1")
    Iterable<CartDetails> findByUserId(Long ID);
}
