package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

    private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);  // Use SLF4J logger

    @GetMapping("/")
    public String getAllPlayers() {
        logger.info("Home method has been called");

        return "players";  // This should map to /WEB-INF/jsp/players.jsp
    }
}
