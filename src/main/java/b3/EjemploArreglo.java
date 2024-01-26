package b3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploArreglo {
    public static void main(String[] args) {

        int[] numeros2=new int[6];
        numeros2[0]=1;
        numeros2[1]=2;
        numeros2[2]=3;
        numeros2[3]=4;
        numeros2[4]=5;
        numeros2[5]=6;
        Arrays.stream(numeros2).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++");
        Arrays.stream(numeros2).forEach(num1-> System.out.println(num1));


        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length);

        List<String> ListNombre = new ArrayList<>();
        ListNombre.add("Victor");
        ListNombre.add("Luis");
        ListNombre.add("Juliana");
        ListNombre.add("Mariana");
        System.out.println("***********");
        ListNombre.stream().forEach(System.out::println);
    }
}