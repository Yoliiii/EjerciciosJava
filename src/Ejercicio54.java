import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaracion de variables

        int n,ndni,resto;
        String letraControl;
        char[] letra = new char[]{'T', 'R','W', 'A','G', 'M','Y', 'F','P', 'D','X', 'B','N', 'J','Z', 'S','Q', 'V','H','L', 'C','K','E' };

        //Lectura de datos

        System.out.println("Introduce la letra de tu NIE: ");
        letraControl = sc.next();
        System.out.println("Introduce tu numero del NIE: ");
        n = sc.nextInt();

        //Mostrar datos por pantalla

        if (letraControl.equals("X")) {
            resto = n % 23;
            System.out.println("X" + n + letra[resto]);
        }
        if (letraControl.equals("Y")) {
            ndni = n + 10000000;
            resto = ndni % 23;
            System.out.println("Y" + ndni + letra[resto]);
        }
        if (letraControl.equals("Z")) {
            ndni = n + 20000000;
            resto = ndni % 23;
            System.out.println("Z" + ndni + letra[resto]);
        }


    }
}
