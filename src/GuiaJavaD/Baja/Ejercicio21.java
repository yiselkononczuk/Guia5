
package GuiaJavaD.Baja;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio21 {

    /**
     Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);       
        System.out.println("Ingrese el tamaño del vector");
        int tamVec= leer.nextInt();
        
        int[] vectorLleno= rellenarVector(tamVec);
        
        System.out.println("Ingrese un num a buscar en el vector");
        int numBuscar= leer.nextInt();
        
        buscarNum(numBuscar, vectorLleno);
    }
    
  
    public static int[] rellenarVector(int tamVec){
       int[] vector= new int[tamVec];
       for (int i = 0; i < tamVec; i++) {
               vector[i] = (int) (Math.random() *10);
               System.out.print("|" + vector[i]);
           }
        System.out.println(" ");
       return vector; 
   } 
    
   public static void buscarNum (int numBuscar, int[] vector){
       boolean ban= false;
       for (int i = 0; i < vector.length; i++) {
           if (vector[i]== numBuscar){
               System.out.println("se encuentra en la posición: " + (i+1));
               ban= true;
           }
       }
       if (ban==false) {
           System.out.println("El num ingresado no se encontro");
       }
       
   }
}