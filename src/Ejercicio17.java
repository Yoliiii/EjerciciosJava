import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Introduce numero 1: ");
        valor1 = sc.nextInt();
        System.out.println("Introduce numero 2: ");
        valor2 = sc.nextInt();


        if (valor1>=valor2){
            System.out.println("Valor 1 es el mayor");
        }
        if (valor1<valor2) {
            System.out.println("Valor 2 es el mayor");

        }

    }


    }
