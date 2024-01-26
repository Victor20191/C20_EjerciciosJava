package b3;
import java.util.Scanner;
public class EjemplosCondicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String diaDeLaSemana = obtenerDiaDeLaSemana(numero);

        System.out.println("El día de la semana correspondiente al número " + numero + " es: " + diaDeLaSemana);
    }

    public static String obtenerDiaDeLaSemana(int numero) {
        String dia;

        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "Número no válido. Ingrese un número del 1 al 7.";
                break;
        }

        return dia;
    }
}
/*
    public static void main(String[] args) {

        String nombre = "victor";
        int num = 31;


        if (nombre.equals("victor")){
            System.out.println("Eres el docente");
        }else if (num>18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres el estudiante");
        }

    }}
*/


