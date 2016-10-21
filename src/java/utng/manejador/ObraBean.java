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
import utng.datos.DirectorDAO;
import utng.datos.ObraDAO;
import utng.modelo.Director;
import utng.modelo.Obra;

/**
 *
 * @author Jazmin Salmeron
 */
@ManagedBean(name="obraBean") @SessionScoped
public class ObraBean implements Serializable{
    
    private List<Obra> obras;
    private Obra obra;
    private List<Director>directores;

    public ObraBean() {
     obra=new Obra();
     obra.setDirector( new Director());
    }

    public List<Obra> getObras() {
        return obras;
    }

    public void setObras(List<Obra> obras) {
        this.obras = obras;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }
    
 
public String listar(){
    ObraDAO dao=new ObraDAO();
    try{
        obras=dao.getAll();
            }catch(Exception e ){
        e.printStackTrace();
    }
    return  "Obras";
}
public String eliminar(){
    ObraDAO dao=new ObraDAO();
    try{
        dao.delete(obra);
        obras=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Eliminar";
}
 public String iniciar(){
        obra=new Obra();
        obra.setDirector(new Director());
        try{
            directores=new DirectorDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }return "Iniciar";
    }
    public String guardar(){
   ObraDAO dao=new ObraDAO();
    try{
        if(obra.getIdObra()!=0){
            dao.update(obra);
        }else{
            dao.insert(obra);
        }
        obras=dao.getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Guardar";
}
    public String cancelar(){
    return "Cancelar";
    }
public String editar(Obra obra){
    this.obra=obra;
    try{
        directores=new DirectorDAO().getAll();
    }catch(Exception e){
        e.printStackTrace();
    }
    return "Editar";
}

}

