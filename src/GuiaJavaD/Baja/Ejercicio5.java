/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package GuiaJavaD.Baja;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in). useDelimiter("\n"). useLocale(US);
        System.out.println("Ingrese un número");
        int num = leerDato.nextInt();
        System.out.println("El doble del número " + num + " es: " + (num*2));
        System.out.println("El triple del número " + num + " es: " + (num*3));
        System.out.println("La raiz cuadrada del número " + num + " es: " + (Math.sqrt(num)));
        
        
    }
    
}
