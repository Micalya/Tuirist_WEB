package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Numbers")
public class Numbers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_numbers;
    private int number;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="type_numbers_id")
    private Type_Numbers typeNumbers;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    public Numbers(int number, Type_Numbers typeNumbers, Hotel hotel) {
        this.number = number;
        this.typeNumbers = typeNumbers;
        this.hotel = hotel;
    }

    public Numbers() {
    }

    public int getId_numbers() {
        return id_numbers;
    }

    public void setId_numbers(int id_numbers) {
        this.id_numbers = id_numbers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Type_Numbers getTypeNumbers() {
        return typeNumbers;
    }

    public void setTypeNumbers(Type_Numbers typeNumbers) {
        this.typeNumbers = typeNumbers;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
