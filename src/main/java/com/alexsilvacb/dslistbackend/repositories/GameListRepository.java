package com.alexsilvacb.dslistbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsilvacb.dslistbackend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
