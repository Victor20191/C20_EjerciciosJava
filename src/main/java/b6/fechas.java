package b6;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;
public class fechas {

    public static void main(String[] args) {

        DateTimeFormatter FormatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrsa tu fecha de nacimiento en formato:dd/MM/yyyy");
        String fecha=scanner.nextLine();

        LocalDate fechaNac=LocalDate.parse(fecha,FormatoFecha);
        LocalDate Ahora=LocalDate.now();

        Period periodo =Period.between(fechaNac,Ahora);
        System.out.printf("Tu edad es: %d años, %d meses y %d días\n", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
