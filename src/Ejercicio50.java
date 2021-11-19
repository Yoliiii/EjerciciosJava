import java.util.Scanner;

public class Ejercicio50 {
    public static void main (String [] args) {

        //Declaración de variables

        boolean valorPrimo = false;
        int divisor = 0;

        //Muestra el resultado por pantalla

        for(int i = 3; i <= 100; i++) {
            if (i % 2 == 0) {
                valorPrimo = false;

            } else {

                for (int j = 1; j <= i; j++) {
                    if (i % 1 == 0) {
                        divisor ++;
                    }
                    if (divisor > 2) {
                        valorPrimo = false;
                        break;
                    } else if(divisor == 2) {
                        valorPrimo =true;
                    }
                }

            }

        }

    }

}
