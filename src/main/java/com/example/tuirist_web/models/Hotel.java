package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_hotel;
    private String name;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="city_id")
    private City city;

    public Hotel(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Hotel() {
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
