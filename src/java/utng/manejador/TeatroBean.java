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
import utng.datos.TeatroDAO;
import utng.modelo.Teatro;


/**
 *
 * @author Jazmin Salmeron
 */
@ManagedBean
@SessionScoped
public class TeatroBean implements Serializable {
    
    private List<Teatro> teatros;
    private Teatro teatro;

    public TeatroBean() {
    }

    public List<Teatro> getTeatros() {
        return teatros;
    }

    public void setTeatros(List<Teatro> teatros) {
        this.teatros = teatros;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }
    

    public String listar(){
        TeatroDAO dao=new TeatroDAO();
        try{
            teatros=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Teatros";
    }
    public String eliminar(){
         TeatroDAO dao=new TeatroDAO();
        try{
            dao.delete(teatro);
            teatros=dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return  "Eliminar";
    }
    public String iniciar(){
        teatro=new Teatro();
        return "Iniciar";
    }
    public String guardar(){
    TeatroDAO dao=new TeatroDAO();
    try{
        if(teatro.getIdTeatro()!=0){
            dao.update(teatro);
        }else{
            dao.insert(teatro);
        }
        teatros=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Guardar";
}
    public String cancelar(){
    return "Cancelar";
    }
public String editar(Teatro teatro){
    this.teatro=teatro;
    return "Editar";
}
    
}
