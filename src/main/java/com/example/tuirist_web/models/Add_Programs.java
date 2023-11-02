package com.example.tuirist_web.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Add_Programs")
public class Add_Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_add_programs;
    @NotBlank(message = "Program is required")
    @Size(min=10, message = "Прошрамма не может быть меньше 10 букв")
    private String program;

    public Add_Programs(String program) {
        this.program = program;
    }
    public Add_Programs() {}

    public int getId_add_programs() {
        return id_add_programs;
    }
    public void setId_add_programs(int id_add_programs) {
        this.id_add_programs = id_add_programs;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
}
