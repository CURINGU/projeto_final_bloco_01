package jogo.model;

public abstract class Jogo {
	private int id;
	private String nome;
	private String plataforma;
	private String classificacao;
	private int midia;
	private float preco;
	
	public Jogo(int id, String nome, String plataforma, String classificacao, int midia, float preco) {
		this.id = id;
		this.nome = nome;
		this.plataforma = plataforma;
		this.classificacao = classificacao;
		this.midia = midia;
		this.preco = preco;
	}
	
	public void visualizar() {
		String tipoMidia = "";
		switch(this.midia) {
			case 1:
				tipoMidia = "Física";
				break;
			case 2:
				tipoMidia = "Digital";
				break;
		}
		
		System.out.println("Informações do Jogo:");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("classificacao: " + this.classificacao);
		System.out.println("Tipo de Mídia do jogo: " + tipoMidia);
		System.out.println("Preco: " + this.preco);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public int getMidia() {
		return midia;
	}

	public void setMidia(int midia) {
		this.midia = midia;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
