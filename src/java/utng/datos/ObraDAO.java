/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Obra;

/**
 *
 * @author Jazmin Salmeron
 */
public class ObraDAO extends DAO<Obra>{

 public ObraDAO(){
     super(new Obra());
 }   
 public Obra getOneById(Obra obra)
         throws HibernateException{
     return super.getOneById(obra.getIdObra());
 }

}

