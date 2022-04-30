/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacenter.demo.rest;

import com.datacenter.demo.entity.Recargas;
import com.datacenter.demo.services.RecargasJpaController;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seresjen
 */
@RestController
@RequestMapping("/datacenter")
public class ControllerRest {
    
    private  RecargasJpaController recargasJpaController;
    
    @Autowired
    ControllerRest(RecargasJpaController recargasJpaController){
      this.recargasJpaController =  recargasJpaController;
    }
    
    @GetMapping("/operadores")
    public List operadoras(){     
        List<String> lista = Arrays.asList("CONCEL", "MOVISTAR", "TIGO","CLARO");
        return lista;
    }
    
    @GetMapping("/recarga/{nombre}&{cantidad}&{operador}")
    public String operador(@PathVariable("operador") String operador, @PathVariable("cantidad")int cantidad,@PathVariable("nombre") String nombre){             
        
        String respuesta;
        try{
            Recargas recargas = new Recargas(nombre, cantidad, operador);
            recargasJpaController.save(recargas);
            respuesta = "true";
        }catch(Exception ex){
            respuesta = "false";
        }
        return respuesta; 
    }
    
}
