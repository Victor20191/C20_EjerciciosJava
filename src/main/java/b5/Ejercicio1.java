package b5;
import org.w3c.dom.ls.LSOutput;

/*
 Escribe un programa en Java que solicite al usuario ingresar dos números y realice la operación de división entre ellos.
 Implementa el manejo de excepciones utilizando try, catch y finally. Asegúrate de cubrir los siguientes puntos:
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingresa el primero numero: ");
        int num1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2=scanner.nextInt();

        try {
            System.out.println("el reusltado es: "+(num1/num2));
        }catch (ArithmeticException e){
            System.out.println("Hubo un error en la operación"+e);
        }finally {
            System.out.println("Continua ejecución del programa");
        }
        scanner.close();

    }


}
