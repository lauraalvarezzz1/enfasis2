package com.taller.entities;

import com.taller.entities.Coches;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-12-19T21:46:39")
@StaticMetamodel(Revision.class)
public class Revision_ { 

    public static volatile SingularAttribute<Revision, Integer> codigo;
    public static volatile SingularAttribute<Revision, String> revisioncol;
    public static volatile SingularAttribute<Revision, Coches> cochescodigo;
    public static volatile SingularAttribute<Revision, Boolean> cambioFrenos;
    public static volatile SingularAttribute<Revision, Boolean> cambioFiltro;
    public static volatile SingularAttribute<Revision, Boolean> cambioAceite;

}