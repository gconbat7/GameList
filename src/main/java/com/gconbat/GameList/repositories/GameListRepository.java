package com.gconbat.GameList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gconbat.GameList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
