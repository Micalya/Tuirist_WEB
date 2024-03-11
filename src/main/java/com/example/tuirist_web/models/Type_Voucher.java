package com.example.tuirist_web.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_Voucher")
public class Type_Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_type_voucher;
    private String type;

    public Type_Voucher(String type) {
        this.type = type;
    }

    public Type_Voucher() {
    }

    public int getId_type_voucher() {
        return id_type_voucher;
    }

    public void setId_type_voucher(int id_type_voucher) {
        this.id_type_voucher = id_type_voucher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
