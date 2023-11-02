package com.example.tuirist_web.models;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_voucher;
    private String name;
    private String description;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="type_sending_id")
    private Type_Sending type_sending;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="add_programs_id")
    private Add_Programs add_programs;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="numbers_id")
    private Numbers numbers;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="type_voucher_id")
    private Type_Voucher type_voucher;
    private double price;
    private Date date_departure;
    private Date date_return;


    public Voucher() {
    }

    public Voucher(String name, String description, Type_Sending type_sending, Add_Programs add_programs, Numbers numbers, Type_Voucher type_voucher, double price, Date date_departure, Date date_return) {
        this.name = name;
        this.description = description;
        this.type_sending = type_sending;
        this.add_programs = add_programs;
        this.numbers = numbers;
        this.type_voucher = type_voucher;
        this.price = price;
        this.date_departure = date_departure;
        this.date_return = date_return;
    }

    public int getId_voucher() {
        return id_voucher;
    }

    public void setId_voucher(int id_voucher) {
        this.id_voucher = id_voucher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type_Sending getType_sending() {
        return type_sending;
    }

    public void setType_sending(Type_Sending type_sending) {
        this.type_sending = type_sending;
    }

    public Add_Programs getAdd_programs() {
        return add_programs;
    }

    public void setAdd_programs(Add_Programs add_programs) {
        this.add_programs = add_programs;
    }

    public Numbers getNumbers() {
        return numbers;
    }

    public void setNumbers(Numbers numbers) {
        this.numbers = numbers;
    }

    public Type_Voucher getType_voucher() {
        return type_voucher;
    }

    public void setType_voucher(Type_Voucher type_voucher) {
        this.type_voucher = type_voucher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate_departure() {
        return date_departure;
    }

    public void setDate_departure(Date date_departure) {
        this.date_departure = date_departure;
    }

    public Date getDate_return() {
        return date_return;
    }

    public void setDate_return(Date date_return) {
        this.date_return = date_return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
