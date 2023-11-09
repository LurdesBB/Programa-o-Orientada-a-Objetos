import java.util.Scanner;

public class printfCondicao {
    public static void main(String [] args){
        int x, y, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        y = sc.nextInt();
        soma = (x+y)/2;
        System.out.println(soma>4 ? "A media é maior que 4!" : "A media é menor que 4!");
    }
}
