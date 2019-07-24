package com.company.GameProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping(value="/Game", method = RequestMethod.GET)
    public List<Game> getAllGame() {
        return gameService.getAllGame();
    }

    @RequestMapping(value="/Game", method = RequestMethod.POST)
    public Game createGame(@RequestBody Game game) {
        gameService.addGame(game);
        return game;
    }

    @RequestMapping(value="/Game/{id}", method = RequestMethod.PUT)
    public void updateGame(@RequestBody @Valid Game game, @PathVariable Integer id) {
        gameService.updateGame(game, id);
    }

    @RequestMapping(value="/Game/{Game_id}", method = RequestMethod.DELETE)
    public void deleteGame(@PathVariable Integer id) {
        gameService.deleteGame(id);
    }

}
