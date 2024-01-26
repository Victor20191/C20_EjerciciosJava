package b2;

import java.util.ArrayList;
import java.util.List;

public class universidad {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante("Victor","Rivera",30,1212);
        estudiante.setSemestre(1);

        List<Materias>ListMaterias=List.of(new Materias("matematicas"),new Materias("fisica"));

        estudiante.setMateriasList(ListMaterias);

        System.out.println(estudiante.getNombre());
        estudiante.getMateriasList().stream().forEach(a-> System.out.println(a.nombre));

    }
}
