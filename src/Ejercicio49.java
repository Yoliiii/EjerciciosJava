import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Declaracion de variable

        int numeroIntroducido;
        boolean esPrimo;

     System.out.println("Introduce un numero: ");
     numeroIntroducido = sc.nextInt();

     // Lectura de datos

        if (numeroIntroducido == 2) {
            esPrimo = true;
        }
        if (numeroIntroducido % 2 == 0) {
            esPrimo = false;
        } else if (numeroIntroducido % 2 != 0) {



            for (int i = 3; i < numeroIntroducido/2; i=i+2){
                if (numeroIntroducido % i == 0){
                    esPrimo = false;
                }
            }
        }
    }
}
