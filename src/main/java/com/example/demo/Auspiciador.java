package com.example.demo;

import org.hibernate.mapping.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import java.util.Set;
import java.util.HashSet;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "auspiciador")
public class Auspiciador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String nombre ;
    private Integer monto;
private Set<Artista> artista= new HashSet<Artista>();

    public Auspiciador() {
    }
    public Auspiciador(Integer id, String nombre, Integer monto) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getMonto() {
        return monto;
    }
    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    
}
