import java.util.Scanner;

public class sla {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n1, n2, soma;
        System.out.print("Tá funcionando perfeitamente!");

        System.out.print("\nDigite um numero:");
        n1 = input.nextInt();
        System.out.print("\nDigite outro numero:");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.printf("\nO resultado da soma é %d!%n",soma);
    }
}
