/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacenter.demo.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author seresjen
 */
@Entity
@Table(name = "recargas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recargas.findAll", query = "SELECT r FROM Recargas r"),
    @NamedQuery(name = "Recargas.findById", query = "SELECT r FROM Recargas r WHERE r.id = :id"),
    @NamedQuery(name = "Recargas.findByNombre", query = "SELECT r FROM Recargas r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Recargas.findByCantidad", query = "SELECT r FROM Recargas r WHERE r.cantidad = :cantidad"),
    @NamedQuery(name = "Recargas.findByOperador", query = "SELECT r FROM Recargas r WHERE r.operador = :operador")})
public class Recargas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "operador")
    private String operador;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "operador")
    //private Collection<OperadorTelefonia> operadorTelefoniaCollection;

    public Recargas() {
    }

    public Recargas(Integer id) {
        this.id = id;
    }

    public Recargas(/*Integer id, */String nombre, int cantidad, String operador) {
        //this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.operador = operador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    /*
    @XmlTransient
    public Collection<OperadorTelefonia> getOperadorTelefoniaCollection() {
        return operadorTelefoniaCollection;
    }

    public void setOperadorTelefoniaCollection(Collection<OperadorTelefonia> operadorTelefoniaCollection) {
        this.operadorTelefoniaCollection = operadorTelefoniaCollection;
    }
    */
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recargas)) {
            return false;
        }
        Recargas other = (Recargas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.datacenter.demo.entity.Recargas[ id=" + id + " ]";
    }
    
}
