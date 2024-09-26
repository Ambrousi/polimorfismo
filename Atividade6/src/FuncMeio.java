public class FuncMeio extends Empresa {
        private double salario;
        public FuncMeio(double salario){
            this.salario = salario;
        }
        @Override
        public double calcSalario(){
            return salario*1.2;
        }
}
