/*
 
 */
package GuiaJavaD.Media;

import static java.util.Locale.US;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);

        System.out.println("Ingrese a que moneda desea realizar el cambio: DOLAR-YENES-LIBRAS");
        String tipoMoneda = leer.nextLine().toUpperCase();

        System.out.println("Ingrese la cantidad de euros para ser convertido a : " + tipoMoneda);
        double euros = leer.nextDouble();

        if ("DOLAR".equals(tipoMoneda) || "YENES".equals(tipoMoneda) || "LIBRAS".equals(tipoMoneda)) {
            cambioMoneda(euros, tipoMoneda);
        } else {
            System.out.println("La moneda no corresponde");
        }
    }

    private static void cambioMoneda(double euros, String tipoMoneda) {
        double moneda;
        System.out.println("De Euros a : " + tipoMoneda);
        if (tipoMoneda.equals("DOLAR")) {
            moneda = (1.28611 * euros);

        } else if (tipoMoneda.equals("YENES")) {
            moneda = (129.852 * euros);

        } else {
            moneda = (0.86 * euros);
        }

        System.out.println("euros: " + euros + " a " + tipoMoneda + " " + moneda);
    }
}
