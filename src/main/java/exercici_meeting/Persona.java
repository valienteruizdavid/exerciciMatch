/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici_meeting;

import java.util.Objects;

/**
 *
 * @author dvali
 */
public class Persona {
    
    private int id;
    private Sexo sexo;
    private int edad;
    private boolean fumador;
    private OrientacionSexual orientacionSexual;
    private Formacion formacion;
    private OrientacionPolitica orientacionPolitica;

    public Persona(int id, Sexo sexo, int edad, boolean fumador, OrientacionSexual orientacionSexual, Formacion formacion, OrientacionPolitica orientacionPolitica) {
        this.id = id;
        this.sexo = sexo;
        this.edad = edad;
        this.fumador = fumador;
        this.orientacionSexual = orientacionSexual;
        this.formacion = formacion;
        this.orientacionPolitica = orientacionPolitica;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isFumador() {
        return fumador;
    }

    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }

    public OrientacionSexual getOrientacionSexual() {
        return orientacionSexual;
    }

    public void setOrientacionSexual(OrientacionSexual orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public void setFormacion(Formacion formacion) {
        this.formacion = formacion;
    }

    public OrientacionPolitica getOrientacionPolitica() {
        return orientacionPolitica;
    }

    public void setOrientacionPolitica(OrientacionPolitica orientacionPolitica) {
        this.orientacionPolitica = orientacionPolitica;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", sexo=" + sexo + ", edad=" + edad + ", fumador=" + fumador + 
                ", orientacionSexual=" + orientacionSexual + ", formacion=" + formacion + ", orientacionPolitica=" + orientacionPolitica + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.sexo);
        hash = 67 * hash + this.edad;
        hash = 67 * hash + (this.fumador ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.orientacionSexual);
        hash = 67 * hash + Objects.hashCode(this.formacion);
        hash = 67 * hash + Objects.hashCode(this.orientacionPolitica);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.fumador != other.fumador) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.orientacionSexual != other.orientacionSexual) {
            return false;
        }
        if (this.formacion != other.formacion) {
            return false;
        }
        if (this.orientacionPolitica != other.orientacionPolitica) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
