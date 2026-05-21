package PROJ26E4;
import java.util.ArrayList;
public class GereUtilizadores {
	private ArrayList<Utilizador>utilizadores;
	public GereUtilizadores() {
			utilizadores = new ArrayList<>();
	}
//criar utilizador
	public void criarUtilizador(Utilizador u) {
		utilizadores.add(u);
		System.out.println("O utilizador foi criado com sucesso!");
	}
	//remover utilizador
	public void removerUtilizador(String idUtilizador) {
		for(Utilizador u: utilizadores) {
			if(u.getIdUtilizador().equalsIgnoreCase(idUtilizador)) {
				utilizadores.remove(u);
				System.out.println("O utilizador foi removido com sucesso!");
				return;
				}
			}
				System.out.println("O utilizador não foi encontrado!");
		}
		//listar utilizadores
		public void mostrarUtilizadores() {
			if(utilizadores.size() == 0) {
				System.out.println("A lista de utilizadores está vazia.");
				return;
			}
			for(Utilizador u: utilizadores) {
				System.out.println(u);
			}
		}
		//atualizar Estado da Ocorrencia
		public void atualizarEstadoOcorrencia(Ocorrencia ocorrencia , EstadoOcorrencia novoEstado) {
			ocorrencia.setEstado(novoEstado);
			System.out.println("Estado da Ocorrência atualizado com sucesso!");
		}
}
