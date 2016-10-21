/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Director;

/**
 *
 * @author Jazmin Salmeron
 */
public class DirectorDAO extends DAO<Director>{

    public DirectorDAO() {
        super(new Director());
    }
    public Director getOneById(Director director)
            throws HibernateException{
        return super.getOneById(director.getIdDirector());
    }
}