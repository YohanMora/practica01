/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service;

import com.practica01.domain.Estado;
import java.util.List;

/**
 *
 * @author Yohan Alvarado
 */
public interface EstadoService {
    
    public List<Estado> getEstados();
    
    public void saveEstado(Estado estado);
    
    public void deleteEstado(Estado estado);
    
    public Estado getEstado(Estado estado);
}
