package jogo.model;

public class JogoFisico extends Jogo {
	private int minDiasEntrega;
	
	public JogoFisico(int id, String nome, String plataforma, String classificacao, int midia, float preco) {
		super(id, nome, plataforma, classificacao, midia, preco);
		this.minDiasEntrega = 3;
	}
	
	public JogoFisico(int id, String nome, String plataforma, String classificacao, int midia, float preco, int minDiasEntrega) {
		super(id, nome, plataforma, classificacao, midia, preco);
		this.minDiasEntrega = minDiasEntrega;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Mínimo de dias para Entrega: " + this.minDiasEntrega);
		System.out.println("\n");
	}

	public int getMinDiasEntrega() {
		return minDiasEntrega;
	}

	public void setMinDiasEntrega(int minDiasEntrega) {
		this.minDiasEntrega = minDiasEntrega;
	}
}
