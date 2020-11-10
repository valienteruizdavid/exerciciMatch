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


class PersonaOrientacionSexualComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona oSex1, Persona oSex2) {
        if(oSex1.getSexo() == oSex2.getSexo()){
            return 1;
        }else return -1;
    }
    
}

class PersonaEdadComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona edad1, Persona edad2) {
        if(edad1.getEdad() - edad2.getEdad() == 5 || edad2.getEdad() - edad1.getEdad() == 5 || edad1.getEdad() == edad2.getEdad()){
            return 1;
        }
        else return -1;
    }
}
    
class PersonaFumadoraComparator implements Comparator<Persona>{

        @Override
        public int compare(Persona f1, Persona f2) {
            if(f1.isFumador() == f2.isFumador()){
                return 1;
            }
            else return -1;
        }
    
}

class PersonaPoliticaComparator implements Comparator<Persona>{

        @Override
        public int compare(Persona p1, Persona p2) {
            if(p1.getOrientacionPolitica() == p2.getOrientacionPolitica()){
                return 1;
            }
            else return -1;
        }
    
}

class PersonaFormacionComparator implements Comparator<Persona>{

        @Override
        public int compare(Persona for1, Persona for2) {
            if(for1.getFormacion() == for2.getFormacion()){
                return 1;
            }
            else return -1;
        }
    
}


public class MatcherImpl implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        candidatos = new ArrayList();
        persona = new Persona(persona.getId(), persona.getSexo(), persona.getEdad(), persona.isFumador(), 
                persona.getOrientacionSexual(), persona.getFormacion(), persona.getOrientacionPolitica());
        Collections.sort(candidatos, new PersonaOrientacionSexualComparator());
        Collections.sort(candidatos, new PersonaFormacionComparator());
        Collections.sort(candidatos, new PersonaPoliticaComparator());
        Collections.sort(candidatos, new PersonaEdadComparator());
        Collections.sort(candidatos, new PersonaFumadoraComparator());
        return  (Persona) candidatos;
        
        
    }
    
}
    
