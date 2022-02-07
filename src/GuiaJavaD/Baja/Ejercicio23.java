
package GuiaJavaD.Baja;

public class Ejercicio23 {

    /**
     Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz
     */
    public static void main(String[] args) {
       
        int[][] matrizLlena= rellenarMatriz(); //doy un nombre y le asigno el valor que me da rellenarMatriz
        mostrarMatriz(matrizLlena); //al metodo mostrarMatriz le doy la info a mostrar q es matrizLlena
        int[][] matrizTrasLlena= matrizTras(matrizLlena);//doy nombre y le asino el valor de marizTras, con los valores de matrizLlena
        mostrarMatriz(matrizTrasLlena);//vuelvo a invocar el metodo mostrarMatriz, pero con la info de la matrizTrasLlena
    }
    
   private static int[][] rellenarMatriz (){
       int[][] matriz= new int[4][4];
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               matriz[i][j] = (int) (Math.random() *10);
           }
       }
       return matriz; 
   } 
   
   private static void mostrarMatriz(int[][] matriz){
       
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print("" + matriz[i][j] );
           }
           System.out.println("");
        }
       System.out.println("");
   }
   
   private static int[][] matrizTras(int[][] matriz){
       int[][] matrizT= new int[4][4];
       for (int j = 0; j < 4; j++) {
           for (int i = 0; i < 4; i++) {
               matrizT[j][i]= matriz[i][j];
           }
       }
       return matrizT;
   }
}


