package com.zyygyCorp.filmy.service;

import com.zyygyCorp.filmy.database.Movie;
import com.zyygyCorp.filmy.repository.MovieRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {
    final MovieRepository moviesRepository;

    public Movie getMovieById(String id) {
        var movie = moviesRepository.findById(id);
        if(movie.isPresent()){
            return movie.get();
        } else throw new RuntimeException("no movie with id: " + id);
    }
    public void addMovie(Movie movie) {
        moviesRepository.save(movie);
    }

    public Movie getMovieByName(String name) {
        return moviesRepository.findMovieByName(name);
    }

    public List<Movie> getMovieList(){
        return (List<Movie>) moviesRepository.findAll();
    }

}
