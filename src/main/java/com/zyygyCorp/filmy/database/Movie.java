package com.zyygyCorp.filmy.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;


@Data
@Table
@Entity
public class Movie {
    @Id
    private String id;
    private String name;
    private String description;
    private String director;

    public Movie() {
        this.id = UUID.randomUUID().toString();
    }

}
