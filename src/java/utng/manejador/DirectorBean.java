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
import utng.modelo.Director;

/**
 *
 * @author Jazmin Salmeron
 */
@ManagedBean
@SessionScoped
public class DirectorBean implements Serializable {

    private List<Director> directores;
    private Director director;

    public DirectorBean() {
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String listar() {
        DirectorDAO dao = new DirectorDAO();
        try {
            directores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Directores";
    }

    public String eliminar() {
        DirectorDAO dao = new DirectorDAO();
        try {
            dao.delete(director);
            directores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String iniciar() {
        director = new Director();
        return "Iniciar";
    }

    public String guardar() {
        DirectorDAO dao = new DirectorDAO();
        try {
            if (director.getIdDirector() != 0) {
                dao.update(director);
            } else {
                dao.insert(director);
            }
            directores = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Director director) {
        this.director = director;
        return "Editar";
    }

}
