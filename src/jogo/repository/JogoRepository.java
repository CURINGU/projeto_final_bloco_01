package jogo.repository;
import jogo.model.Jogo;

public interface JogoRepository {
	public void cadastrar(Jogo jogo);
	public void listarTodos();
	public void atualizar(Jogo jogo);
	public void deletar(int id);
}
