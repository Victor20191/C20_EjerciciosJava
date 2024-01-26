package b4;

import java.util.ArrayList;
import java.util.List;

public class ClaseCiclos {
    public static void main(String[] args) {
        int contador=0;
         while(contador<5){
             System.out.println("Contador= "+contador);
             contador++;

         }

        System.out.println("++++++++++++++++++++++++++++++++");
         int contador2=0;
         do {
             System.out.println("contador"+contador2);
             contador2++;

         }while (contador2<5);
        System.out.println("++++++++++++++++++++++++++++++++");

       for(int i=0;i<5;i++){
                System.out.println("Valor de i ="+i);
            }
        System.out.println("++++++++++++++++++++++++++++++++");
        List<String> ListNombre = new ArrayList<>();
        ListNombre.add("Victor");
        ListNombre.add("Luis");

        for(String nombre:ListNombre){

            System.out.println(nombre);
        }
        System.out.println("++++++++++++++++++++++++++++++++");
        ListNombre.stream().forEach(nombre-> System.out.println(nombre));
    }
}
