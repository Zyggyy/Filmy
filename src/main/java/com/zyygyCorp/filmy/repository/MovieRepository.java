package com.zyygyCorp.filmy.repository;

import com.zyygyCorp.filmy.database.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {

    Movie findMovieByName(String name);
}

