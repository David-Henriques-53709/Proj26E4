package PROJ26E4;
import java.util.ArrayList;
import java.util.Scanner;
public class GereUtilizadores {
	private ArrayList<Utilizador>utilizadores;
	public GereUtilizadores() {
			utilizadores = new ArrayList<>();
	}
	public void criarUtilizador(Utilizador u) {
	    for (Utilizador existente : utilizadores) {
	        if (existente.getIdUtilizador().equalsIgnoreCase(u.getIdUtilizador())) {
	            System.out.println("Já existe um utilizador com esse ID!");
	            return;
	        }
	    }
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
		    int manutencao_geral = 0;
		    int eletricidade = 0;
		    int climatizacao_ventilacao = 0;
		    int seguranca = 0;
		    int limpeza = 0;
		    int marketing = 0;
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
		                case Manutencao_Geral:
		                    manutencao_geral++;
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
		                case Marketing:
		                	marketing++;
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
		    System.out.println("Manutenção Geral           : " + manutencao_geral);
		    System.out.println("Elétrica                   : " + eletricidade);
		    System.out.println("Climatização e Ventilação  : " + climatizacao_ventilacao);
		    System.out.println("Segurança                  : " + seguranca);
		    System.out.println("Limpeza                    : " + limpeza);
		    System.out.println("Marketing                  : " + marketing);
		    System.out.println("Equipamentos               : " + equipamentos);
		    System.out.println("\n===============================");
		}
		public Utilizador login(String email, String password) {
		    for (Utilizador u : utilizadores) {
		        if (u.getEmail().equalsIgnoreCase(email)) {
		            if (u.isBloqueado()) {
		                System.out.println("Conta bloqueada! Contacte o administrador.");
		                return null;
		            }
		            if (u.getPassword().equals(password)) {
		                u.resetarTentativas();
		                return u;
		            } else {
		                u.incrementarTentativas();
		                int restantes = 5 - u.getTentativasFalhadas();
		                if (u.getTentativasFalhadas() >= 5) {
		                    u.bloquear();
		                    System.out.println("Conta bloqueada após 5 tentativas falhadas!");
		                } else {
		                    System.out.println("Password incorrecta! Tentativas restantes: " + restantes);
		                }
		                return null;
		            }
		        }
		    }
		    System.out.println("Email não encontrado!");
		    return null;
		}
		public void desbloquearUtilizador(Scanner sc, ArrayList<Utilizador> utilizadores) {
		    ArrayList<Utilizador> bloqueados = new ArrayList<>();
		    for (Utilizador u : utilizadores) {
		        if (u.isBloqueado()) {
		            bloqueados.add(u);
		        }
		    }
		    if (bloqueados.isEmpty()) {
		        System.out.println("Não existem contas bloqueadas.");
		        return;
		    }
		    System.out.println("\n===== CONTAS BLOQUEADAS =====");
		    for (int i = 0; i < bloqueados.size(); i++) {
		        System.out.println((i + 1) + " - " + bloqueados.get(i).getNome());
		    }
		    System.out.print("Escolha o utilizador a desbloquear: ");
		    int escolha = sc.nextInt();
		    sc.nextLine();
		    bloqueados.get(escolha - 1).desbloquear();
		    System.out.println("Conta desbloqueada com sucesso!");
		}
		public ArrayList<Utilizador> getTecnicos() {
		    ArrayList<Utilizador> tecnicos = new ArrayList<>();
		    for (Utilizador u : utilizadores) {
		        if (u.isTecnico()) {
		            tecnicos.add(u);
		        }
		    }
		    return tecnicos;
		}
}