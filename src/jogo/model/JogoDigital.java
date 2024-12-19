package jogo.model;

public class JogoDigital extends Jogo{
	public int peso;
	
	public JogoDigital(int id, String nome, String plataforma, String classificacao, int midia, float preco, int peso) {
		super(id, nome, plataforma, classificacao, midia, preco);
		this.peso = peso;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Peso para Download: " + this.peso + "GB");
		System.out.println("\n");
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
