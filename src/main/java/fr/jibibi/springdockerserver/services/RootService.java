package fr.jibibi.springdockerserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.jibibi.springdockerserver.beans.AppState;

/**
 * RootService
 */
@Controller
public class RootService {

    @Autowired
    private AppState state;

    @RequestMapping("/")
    @ResponseBody
    public AppState home() {
        return state;
    }
}