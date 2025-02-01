package com.gconbat.GameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gconbat.GameList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
