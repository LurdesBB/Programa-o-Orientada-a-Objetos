import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String nome;
        System.out.println("Digite o seu nome:");
        nome = sc.next();
        System.out.println("Digite o numero de vezes que seu nome ira se repetir:");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("%s%n",nome);
        }

    }
}