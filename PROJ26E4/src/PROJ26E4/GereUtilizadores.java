package PROJ26E4;
import java.util.ArrayList;
public class GereUtilizadores {
	private ArrayList<Utilizador>utilizadores;
	public GereUtilizadores() {
			utilizadores = new ArrayList<>();
	}
	public void criarUtilizador(Utilizador u) {
		utilizadores.add(u);
		System.out.println("O utilizador foi criado com sucesso!");
	}
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
		public void mostrarUtilizadores() {
			if(utilizadores.size() == 0) {
				System.out.println("A lista de utilizadores está vazia.");
				return;
			}
			for(Utilizador u: utilizadores) {
				System.out.println(u);
			}
		}
		public void atualizarEstadoOcorrencia(Ocorrencia ocorrencia , EstadoOcorrencia novoEstado) {
			ocorrencia.setEstado(novoEstado);
			System.out.println("Estado da Ocorrência atualizado com sucesso!");
		}
		//serve para na class teste na parte de criar ocorrencia pedir quem criou a ocorrencia
		public ArrayList<Utilizador>getUtilizadores(){
			return utilizadores;
		}
}
