import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variable

        int valor;

        //Lectura de datos

        System.out.println("Introduce un numero: ");
        valor = sc.nextInt();

        //Muestra resultado por pantalla

        if (valor >= 0 & valor < 3) {
            System.out.println("Muy deficiente");
           } else {

        if (valor >= 3 & valor < 5) {
            System.out.println("Insuficiente");
            } else {

            if (valor >= 5 & valor < 6) {
                System.out.println("Suficiente");
            } else {

                if (valor >= 6 & valor < 7) {
                    System.out.println("Bien");
            } else {

                    if (valor >= 7 & valor < 9) {
                        System.out.println("Notable");
                } else {

                        if (valor >= 9 & valor < 11) {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }

        }

    }


}


