import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o id da bomba: ");

        String idBomba = sc.nextLine();

        Bomba bomba = new Bomba();

        ArrayList<Combustivel> combustiveis = new ArrayList<Combustivel>();

        bomba.setIdentificador(idBomba);

        boolean cont = true;

        while (cont){
            System.out.println("Digite o nome do combustível: ");
            String nomeCombustivel = sc.nextLine();

            System.out.println("Digite o preço do combustível: ");
            double precoCombustivel = sc.nextDouble();

            Combustivel combustivel = new Combustivel();

            combustivel.setNome(nomeCombustivel);
            combustivel.setPreco(precoCombustivel);
            combustiveis.add(combustivel);

            System.out.println("Deseja continuar? 's' ou 'n'");
            sc.nextLine();
            String querContinuar = sc.nextLine();
            if (!querContinuar.equals("s")){
                cont = false;
            }
        }

        bomba.setCombustiveis(combustiveis);

        cont = true;

        while (cont){
            System.out.println("Digite 1 para abastecer por litros: ");
            System.out.println("Digite 2 para abastecer por dinheiro: ");

            int opc = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o código do combustível: ");
            for (int i = 0; i < bomba.getCombustiveis().size(); i++){
                System.out.print(i+" - "+bomba.getCombustiveis().get(i).getNome()+" / ");
            }
            System.out.println("");
            int codigoCombust = sc.nextInt();

            if (opc == 1){
                System.out.println("Digite a quantidade de litros: ");
                double qtdeLitrosEscolhida = sc.nextDouble();
                double dinheiro = bomba.getCombustiveis().get(codigoCombust).abastecerLitros(qtdeLitrosEscolhida);
                System.out.printf("O total da conta é de %.2f reais!%n",dinheiro);

            } else if (opc == 2){
                System.out.println("Digite a quantidade de dinheiro: ");
                double qtdeDinheiroEscolhida = sc.nextDouble();
                double litros = bomba.getCombustiveis().get(codigoCombust).abastecerDinheiro(qtdeDinheiroEscolhida);
                System.out.printf("Foram abastecidos %.2f litros!%n",litros);
            } else {
                System.out.println("Opção inexistente!");
            }

            System.out.println("Deseja continuar? 's' ou 'n'");
            sc.nextLine();

            String desejaContinuar = sc.nextLine();
            if (!desejaContinuar.equals("s")){
                cont = false;
            }
        }
    }
}
