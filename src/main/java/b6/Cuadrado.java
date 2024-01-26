package b6;

public class Cuadrado implements Forma {

    double lado;
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void mostrar() {
        System.out.println(lado);
    }
}
