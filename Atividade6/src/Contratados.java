public class Contratados extends Empresa{
    private double salario;
    public Contratados(double salario){
        this.salario = salario;
    }
    @Override
    public double calcSalario(){
        return salario*0.71;
    }
}
