
package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio18 {

    /**
     Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     * @param args
     */
   public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese 4 numeros entre el 1 y 20");
        int[] vector= new int[4]; 
        int contador = 0;
      
        do{
          num= leer.nextInt();
          if (num > 0 && num <21){
              vector[contador]=num;
              contador = contador +1; 
          }
          else {
              System.out.println("el valor ingresado es incorrecto, ingrese un valor entre 1 y 20");
          }
       }while (contador < 4);
        
       imprimirCaracter(vector[0]);
       imprimirCaracter(vector[1]);
       imprimirCaracter(vector[2]);
       imprimirCaracter(vector[3]);
    }
    
   private static void imprimirCaracter (int num){
       System.out.print(num + " ");
       for (int i = 0; i < num; i++) {
           System.out.print("*");
       }
       System.out.println("");
   }
}
