/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datacenter.demo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author seresjen
 */
@Entity
@Table(name = "operador_telefonia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OperadorTelefonia.findAll", query = "SELECT o FROM OperadorTelefonia o"),
    @NamedQuery(name = "OperadorTelefonia.findById", query = "SELECT o FROM OperadorTelefonia o WHERE o.id = :id"),
    @NamedQuery(name = "OperadorTelefonia.findByCantidad", query = "SELECT o FROM OperadorTelefonia o WHERE o.cantidad = :cantidad")})
public class OperadorTelefonia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "operador", referencedColumnName = "operador")
    @ManyToOne(optional = false)
    private Recargas operador;

    public OperadorTelefonia() {
    }

    public OperadorTelefonia(Integer id) {
        this.id = id;
    }

    public OperadorTelefonia(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Recargas getOperador() {
        return operador;
    }

    public void setOperador(Recargas operador) {
        this.operador = operador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperadorTelefonia)) {
            return false;
        }
        OperadorTelefonia other = (OperadorTelefonia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.datacenter.demo.entity.OperadorTelefonia[ id=" + id + " ]";
    }
    
}
