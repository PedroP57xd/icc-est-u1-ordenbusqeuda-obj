package view;
import models.Persona;
public class ViewConsole {
    public void printPersona(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }   

}
