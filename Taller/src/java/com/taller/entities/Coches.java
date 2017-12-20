/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALEJANDRO_
 */
@Entity
@Table(name = "coches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coches.findAll", query = "SELECT c FROM Coches c"),
    @NamedQuery(name = "Coches.findByCodigo", query = "SELECT c FROM Coches c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Coches.findByMatricula", query = "SELECT c FROM Coches c WHERE c.matricula = :matricula"),
    @NamedQuery(name = "Coches.findByMarca", query = "SELECT c FROM Coches c WHERE c.marca = :marca"),
    @NamedQuery(name = "Coches.findByModelo", query = "SELECT c FROM Coches c WHERE c.modelo = :modelo"),
    @NamedQuery(name = "Coches.findByColor", query = "SELECT c FROM Coches c WHERE c.color = :color"),
    @NamedQuery(name = "Coches.findByPrecio", query = "SELECT c FROM Coches c WHERE c.precio = :precio")})
public class Coches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "matricula")
    private String matricula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modelo")
    private int modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "precio")
    private String precio;
    @JoinColumn(name = "Cliente_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Cliente clientecodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cochescodigo")
    private Collection<Revision> revisionCollection;

    public Coches() {
    }

    public Coches(Integer codigo) {
        this.codigo = codigo;
    }

    public Coches(Integer codigo, String matricula, String marca, int modelo, String color, String precio) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Cliente getClientecodigo() {
        return clientecodigo;
    }

    public void setClientecodigo(Cliente clientecodigo) {
        this.clientecodigo = clientecodigo;
    }

    @XmlTransient
    public Collection<Revision> getRevisionCollection() {
        return revisionCollection;
    }

    public void setRevisionCollection(Collection<Revision> revisionCollection) {
        this.revisionCollection = revisionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coches)) {
            return false;
        }
        Coches other = (Coches) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.entities.Coches[ codigo=" + codigo + " ]";
    }
    
}
