package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;

public class Ejercicio17 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo siguiente: * * * * * * * * @param args
     */
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        System.out.println("Ingrese el tamaño del cuadrado");
        num = leer.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                if ((i > 0 && i < num) && (j > 0 && j < num)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("  ");
        }
    }
}
