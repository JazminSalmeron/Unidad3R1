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
@Table(name="teatro")
public class Teatro implements Serializable{

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_teatro")
    private Long idTeatro;
    @Column(length = 30)
    private String nombre;
    @Column(length = 30)
    private String ubicacion;
    @Column(length = 30)
    private String clasificacion;

    public Teatro() {
        this.idTeatro = 0L;
    }

    public Long getIdTeatro() {
        return idTeatro;
    }

    public void setIdTeatro(Long idTeatro) {
        this.idTeatro = idTeatro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    
}