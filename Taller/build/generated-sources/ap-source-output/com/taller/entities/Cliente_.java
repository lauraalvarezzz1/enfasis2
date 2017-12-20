package com.taller.entities;

import com.taller.entities.Coches;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-12-19T21:46:39")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> codigo;
    public static volatile SingularAttribute<Cliente, String> ciudad;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile CollectionAttribute<Cliente, Coches> cochesCollection;
    public static volatile SingularAttribute<Cliente, String> nif;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;

}