package controllers;
import models.Persona;
public class PersonaCotroller {

    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int iM=i;
            for (int j = 0; j < personas.length; j++) {
                if (personas[j].compaireCodigoDireccion(personas[i])) {
                    iM = j;
                    
                    }
                }
            if (i != iM) {
                Persona aux = personas[iM];
                personas[iM] = personas[i];     
                personas[i] = aux;
            }
        }
    }

    public Persona findByCodigoDireccion(Persona[] personas, int codigo) {
        int  bajo=0;
        int alto=personas.length-1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            if (personas[centro].equalByCodigoDireccion(codigo)) {
                return personas[centro];    
            } else if (personas[centro].equalByCodigoDireccion(codigo)) {
                bajo = centro + 1;
            } else {
                alto = centro -1;
            } 
        }
        return null;
    }
}