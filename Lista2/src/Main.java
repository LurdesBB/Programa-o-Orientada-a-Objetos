import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> senha = new ArrayList<Integer>();
        int opc;

        do{
            opc = Menu();
            switch (opc){
                case 1:
                    emitirSenha(senha);
                    break;
                case 2:
                    System.out.print("Digite a senha que quer desistir da fila: ");
                    int desistente = sc.nextInt();
                    desistirFila(senha,desistente);
                    break;
                case 3:
                    atenderUsuario(senha);
                    break;
                case 4:
                    System.out.print("Digite a senha para saber a posição: ");
                    int num = sc.nextInt();
                    int posicao = buscarPosicao(senha,num);
                    if(posicao != -1){
                        System.out.println("Posição: "+(posicao + 1));
                    }else{
                        System.out.println("Está senha não existe!");
                    }
                    break;
                case 5:
                    imprimirFila(senha);
                    break;
                case 6:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Opção invalida! Escolha outra opção!");
                    break;
            }
        }while(opc != 6);
    }

    public static int Menu() {
        int opc;

        System.out.println("\n1 - Emitir senha");
        System.out.println("2 - Desistir da fila");
        System.out.println("3 - Atender senha");
        System.out.println("4 - Buscar posicao da senha na fila");
        System.out.println("5 - Imprimir a fila");
        System.out.println("6 - Fechar o programa");
        System.out.print("Opção: ");

        Scanner sc = new Scanner(System.in);
        opc = sc.nextInt();
        return opc;
    }

    public static void emitirSenha(ArrayList<Integer> senha){
        SecureRandom rand = new SecureRandom();
        int numero = rand.nextInt(100);
        senha.add(senha.size(),numero);
        System.out.println("Senha emitida: "+numero);
    }

    public static void desistirFila(ArrayList<Integer> senha, int desistente) {
        if(senha.contains(desistente)){
            senha.remove((Integer)desistente);
            System.out.println("A senha removida é: "+desistente);
        }else{
            System.out.println("A senha não existe!");
        }
    }

    public static void atenderUsuario(ArrayList<Integer> senha){
        if(!senha.isEmpty()){
            int atendida = senha.get(0);
            System.out.println("A senha atendida é: "+atendida);
            senha.remove((Integer)atendida);
        }else{
            System.out.println("A fila está vazia!");
        }
    }

    public static int buscarPosicao(ArrayList<Integer> senha, int num){
        if(senha.contains(num)){
            return senha.indexOf(num);
        }else{
            return -1;
        }
    }

    public static void imprimirFila(ArrayList<Integer> senha){
        System.out.print("Fila: ");
        for(int num : senha){
            System.out.print(num+" - ");
        }
        System.out.println();
    }
}
