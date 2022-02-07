
package GuiaJavaD.Baja;

import static java.time.temporal.WeekFields.ISO;
import static java.util.Locale.US;
import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla
 */
public class Ejercicio2 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(US);
     System.out.println("Ingrese su nombre");
     String nombre = leer.nextLine();
     System.out.println("Bienvenid@: " + nombre);
     
    }
    
}
