/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.ActorDAO;
import utng.datos.GuionDAO;
import utng.datos.TeatroDAO;
import utng.modelo.Actor;
import utng.modelo.Guion;
import utng.modelo.Teatro;

/**
 *
 * @author Jazmin Salmeron
 */
@ManagedBean(name="actorBean") @SessionScoped
public class ActorBean implements Serializable{

    private List<Actor> actores;
    private Actor actor;
    private List<Guion>guiones;
    private List<Teatro>teatros;

    public ActorBean() {
     actor=new Actor();
     actor.setGuion( new Guion());
     actor.setTeatro( new Teatro());
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public List<Guion> getGuiones() {
        return guiones;
    }

    public void setGuiones(List<Guion> guiones) {
        this.guiones = guiones;
    }

    public List<Teatro> getTeatros() {
        return teatros;
    }

    public void setTeatros(List<Teatro> teatros) {
        this.teatros = teatros;
    }
    
    
   
public String listar(){
    ActorDAO dao=new ActorDAO();
    try{
        actores=dao.getAll();
            }catch(Exception e ){
        e.printStackTrace();
    }
    return  "Actores";
}
public String eliminar(){
    ActorDAO dao=new ActorDAO();
    try{
        dao.delete(actor);
        actores=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Eliminar";
}
 public String iniciar(){
        actor=new Actor();
        actor.setGuion(new Guion());
        actor.setTeatro(new Teatro());
        try{
            guiones=new GuionDAO().getAll();
            teatros=new TeatroDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }return "Iniciar";
    }
    public String guardar(){
   ActorDAO dao=new ActorDAO();
    try{
        if(actor.getIdActor()!=0){
            dao.update(actor);
        }else{
            dao.insert(actor);
        }
        actores=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Guardar";
}
    public String cancelar(){
    return "Cancelar";
    }
public String editar(Actor actor){
    this.actor=actor;
    try{
        guiones=new GuionDAO().getAll();
        teatros = new TeatroDAO().getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Editar";
}

}
