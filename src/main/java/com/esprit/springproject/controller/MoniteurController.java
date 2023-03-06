package com.esprit.springproject.controller;

import com.esprit.springproject.entities.Moniteur;
import com.esprit.springproject.services.MoniteurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {

    MoniteurService ms;

    @GetMapping
    public List<Moniteur> apiget(){
        return ms.retrieveAllMoniteurs();
    }
    @PostMapping("/add")
    public void  postmoni(@RequestBody Moniteur m){
        ms.addMoniteur(m);
    }

    @PutMapping("/putmoni")
    public void  putmoni(@RequestBody Moniteur m){
        ms.updateMoniteur(m);
    }

    @DeleteMapping("/delete/{idd}")
    public void  delete(@PathVariable("idd")Integer id){
        ms.deleteMoniteur(id);
    }



}
