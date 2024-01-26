package b6;

public class EjemploEnum {

    public static void main(String[] args) {
        Dia hoy=Dia.LUNES;

        switch (hoy){
            case LUNES -> System.out.println("Hoy es lunes");
            case MARTES -> System.out.println("Hoy es martes");
            case MIERCOLES -> System.out.println("Hoy es mircoles");
        }
    }
}
