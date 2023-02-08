package com.atelierjava.back.Repository;

import com.atelierjava.back.Entity.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
