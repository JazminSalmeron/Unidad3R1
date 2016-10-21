/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Guion;

/**
 *
 * @author Jazmin Salmeron
 */
public class GuionDAO extends DAO<Guion>{

    public GuionDAO() {
        super(new Guion());
    }
    public Guion getOneById(Guion guion)
            throws HibernateException{
        return super.getOneById(guion.getIdGuion());
    }
}

