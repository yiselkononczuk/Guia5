/*
 7. Crear un programa que dado un numero determine si es par o impar.
 */
package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in). useDelimiter("\n"). useLocale(US);
        System.out.println("Ingrese un número para determinar si es par o no");
        int num= leer.nextInt();
        
        if (num % 2 == 0) {
        System.out.println("El Número ingresado es par");
        }
        else {
        System.out.println("El número es Impar");
           }        
    }
    
}
