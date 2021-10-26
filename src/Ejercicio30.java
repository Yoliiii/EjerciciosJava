import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración de variables

        String dia;


        //Lectura de datos

        System.out.println("Introduce un dia de la semana para saber el horario de apertura: ");
        dia = sc.next();

        //Mostrar resultados por pantalla

        int opening_time = dia.equals("sabado") || dia.equals("domingo") ? 12 : 9;

        System.out.println("Hora de apertura:" + opening_time);



        }
    }
