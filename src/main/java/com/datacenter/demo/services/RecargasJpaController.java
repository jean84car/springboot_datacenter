/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacenter.demo.services;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.datacenter.demo.entity.OperadorTelefonia;
import com.datacenter.demo.entity.Recargas;
import com.datacenter.demo.exceptions.IllegalOrphanException;
import com.datacenter.demo.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author seresjen
 */
@Repository
public class RecargasJpaController implements Serializable {

    public RecargasJpaController() {
    }
   
    @PersistenceContext
    private EntityManager em;

    @Autowired
    public RecargasJpaController(EntityManager em) {
        this.em=em;
    }
    
    //@Override
    @Transactional
    public List<Recargas> findAll() {
       TypedQuery<Recargas> consulta = em.createQuery("from Recargas", Recargas.class);
       List<Recargas> productos =consulta.getResultList();
       return productos;
    }
    
    //@Override
    @Transactional
    public Recargas findById(int id){
       Recargas producto=null;
       try{           
            producto=em.find(Recargas.class, id);
       }catch(Exception ex){
           System.out.println("Error: "+ex);
       } 
        return producto;
    }
    
    //@Override
    @Transactional
    public void save(Recargas producto){
        em.persist(producto);       
    }
    
    //@Override
    @Transactional
    public void update(Recargas producto){
        em.merge(producto);
    }
    
    //@Override
    @Transactional
    public void delete(int id){      
        Query consulta=em.createQuery("delete from Recargas where id=:productoId");
        consulta.setParameter("productoId", id);
        consulta.executeUpdate();
    }
}
