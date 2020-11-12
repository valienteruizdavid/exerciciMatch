/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici_meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class MatcherImpl implements Matcher {
    
    private Persona p;
    private List<Persona> c;

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
      
        Persona compatible = null;
        
        for(int i = 0; i<candidatos.size(); i++){
          if(gustoSexual(candidatos.get(i),persona)){
              if(fumadorFumadora(candidatos.get(i),persona)){
                  if(edad(candidatos.get(i),persona)){
                      if(formacion(candidatos.get(i),persona)){
                          if(politica(candidatos.get(i),persona)){
                              compatible = candidatos.get(i);
                          }
                      }
                  }
              }
              
          }
        }
        
        return compatible;
        
    }

    public MatcherImpl(Persona p, List<Persona> c) {
        this.p = p;
        this.c = c;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public List<Persona> getC() {
        return c;
    }

    public void setC(List<Persona> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MatcherImpl{" + "p=" + p + ", c=" + c + '}';
    }
    
    public boolean gustoSexual(Persona p1, Persona p2){
        
        boolean x = false;
        
        if(p1.getSexo() == p2.getSexo()){
            if((p1.getOrientacionSexual() == OrientacionSexual.GAY && p2.getOrientacionSexual() == OrientacionSexual.GAY) || 
                    (p1.getOrientacionSexual() == OrientacionSexual.LESBIANA && p2.getOrientacionSexual() == OrientacionSexual.LESBIANA)){
                x = true;
            } else x = false;
        }
        
        if(p1.getSexo() != p2.getSexo()){
            if(p1.getOrientacionSexual() == OrientacionSexual.HETERO && p2.getOrientacionSexual() == OrientacionSexual.HETERO){
                x = true;
            } else x = false;
        }
        
        return x;
        
    }
    
    public boolean edad(Persona p1, Persona p2){
        
        boolean x = false;
        
        if(p1.getEdad() <= p2.getEdad()+3){
            x = true;
        } else x = false;
        
        return x;
        
    }
    
    public boolean fumadorFumadora(Persona p1, Persona p2){
        
        boolean x = false;
        
        if(p1.isFumador() == p2.isFumador()){
            x = true;
        } else x = false;
        
        return x;
    }
    
    public boolean politica(Persona p1, Persona p2){
        
        boolean x = false;
        
        if((p1.getOrientacionPolitica() == OrientacionPolitica.DERECHA) && (p2.getOrientacionPolitica() == OrientacionPolitica.DERECHA)
            || (p2.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (p2.getOrientacionPolitica() == OrientacionPolitica.CENTRO)){
            x = true;
        } else if ((p1.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) && (p2.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA)
            || (p2.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (p2.getOrientacionPolitica() == OrientacionPolitica.CENTRO)){
            x = true;
        }  else if ((p1.getOrientacionPolitica() == OrientacionPolitica.CENTRO) && (p2.getOrientacionPolitica() == OrientacionPolitica.CENTRO)
            || (p2.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) || (p2.getOrientacionPolitica() == OrientacionPolitica.DERECHA)){
            x = true;
        } else x = false;
        
        return x;
    }
    
    public boolean formacion(Persona p1, Persona p2){
        
        boolean x = false;
        
        if(p1.getFormacion() == p2.getFormacion()){
            x = true;
        } else x = false;
        
        return x;
    }
    
}
    
