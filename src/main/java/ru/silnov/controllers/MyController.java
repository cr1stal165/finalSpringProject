package ru.silnov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.silnov.dao.DataBase;
import ru.silnov.models.NewsPost;

@Controller
@RequestMapping("/posting")
public class MyController {

    private final DataBase dataBase;

    @Autowired
    public MyController(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("mainModel", dataBase.index());
        return "posting/index";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("newsPost") NewsPost newsPost) {
        return "posting/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("newsPost") NewsPost newsPost) {
        dataBase.save(newsPost);
        return "redirect:/posting";
    }

}