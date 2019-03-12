package hibernate;
// Generated 12-mar-2019 14:12:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Asignatura generated by hbm2java
 */
public class Asignatura  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private Set profesors = new HashSet(0);
     private Set clases = new HashSet(0);

    public Asignatura() {
    }

	
    public Asignatura(String nombre) {
        this.nombre = nombre;
    }
    public Asignatura(String nombre, Set profesors, Set clases) {
       this.nombre = nombre;
       this.profesors = profesors;
       this.clases = clases;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getProfesors() {
        return this.profesors;
    }
    
    public void setProfesors(Set profesors) {
        this.profesors = profesors;
    }
    public Set getClases() {
        return this.clases;
    }
    
    public void setClases(Set clases) {
        this.clases = clases;
    }




}


