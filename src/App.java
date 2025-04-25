import javax.swing.text.View;

import controllers.PersonaCotroller;
import models.Direccion;
import models.Persona;
import view.ViewConsole;
public class App {
    public static void main(String[] args) throws Exception {
        // Crear un arreglo de 5 personas
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5",56,89));

        PersonaCotroller pC = new PersonaCotroller();
        ViewConsole vC = new ViewConsole();

        vC.printPersona(personas);
        System.out.println("");
        pC.sortByDireccionCodigo(personas);
        vC.printPersona(personas);
        System.out.println("");
        Persona pB = pC.findByCodigoDireccion(personas, 56);
        if (pB != null) {
            System.out.println("Persona encontrada: " + pB);
        } else {
            System.out.println("No se encontró la persona con el código de dirección especificado.");
        }

    }
}
