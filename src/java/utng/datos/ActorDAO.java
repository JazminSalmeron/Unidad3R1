/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Actor;

/**
 *
 * @author Jazmin Salmeron
 */
public class ActorDAO extends DAO<Actor>{
    public ActorDAO(){
     super(new Actor());
 }   
 public Actor getOneById(Actor actor)
         throws HibernateException{
     return super.getOneById(actor.getIdActor());
 }
}

