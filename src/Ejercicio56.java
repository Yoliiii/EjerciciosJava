import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        int nMayor;
        int nMenor;
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Lectura de datos

        //Mostrar datos por pantalla

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if (n[i] > nMayor) {
                nMayor = i;
            }
        }
        System.out.println("El número mayor: " + nMayor);
    }

}
