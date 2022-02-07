/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package GuiaJavaD.Baja;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
      Scanner leerDato = new Scanner(System.in).useDelimiter("\n").useLocale(US);
      System.out.println("Ingrese una frase");
      String frase = leerDato.nextLine();
      System.out.println(frase.toUpperCase());
      System.out.println(frase.toLowerCase());
    
    }     
}
