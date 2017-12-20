/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALEJANDRO_
 */
@Entity
@Table(name = "revision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Revision.findAll", query = "SELECT r FROM Revision r"),
    @NamedQuery(name = "Revision.findByCodigo", query = "SELECT r FROM Revision r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Revision.findByCambioFiltro", query = "SELECT r FROM Revision r WHERE r.cambioFiltro = :cambioFiltro"),
    @NamedQuery(name = "Revision.findByCambioAceite", query = "SELECT r FROM Revision r WHERE r.cambioAceite = :cambioAceite"),
    @NamedQuery(name = "Revision.findByCambioFrenos", query = "SELECT r FROM Revision r WHERE r.cambioFrenos = :cambioFrenos"),
    @NamedQuery(name = "Revision.findByRevisioncol", query = "SELECT r FROM Revision r WHERE r.revisioncol = :revisioncol")})
public class Revision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cambio_filtro")
    private boolean cambioFiltro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cambio_aceite")
    private boolean cambioAceite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cambio_frenos")
    private boolean cambioFrenos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "revisioncol")
    private String revisioncol;
    @JoinColumn(name = "Coches_codigo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Coches cochescodigo;

    public Revision() {
    }

    public Revision(Integer codigo) {
        this.codigo = codigo;
    }

    public Revision(Integer codigo, boolean cambioFiltro, boolean cambioAceite, boolean cambioFrenos, String revisioncol) {
        this.codigo = codigo;
        this.cambioFiltro = cambioFiltro;
        this.cambioAceite = cambioAceite;
        this.cambioFrenos = cambioFrenos;
        this.revisioncol = revisioncol;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean getCambioFiltro() {
        return cambioFiltro;
    }

    public void setCambioFiltro(boolean cambioFiltro) {
        this.cambioFiltro = cambioFiltro;
    }

    public boolean getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(boolean cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public boolean getCambioFrenos() {
        return cambioFrenos;
    }

    public void setCambioFrenos(boolean cambioFrenos) {
        this.cambioFrenos = cambioFrenos;
    }

    public String getRevisioncol() {
        return revisioncol;
    }

    public void setRevisioncol(String revisioncol) {
        this.revisioncol = revisioncol;
    }

    public Coches getCochescodigo() {
        return cochescodigo;
    }

    public void setCochescodigo(Coches cochescodigo) {
        this.cochescodigo = cochescodigo;
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
        if (!(object instanceof Revision)) {
            return false;
        }
        Revision other = (Revision) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.taller.entities.Revision[ codigo=" + codigo + " ]";
    }
    
}
