public class Main {
    public static void main(String[] args) {
    FuncIntegral func = new FuncIntegral(1400);
    FuncMeio funcM = new FuncMeio(1400);
    Contratados contratado = new Contratados(1400);

        System.out.println(func.calcSalario());
        System.out.println(funcM.calcSalario());
        System.out.println(contratado.calcSalario());
    }
}