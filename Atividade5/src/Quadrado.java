public class Quadrado extends FormasGeo{
    private double x;
    public Quadrado(double x){
        this.x = x;
    }
    @Override
    public double calcArea() {
        return Math.pow(x, 2);
    }
}
