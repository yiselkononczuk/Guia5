/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package GuiaJavaD.Baja;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese una temperatura para ser convertida en grados FAHRENHEIT");
        double temperatura = leer.nextDouble();
        System.out.println("La temperatura convertida a grados FAHRENHEIT es;  " + (32 + (9 * temperatura /5)));
        
        
    }
    
}
