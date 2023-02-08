package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
