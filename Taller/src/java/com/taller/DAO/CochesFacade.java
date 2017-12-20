/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taller.DAO;

import com.taller.entities.Coches;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ALEJANDRO_
 */
@Stateless
public class CochesFacade extends AbstractFacade<Coches> {

    @PersistenceContext(unitName = "TallerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CochesFacade() {
        super(Coches.class);
    }
    
}
