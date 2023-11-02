package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_Numbers")
public class Type_Numbers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_type_numbers;
    private String type;

    public Type_Numbers(String type) {
        this.type = type;
    }

    public Type_Numbers() {
    }

    public int getId_type_numbers() {
        return id_type_numbers;
    }

    public void setId_type_numbers(int id_type_numbers) {
        this.id_type_numbers = id_type_numbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
