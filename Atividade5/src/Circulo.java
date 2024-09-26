public class Circulo extends FormasGeo{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double calcArea(){
        return Math.PI*raio*raio;
    }
}