public class Triangulo extends FormasGeo{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
        }
    @Override
    public double calcArea(){
        return base*altura/2;
    }
}
