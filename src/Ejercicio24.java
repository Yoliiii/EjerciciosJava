import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        String mes;

        //Lectura de datos

        System.out.println("Introduce un mes: ");
        mes = sc.next();

        //Mostrar datos por pantscalla

        switch (mes) {
            case "enero" :
            case "marzo" :
            case "mayo" :
            case "juio" :
            case "agosto" :
            case "octubre" :
            case "diciembre" :
                System.out.println("Tiene 31 días");
                break;
            case "abril" :
            case "junio" :
            case "septiembre" :
            case "noviembre" :
                System.out.println("Tiene 30 días");
                break;
            case "febrero" :
                System.out.println("Tiene 28 días");

            default:
        }
    }
}
