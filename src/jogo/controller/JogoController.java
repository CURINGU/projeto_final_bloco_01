package jogo.controller;
import java.util.ArrayList;
import jogo.model.Jogo;
import jogo.repository.JogoRepository;

public class JogoController implements JogoRepository{
	
	private ArrayList<Jogo> listaJogos = new ArrayList<Jogo>();
	int id = 0;
	
	@Override
	public void cadastrar(Jogo jogo) {
		listaJogos.add(jogo);
		System.out.println("\n" + jogo.getNome() + " foi cadastrado com sucesso!");
	}

	@Override
	public void listarTodos() {
		for (var jogo : listaJogos)
		{
			jogo.visualizar();
		}
	}

	@Override
	public void atualizar(Jogo jogo) {
		var buscaJogo = buscarNaCollection(jogo.getId());
		
		if(buscaJogo != null)
		{
			listaJogos.set(listaJogos.indexOf(buscaJogo), jogo);
			System.out.println("\nO jogo: " + jogo.getNome() + " foi atualizada com sucesso!");
		}
		else
		{
			System.out.println("\nO jogo de ID: " + jogo.getId() + " não foi encontrada!");
		}
	}

	@Override
	public void deletar(int id) {
		var jogo = buscarNaCollection(id);
		
		if(jogo != null)
		{
			if(listaJogos.remove(jogo) == true)
			{
				System.out.println("\nO jogo de ID: " + id + " foi deletado com sucesso!");
			}
		}
		else
		{
			System.out.println("\nO jogo de ID: " + id + " não foi encontrado!");
		}
	}
	
	public int gerarId()
	{
		return ++ id;
	}
	
	public Jogo buscarNaCollection(int id)
	{
		for(var jogo: listaJogos)
		{
			if(jogo.getId() == id)
			{
				return jogo;
			}
		}
		
		return null;
	}
}
