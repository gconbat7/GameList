package com.gconbat.GameList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gconbat.GameList.dto.GameDTO;
import com.gconbat.GameList.dto.GameMinDTO;
import com.gconbat.GameList.entities.Game;
import com.gconbat.GameList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
