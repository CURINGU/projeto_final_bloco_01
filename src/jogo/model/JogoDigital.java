package jogo.model;

public class JogoDigital extends Jogo{
	public int tamanho;
	
	public JogoDigital(int id, String nome, String plataforma, String classificacao, int midia, float preco, int tamanho) {
		super(id, nome, plataforma, classificacao, midia, preco);
		this.tamanho = tamanho;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Tamanho para Download: " + this.tamanho + "GB");
		System.out.println("\n");
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int peso) {
		this.tamanho = peso;
	}
}
