package com.taller.entities;

import com.taller.entities.Cliente;
import com.taller.entities.Revision;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-12-19T21:46:39")
@StaticMetamodel(Coches.class)
public class Coches_ { 

    public static volatile SingularAttribute<Coches, String> marca;
    public static volatile CollectionAttribute<Coches, Revision> revisionCollection;
    public static volatile SingularAttribute<Coches, Integer> codigo;
    public static volatile SingularAttribute<Coches, String> precio;
    public static volatile SingularAttribute<Coches, String> color;
    public static volatile SingularAttribute<Coches, Cliente> clientecodigo;
    public static volatile SingularAttribute<Coches, String> matricula;
    public static volatile SingularAttribute<Coches, Integer> modelo;

}