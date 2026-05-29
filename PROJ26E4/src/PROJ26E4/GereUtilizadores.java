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
		public void criarRelatorioOcorrencias() {
		    int total = 0;
		    int concluidas = 0;
		    int pendentes = 0;
		    int informatica = 0;
		    int estrutura = 0;
		    int eletricidade = 0;
		    int climatizacao_ventilacao = 0;
		    int seguranca = 0;
		    int limpeza = 0;
		    int equipamentos = 0;
		    for(Utilizador u : utilizadores) {
		        for(Ocorrencia o : u.getOcorrencias()) {
		            total++;
		            if(o.getEstadoAtual().getNomeEstado().equals("Concluída")) {
		                concluidas++;
		            } else {
		                pendentes++;
		            }
		            switch(o.getCategoria()) {
		                case Informatica:
		                    informatica++;
		                    break;
		                case Estrutura:
		                    estrutura++;
		                    break;
		                case Eletricidade:
		                    eletricidade++;
		                    break;
		                case Climatizacao_Ventilacao:
		                    climatizacao_ventilacao++;
		                    break;
		                case Seguranca:
		                    seguranca++;
		                    break;
		                case Limpeza:
		                    limpeza++;
		                    break;
		                case Equipamentos:
		                    equipamentos++;
		                    break;
		            }
		        }
		    }
		    System.out.println("\n========== RELATÓRIO ==========");
		    System.out.println("\nTotal de ocorrências: " + total);
		    System.out.println("\n===== POR ESTADO =====");
		    System.out.println("Concluídas : " + concluidas);
		    System.out.println("Em Progresso  : " + pendentes);
		    System.out.println("\n===== POR CATEGORIA =====");
		    System.out.println("Informática                : " + informatica);
		    System.out.println("Estrutural                 : " + estrutura);
		    System.out.println("Elétrica                   : " + eletricidade);
		    System.out.println("Climatização e Ventilação  : " + climatizacao_ventilacao);
		    System.out.println("Segurança                  : " + seguranca);
		    System.out.println("Limpeza                    : " + limpeza);
		    System.out.println("Equipamentos               : " + equipamentos);
		    System.out.println("\n===============================");
		}
}