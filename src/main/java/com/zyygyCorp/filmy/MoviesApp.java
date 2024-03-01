package com.zyygyCorp.filmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApp {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApp.class, args);
	}

}

// wystaw endpoint ktr zwraca film/ liste filmów/ ma zwracać nazwe/ uuid
//1 film uuid unikalne/ nazwe /opis /ocena / rok/ reżyser

// 2) na gita
//usunąc MovieRepositoryImpl, rozszerzyć movieRepository o interface crudRepository
//testy integracyjne z wykorzystaniem
// commandLineRunner add
// naprawic endpointy