public class FuncIntegral extends Empresa{
    private double salario;
    public FuncIntegral(double salario){
        this.salario = salario;
    }
    @Override
    public double calcSalario(){
        return salario*1.8;
    }
}
