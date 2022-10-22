/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.service;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yohan Alvarado
 */
@Service
public class EstadoServiceImpl implements EstadoService {
    
    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
    }

    @Override
    @Transactional
    public void saveEstado(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void deleteEstado(Estado estado) {
        estadoDao.delete(estado);
    }

    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }
    
}
