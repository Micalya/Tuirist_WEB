package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_Meals")
public class Type_Meals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Type_Meals;
    private String type;

    public Type_Meals(String type) {
        this.type = type;
    }

    public Type_Meals() {
    }

    public int getId_Type_Meals() {
        return id_Type_Meals;
    }

    public void setId_Type_Meals(int id_Type_Meals) {
        this.id_Type_Meals = id_Type_Meals;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
