package b2;
import java.util.Scanner;
public class EjemploScanner {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Ingrese su nombre:");
            String nombre=scanner.nextLine();

        System.out.println("Ingrese su edad:");
        int edad=scanner.nextInt();

        System.out.println("Hola "+nombre+" Tienes "+edad+ " años de edad");
        scanner.close();
    }
}