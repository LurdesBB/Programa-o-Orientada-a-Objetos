package bombaCombustivel;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o identificador "
				+ "da bomba");
		
		String idBomba = sc.nextLine();
		
		Bomba bomba = new Bomba();
		
		ArrayList<Combustivel> combustiveis = 
				new ArrayList<Combustivel>();
		
		bomba.setIdentificador(idBomba);
		
		boolean continuar = true;
		
		while (continuar){
			System.out.println("Digite o nome do combust�vel");
			String nomeCombustivel = sc.nextLine();
			System.out.println("Digite o pre�o do combust�vel");
			double precoCombustivel = sc.nextDouble();
			Combustivel combustivel = new Combustivel();
			
			combustivel.setNome(nomeCombustivel);
			combustivel.setPreco(precoCombustivel);
			combustiveis.add(combustivel);
			
			System.out.println("Deseja continuar? s ou n");
			sc.nextLine();
			String desejaContinuar = sc.nextLine();
			if (!desejaContinuar.equals("s")){
				continuar = false;
			}
		}
		
		bomba.setCombustiveis(combustiveis);
		
		continuar = true;
		
		while (continuar){
			System.out.println("Digite 1 para abastecer por litros");
			System.out.println("Digite 2 para abastecer por dinheiro");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite o codigo do combust�vel...c�digos:  ");
			for (int i = 0; i < bomba.getCombustiveis().size(); i++){
				System.out.print(i+"-"+bomba.getCombustiveis().get(i).getNome()+", ");
			}
			System.out.println("");
			int codigoCombust = sc.nextInt();
			
			if (opcao == 1){
				System.out.println("Digite a quantidade de litros");
				double qtdeLitrosEscolhida = sc.nextDouble();
				double dinheiro = 
						bomba.getCombustiveis().get(codigoCombust).abastecerLitros(qtdeLitrosEscolhida);
				System.out.printf("O total da conta � de %.2f reais%n", dinheiro);
				
	 		} else if (opcao == 2){
	 			System.out.println("Digite a quantidade de dinheiro");
	 			double qtdeDinheiroEscolhida = sc.nextDouble();
	 			double litros = 
	 					bomba.getCombustiveis().get(codigoCombust).abastecerDinheiro(qtdeDinheiroEscolhida);
	 			System.out.printf("Foram abastecidos %.2f litros%n", litros);
	 		} else {
	 			System.out.println("Op��o inexistente");
	 		}
			
			System.out.println("Deseja continuar? s ou n");
			sc.nextLine();
			String desejaContinuar = sc.nextLine();
			if (!desejaContinuar.equals("s")){
				continuar = false;
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
