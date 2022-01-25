package com.laioffer.apolo.controller;

import com.laioffer.apolo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

//     private GameService gameService;
//
//    @Autowired
//    public GameController(GameService gameService) {
//        this.gameService = gameService;
//    }


    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String gameName, HttpServletResponse response) throws IOException {
    }

}
