/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jazmin Salmeron
 */
@Entity
@Table(name="director")
public class Director implements Serializable{

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_director")
    private Long idDirector;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String apellidos;
    @Column(length = 30)
    private String tipo;

    public Director() {
        this.idDirector = 0L;
    }

    public Long getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Long idDirector) {
        this.idDirector = idDirector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

    