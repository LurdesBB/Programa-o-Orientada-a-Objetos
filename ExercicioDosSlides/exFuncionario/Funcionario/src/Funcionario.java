public class Funcionario {
    public String nome;
    public double salario;

    private static double vale = 300;

    public static void ajustarValor(double aumento){
        vale = vale * aumento;
    }

    public static double getVale(){
        return vale;
    }
}
