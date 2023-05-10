package com.alexsilvacb.dslistbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilvacb.dslistbackend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
