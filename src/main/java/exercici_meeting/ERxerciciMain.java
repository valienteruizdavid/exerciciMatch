/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici_meeting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;



public class ERxerciciMain {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona(1, Sexo.MUJER, 44, true, OrientacionSexual.BISEXUAL, Formacion.DOCTORADO, OrientacionPolitica.IZQUIERDA));
        listaPersonas.add(new Persona(2, Sexo.HOMBRE, 40, false, OrientacionSexual.HETERO, Formacion.DOCTORADO, OrientacionPolitica.EXTREMA_IZQUIERDA));
        listaPersonas.add(new Persona(3, Sexo.MUJER, 60, false, OrientacionSexual.LESBIANA, Formacion.CATEDRATICO, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(4, Sexo.HOMBRE, 30, true, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(5, Sexo.MUJER, 61, false, OrientacionSexual.LESBIANA, Formacion.CATEDRATICO, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(6, Sexo.MUJER, 39, true, OrientacionSexual.HETERO, Formacion.DOCTORADO, OrientacionPolitica.EXTREMA_IZQUIERDA));
        
        Persona p = new Persona(20, Sexo.MUJER, 32, true, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.EXTREMA_DERECHA);
        
            MatcherImpl mi = new MatcherImpl(p,listaPersonas);
            System.out.println("Las personas compatibles: "+mi.matches(mi.getP(),mi.getC()) +" con "+p);
        
    }
    
}
