import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        String palabra;
        char [] palindromo = palabra.toCharArray();
        int normal;
        int reverso = palindromo.length - 1;

        //Lectura de datos

        System.out.println("Escribe una palabra para reconocer un palindroma: ");
        palabra = sc.next();

        //Mostrar datos por pantalla

        while (normal < reverso) {
            if (palindromo[normal] == palindromo[reverso]) {
                normal++;
                reverso--;
            } else {
                System.out.println("No es palindromo");
                break;
            }
            if (palindromo[normal] == palindromo[reverso]) {
                System.out.println("Es palindromo");
            }

        }
        }

}
