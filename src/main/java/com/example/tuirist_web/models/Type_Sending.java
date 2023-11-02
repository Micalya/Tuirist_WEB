package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_Sending")
public class Type_Sending {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_type_sending;
    private String type;

    public Type_Sending(String type) {
        this.type = type;
    }

    public Type_Sending() {
    }

    public int getId_type_sending() {
        return id_type_sending;
    }

    public void setId_type_sending(int id_type_sending) {
        this.id_type_sending = id_type_sending;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
