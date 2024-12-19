package jogo;
import java.io.IOException;
import java.util.Scanner;
import jogo.model.JogoFisico;
import jogo.controller.JogoController;
import jogo.model.JogoDigital;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		JogoController jogos = new JogoController();

		int opcao;
		
		JogoFisico jf1 = new JogoFisico(1, "GTA VI", "Playstation 5", "+18", 1, 499f, 5);
		jf1.visualizar();
		
		JogoDigital jd1 = new JogoDigital(1, "GTA VI", "Playstation 5", "+18", 1, 499f, 250);
		jd1.visualizar();
		
		int id, midia = 0, minDias, tamanho;
		String nome, plataforma, classificacao;
		float preco = 0;

		while (true) {

			System.out.println("Futura Era Games");
			System.out.println("1 - Cadastrar Jogo");
			System.out.println("2 - Listar todos os Jogos");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar um jogo");
			System.out.println("5 - Sair");
			System.out.println("\nEntre com a opção desejada:");

			opcao = leia.nextInt();

			if (opcao == 5) {
				System.out.println("\nFutura Era Games - Os melhores Jogos com o melhor Preço!");
				sobre();
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Jogo\n\n");
					System.out.println("Digite o Nome do Jogo: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					
					System.out.println("Digite a Plataforma do Jogo: ");
					leia.skip("\\R?");
					plataforma = leia.nextLine();
					
					System.out.println("Digite a Classificação do Jogo: ");
					leia.skip("\\R?");
					classificacao = leia.nextLine();
					
					boolean repetirMidia = true;
					do {
						System.out.println("Digite o Tipo de Mídia (1-Física ou 2-Digital): ");
						midia = leia.nextInt();
						if(midia > 2 || midia < 1)
						{
							System.out.println("Tipo Inválido!");
						}
						else
						{
							repetirMidia = false;
						}
					} while(repetirMidia);
					
					boolean repetirPreco = true;
					do {
						System.out.println("Digite o Preço do jogo (R$): ");
						preco = leia.nextFloat();
						repetirPreco = false;
					} while(repetirPreco);
					
					
					switch(midia) {
					case 1 -> {
							System.out.println("Digite o Mínimo de dias para Entrega: ");
							minDias = leia.nextInt();
							jogos.cadastrar(new JogoFisico(jogos.gerarId(), nome, plataforma, classificacao, midia, preco, minDias));
						}
					case 2 -> {
						System.out.println("Digite o Tamanho do jogo (GB): ");
						tamanho = leia.nextInt();
						jogos.cadastrar(new JogoDigital(jogos.gerarId(), nome, plataforma, classificacao, midia, preco, tamanho));
						}
					}
					keyPress();
					break;
				case 2:
					System.out.println("Listar todos os Jogos\n\n");
					jogos.listarTodos();
					keyPress();
					break;
				case 3:
					System.out.println("Atualizar jogo\n\n");
					
					System.out.println("Digite o ID do jogo: ");
					id = leia.nextInt();
					
					var buscaJogo = jogos.buscarNaCollection(id);
					
					if(buscaJogo != null)
					{
						midia = buscaJogo.getMidia();
						
						System.out.println("Digite o Nome do Jogo: ");
						leia.skip("\\R?");
						nome = leia.nextLine();
						
						System.out.println("Digite a Plataforma do Jogo: ");
						leia.skip("\\R?");
						plataforma = leia.nextLine();
						
						System.out.println("Digite a Classificação do Jogo: ");
						leia.skip("\\R?");
						classificacao = leia.nextLine();
						
						boolean repetirPreco1 = true;
						do {
							System.out.println("Digite o Preço do jogo (R$): ");
							preco = leia.nextFloat();
							repetirPreco1 = false;
						} while(repetirPreco1);
						
						
						switch(midia) {
						case 1 -> {
								System.out.println("Digite o Mínimo de dias para Entrega: ");
								minDias = leia.nextInt();
								jogos.cadastrar(new JogoFisico(jogos.gerarId(), nome, plataforma, classificacao, midia, preco, minDias));
							}
						case 2 -> {
							System.out.println("Digite o Tamanho do jogo (GB): ");
							tamanho = leia.nextInt();
							jogos.cadastrar(new JogoDigital(jogos.gerarId(), nome, plataforma, classificacao, midia, preco, tamanho));
							}
						}
					}
					else
					{
						System.out.println("O Jogo não foi encontrado!");
					}
					keyPress();
					break;
				case 4:
					System.out.println("Deletar jogo\n\n");
					
					System.out.println("Digite o ID do Jogo: ");
					id = leia.nextInt();
					
					jogos.deletar(id);
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\nProjeto Desenvolvido por: ");
		System.out.println("Otávio Ferreira da Silva");
		System.out.println("github.com/CURINGU/projeto_final_bloco_01");
	}

	public static void keyPress() {

		try {
			System.out.println("\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
