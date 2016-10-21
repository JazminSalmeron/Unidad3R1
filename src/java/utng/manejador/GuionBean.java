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
import utng.datos.GuionDAO;
import utng.modelo.Guion;

/**
 *
 * @author Jazmin Salmeron
 */
@ManagedBean
@SessionScoped
public class GuionBean implements Serializable{

    private List<Guion> guiones;
    private Guion guion;

    public GuionBean() {
    }

    public List<Guion> getGuiones() {
        return guiones;
    }

    public void setGuiones(List<Guion> guiones) {
        this.guiones = guiones;
    }

    public Guion getGuion() {
        return guion;
    }

    public void setGuion(Guion guion) {
        this.guion = guion;
    }

    

    public String listar(){
        GuionDAO dao=new GuionDAO();
        try{
            guiones=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Guiones";
    }
    public String eliminar(){
         GuionDAO dao=new GuionDAO();
        try{
            dao.delete(guion);
            guiones=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
    }
    public String iniciar(){
        guion=new Guion();
        return "Iniciar";
    }
    public String guardar(){
    GuionDAO dao=new GuionDAO();
    try{
        if(guion.getIdGuion()!=0){
            dao.update(guion);
        }else{
            dao.insert(guion);
        }
        guiones=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Guardar";
}
    public String cancelar(){
    return "Cancelar";
    }
public String editar(Guion guion){
    this.guion=guion;
    return "Editar";
}
    
}
