package br.com.psisystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Quando acessar a raiz ("/"), ele vai servir o index.html da pasta static
    @GetMapping("/")
    public String index() {
        // o Spring automaticamente procura em /resources/static/
        return "forward:/index.html";
    }
}
