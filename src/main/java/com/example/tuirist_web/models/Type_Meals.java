package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_Meals")
public class Type_Meals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_type_meals;
    private String type;

    public Type_Meals(String type) {
        this.type = type;
    }

    public Type_Meals() {
    }

    public int getId_type_meals() {
        return id_type_meals;
    }

    public void setId_type_meals(int id_type_meals) {
        this.id_type_meals = id_type_meals;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
