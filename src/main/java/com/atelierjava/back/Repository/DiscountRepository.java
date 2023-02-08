package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Discount;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepository extends CrudRepository<Discount, Integer> {
}
