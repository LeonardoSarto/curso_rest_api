package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.RepositoryPlayer;
import com.example.demo.entity.Player;

@RestController
@RequestMapping("/player")
public class PlayerRest {

    @Autowired
    private RepositoryPlayer repository;

    @GetMapping
    public List<Player> list() {
        return repository.findAll();
    }

    @PostMapping
    public void save(Player player) {
        repository.save(player);
    }

    @PutMapping
    public void update(Player player) {
        if(player.getId() != null) {
            repository.save(player);
        }
    }

    @DeleteMapping
    public void delete(Player player) {
        if(player.getId() != null) {
            repository.delete(player);
        }
    }
}
