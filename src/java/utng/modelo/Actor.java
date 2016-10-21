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
@Table(name="actor")
public class Actor implements Serializable{

     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_actor")
     private Long idActor;
    @Column(name="nombre_actor", length = 10)
    private String nombreActor;
    @Column(length = 40)
    private String apellidos;
    @Column(length = 40)
    private String tipo;
    
    @ManyToOne
    @JoinColumn(name="id_guion")
    private Guion guion;
    
    @ManyToOne
    @JoinColumn(name="id_teatro")
    private Teatro teatro;

    public Actor(Long idActor, String nombreActor, String apellidos, String tipo, Guion guion, Teatro teatro) {
        super();
        this.idActor = idActor;
        this.nombreActor = nombreActor;
        this.apellidos = apellidos;
        this.tipo = tipo;
        this.guion = guion;
        this.teatro = teatro;
    }

    public Actor() {
       this.idActor=0L;
    }

    public Long getIdActor() {
        return idActor;
    }

    public void setIdActor(Long idActor) {
        this.idActor = idActor;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
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

    public Guion getGuion() {
        return guion;
    }

    public void setGuion(Guion guion) {
        this.guion = guion;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }
}
    
    