
package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;

/**
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
       int nota; 
      
        do {
            System.out.println("Ingrese una nota numerica");
             nota= leer.nextInt();
        } while(nota < 0 || nota > 10);    
       
        System.out.println("nota correcta");  
    }
