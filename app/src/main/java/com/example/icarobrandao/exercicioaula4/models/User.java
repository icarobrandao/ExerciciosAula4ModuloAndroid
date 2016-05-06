package com.example.icarobrandao.exercicioaula4.models;

import java.io.Serializable;

/**
 * Created by icarobrandao on 06/05/16.
 */
public class User implements Serializable {

    private String nome;
    private String cargo;
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = String.valueOf(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
