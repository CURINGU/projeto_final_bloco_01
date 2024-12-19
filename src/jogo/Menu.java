package jogo;
import java.io.IOException;
import java.util.Scanner;
import jogo.model.JogoFisico;
import jogo.model.JogoDigital;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		JogoFisico jf1 = new JogoFisico(1, "GTA VI", "Playstation 5", "+18", 1, 499f);
		jf1.visualizar();
		
		JogoDigital jd1 = new JogoDigital(1, "GTA VI", "Playstation 5", "+18", 1, 499f, 250);
		jd1.visualizar();

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
					
					keyPress();
					break;
				case 2:
					System.out.println("Listar todos os Jogos\n\n");
					
					keyPress();
					break;
				case 3:
					System.out.println("Atualizar jogo\n\n");

					keyPress();
					break;
				case 4:
					System.out.println("Deletar jogo\n\n");

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
