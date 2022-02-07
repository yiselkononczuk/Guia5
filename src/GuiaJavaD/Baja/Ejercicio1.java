
package GuiaJavaD.Baja;

import static java.util.Locale.US;
import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
*/ 

public class Ejercicio1 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(US);
     System.out.println("Ingrese el primer número a sumar");
     int num1 = leer.nextInt();
     System.out.println("Ingrese el segundo número a sumar");
     int num2 = leer.nextInt();
     System.out.println("La suma de los dos numeros es: " + (num1 + num2));
 
        

    }
    
}
