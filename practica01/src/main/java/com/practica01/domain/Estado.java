/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

/**
 *
 * @author Yohan Alvarado
 */
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado; //Hibernate lo convierte en idCliente

    String nombreEstado;
    String capital;
    int poblacion;
    String codigo;

    public Estado() {

    }

    public Estado(String nombreEstado,
            String capital,
            int poblacion,
            String codigo) {
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.codigo = codigo;
    }

}
