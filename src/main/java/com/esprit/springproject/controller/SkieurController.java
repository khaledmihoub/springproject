package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.entities.Skieur;
import com.esprit.springproject.services.SkieurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    SkieurService skservice;
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieur() {
        return skservice.retrieveAllSkieur();
    }
    @PostMapping("/add-skieur")
    public void addSkieur(@RequestBody Skieur s) {
        skservice.addSkieur(s);
    }
    @PostMapping("/add-skieur-abonn")
    public void addSkieur1(@RequestBody Skieur s) {
        skservice.addSkieurwithabonn(s);
    }
    @PostMapping("/add-skieur-inscit")
    public void addSkieur2(@RequestBody Skieur s) {
        skservice.addSkieurwithinscriptions(s);
    }
    @PutMapping("/update-skieur")
    public void updateSkieur(@RequestBody Skieur s) {
        skservice.updateSkieur(s);
    }
    @DeleteMapping("/delete-skieur/{id}")
    public void deleteSkieur(@PathVariable("id") Integer id) {
        skservice.deleteSkieur(id);
    }

    @PostMapping("/add-skieur-abonn")
    public void addSkieur3(@RequestBody Long s,@RequestBody Long p ) {
        skservice.assignSkieurToPiste(s,p);
    }







}