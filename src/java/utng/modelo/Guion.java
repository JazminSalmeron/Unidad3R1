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
@Table(name="guion")
public class Guion implements Serializable{

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_guion")
    private Long idGuion;
    @Column(length = 30)
    private String tipo;
    @Column(length = 30)
    private String titulo;
    @Column(length = 30)
    private String tamanio;

    public Guion() {
        this.idGuion = 0L;
    }

    public Long getIdGuion() {
        return idGuion;
    }

    public void setIdGuion(Long idGuion) {
        this.idGuion = idGuion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
}

    