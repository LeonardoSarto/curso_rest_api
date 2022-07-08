package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long life;

    @Column(nullable = false)
    private Long exp;
    
    @Column(nullable = false)
    private Long level;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getLife() {
        return life;
    }
    public void setLife(Long life) {
        this.life = life;
    }
    public Long getExp() {
        return exp;
    }
    public void setExp(Long exp) {
        this.exp = exp;
    }
    public Long getLevel() {
        return level;
    }
    public void setLevel(Long level) {
        this.level = level;
    }

}
