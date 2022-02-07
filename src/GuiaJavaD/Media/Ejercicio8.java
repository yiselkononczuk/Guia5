package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String frase1 = "eureka"; 
        System.out.println("Ingrese una frase o palabra");
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(US);
        String frase2 = leer.nextLine();
        
        if (frase1.equals(frase2)) {
            System.out.println("CORRECTO");
                    }
        else {
            System.out.println("INCORRECTO");
                    }
    }      
}   

