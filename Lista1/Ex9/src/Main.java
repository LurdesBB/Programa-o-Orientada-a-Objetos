import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura, imc;

        System.out.println("Digite seu peso:");
        peso = sc.nextInt();
        System.out.println("Digite sua altura:");
        altura = sc.nextFloat();

        imc = peso/(altura*altura);

        System.out.printf("O seu IMC é %.2f",imc);
    }
}