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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jazmin Salmeron
 */
@Entity
@Table(name="obra")
public class Obra implements Serializable{

     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_obra")
     private Long idObra;
    @Column(name="nombre_obra", length = 10)
    private String nombreObra;
    @Column(length = 40)
    private String tipo;
    @Column(length = 40)
    private String duracion;
   
    @ManyToOne
    @JoinColumn(name="id_director")
    private Director director;

    public Obra(Long idObra, String nombreObra, String tipo,String duracion,  Director director) {
        super();
        this.idObra = idObra;
        this.nombreObra = nombreObra;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public Obra() {
       this.idObra=0L;
    }

    public Long getIdObra() {
        return idObra;
    }

    public void setIdObra(Long idObra) {
        this.idObra = idObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    
}
    
    