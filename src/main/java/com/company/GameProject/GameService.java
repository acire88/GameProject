package com.company.GameProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public Game addGame(Game game) {
        gameRepository.save(game);
        return game;
    }

    public void updateGame(Game game, Integer  id) {
        if (game.getId()!= id) {
            throw new IllegalArgumentException("Game ID must match ID provided");
        }
        gameRepository.save(game);
    }
    public List<Game> getAllGame() {
        return gameRepository.findAll();
    }

    public Game getGameById(Integer  id) {
        return gameRepository.getOne(id);
    }

    public void deleteGame(Integer id) {
        gameRepository.deleteById(id);
    }

}

