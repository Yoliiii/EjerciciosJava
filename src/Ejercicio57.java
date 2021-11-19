import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nMayor = n[0];
        int nMenor = n[0];

        //Lectura de datos

        System.out.println("Introduce 10 números: ");


        //Mostrar datos por pantalla

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if (n [i] > nMayor) {
                nMayor = i;

            }
            if (n[i] < nMayor) {
                nMenor = i;
            }
        }
        System.out.println("El número mayor es : "+ nMayor + "El número menor es:" + nMenor;
    }
}