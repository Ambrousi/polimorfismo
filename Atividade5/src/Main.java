public class Main {
    public static void main(String[] args) {
    Triangulo triangulo = new Triangulo(7,9);
    Quadrado quadrado = new Quadrado(5);
    Circulo circulo = new Circulo(8);

        System.out.println(triangulo.calcArea());
        System.out.println(quadrado.calcArea());
        System.out.println(circulo.calcArea());
    }
}