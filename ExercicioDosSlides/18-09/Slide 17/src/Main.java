import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int n1 = 10, n2 = 2;
        double n3 = 10.1, n4 = 10.8;

        System.out.println(calcularPotencia(n1,n2));
        System.out.println(calcularMinimo(n3,n4));

    }
    public static double calcularPotencia(int a, int b){
        return Math.pow(a,b);
    }

    public static int calcularMinimo(double a, double b){
        return Math.min((int)a, (int)b);
    }
}