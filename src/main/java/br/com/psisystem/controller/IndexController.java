package br.com.psisystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }
    
    @GetMapping("/cadastro")
    public String cadastrar() {
        return "forward:/fichaCadastral.html";
    }

    @GetMapping("/menu")
    public String menu() {
        return "forward:/menu.html";
    }
}
