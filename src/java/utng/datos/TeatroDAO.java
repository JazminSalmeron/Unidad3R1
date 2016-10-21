/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Teatro;

/**
 *
 * @author Jazmin Salmeron
 */
public class TeatroDAO extends DAO<Teatro>{

    public TeatroDAO() {
        super(new Teatro());
    }
    public Teatro getOneById(Teatro teatro)
            throws HibernateException{
        return super.getOneById(teatro.getIdTeatro());
    }
}
