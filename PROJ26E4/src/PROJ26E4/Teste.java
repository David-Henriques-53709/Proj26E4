package PROJ26E4;
import java.time.LocalDate;
import java.util.Scanner;

public class Teste {
	public void mostrarSistema() {
	    System.out.println("███████╗██╗███████╗████████╗███████╗███╗   ███╗ █████╗ ");
	    System.out.println("██╔════╝██║██╔════╝╚══██╔══╝██╔════╝████╗ ████║██╔══██╗");
	    System.out.println("███████╗██║███████╗   ██║   █████╗  ██╔████╔██║███████║");
	    System.out.println("╚════██║██║╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║██╔══██║");
	    System.out.println("███████║██║███████║   ██║   ███████╗██║ ╚═╝ ██║██║  ██║");
	    System.out.println("╚══════╝╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝");
	    System.out.println();
	    System.out.println(" ██████╗  ██████╗ ██████╗ ██████╗ ██████╗ ███████╗███╗   ██╗ ██████╗██╗ █████╗ ███████╗");
	    System.out.println("██╔═══██╗██╔════╝██╔═══██╗██╔══██╗██╔══██╗██╔════╝████╗  ██║██╔════╝██║██╔══██╗██╔════╝");
	    System.out.println("██║   ██║██║     ██║   ██║██████╔╝██████╔╝█████╗  ██╔██╗ ██║██║     ██║███████║███████╗");
	    System.out.println("██║   ██║██║     ██║   ██║██╔══██╗██╔══██╗██╔══╝  ██║╚██╗██║██║     ██║██╔══██║╚════██║");
	    System.out.println("╚██████╔╝╚██████╗╚██████╔╝██║  ██║██║  ██║███████╗██║ ╚████║╚██████╗██║██║  ██║███████║");
	    System.out.println(" ╚═════╝  ╚═════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝╚═╝╚═╝  ╚═╝╚══════╝");
	    System.out.println();
	    System.out.println("██╗   ██╗██████╗ ████████╗");
	    System.out.println("██║   ██║██╔══██╗╚══██╔══╝");
	    System.out.println("██║   ██║██████╔╝   ██║   ");
	    System.out.println("██║   ██║██╔═══╝    ██║   ");
	    System.out.println("╚██████╔╝██║        ╚═╝   ");
	    System.out.println(" ╚═════╝ ╚═╝              ");
	    System.out.println("\n=======================================================");
	    System.out.println("              SISTEMA DE OCORRÊNCIAS UPT");
	    System.out.println("=======================================================\n");
	    System.out.println("=======================================================\n");
	    System.out.println("                 ELEMENTOS DO GRUPO\n");
	    System.out.println("53841 - Afonso Dias");
	    System.out.println("53709 - David Henriques");
	    System.out.println("53336 - Pedro Ferreira");
	    System.out.println("53297 - Rafael Viana");
	    System.out.println("53340 - Sérgio Correia");
	    System.out.println("\n=======================================================\n");
	}
    public static void menu() {
        System.out.println("\n=======================================================");
        System.out.println("        SISTEMA DE COMUNICAÇÃO DE OCORRÊNCIAS NA UPT");
        System.out.println("=======================================================");
        System.out.println("1 - Criar Utilizador");
        System.out.println("2 - Mostrar Utilizadores");
        System.out.println("3 - Criar Ocorrência");
        System.out.println("4 - Consultar Ocorrências");
        System.out.println("5 - Atualizar Estado da Ocorrência");
        System.out.println("6 - Remover Utilizador");
        System.out.println("0 - Sair");
        System.out.println("==================================================");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Teste sistemaVisual = new Teste();
        sistemaVisual.mostrarSistema();
        Scanner sc = new Scanner(System.in);
        GereUtilizadores sistema = new GereUtilizadores();
        Utilizador utilizadorAtual = null;
        int opcao;
        do {
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {

                case 1:
                    System.out.println("\n========== CRIAR UTILIZADOR ==========");
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    System.out.print("Tipo de Utilizador ( Aluno | Docente | Administrador | Funcionário ): ");
                    String tipo = sc.nextLine();
                    utilizadorAtual = new Utilizador(
                            id,
                            nome,
                            email,
                            password,
                            tipo
                    );
                    sistema.criarUtilizador(utilizadorAtual);
                    break;

                case 2:
                    System.out.println("\n========== UTILIZADORES ==========");
                    sistema.mostrarUtilizadores();
                    break;

                case 3:
                    if (utilizadorAtual == null) {
                        System.out.println("\nCrie primeiro um utilizador!");
                        break;
                    }
                    System.out.println("\n===== UTILIZADORES =====");
                    for (int i = 0; i < sistema.getUtilizadores().size(); i++) {
                        System.out.println((i + 1) + " - " +sistema.getUtilizadores().get(i).getNome());
                    }
                    System.out.print("Escolha o utilizador: ");
                    int utilizadorEscolha = sc.nextInt();
                    sc.nextLine();
                    utilizadorAtual =sistema.getUtilizadores().get(utilizadorEscolha - 1);
                    System.out.println("\n========== CRIAR OCORRÊNCIA ==========");
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.println("\nBLOCOS:");
                    System.out.println("1 - Bloco Principal");
                    System.out.println("2 - Bloco São Tomé");
                    System.out.print("Escolha o bloco: ");
                    int blocoEscolha = sc.nextInt();
                    sc.nextLine();
                    String bloco = "Bloco " + blocoEscolha;
                    int maxPisos;
                    if(blocoEscolha == 1) {
                    	bloco = "Bloco Principal";
                        maxPisos = 6;
                    } else {
                    	bloco = "Bloco São Tomé";
                        maxPisos = 2;
                    }
                    System.out.println("\nPISOS:");
                    for(int i = 1; i <= maxPisos; i++) {
                        System.out.println(i + " - Piso " + i);
                    }
                    System.out.print("Escolha o piso: ");
                    int pisoEscolha = sc.nextInt();
                    sc.nextLine();
                    String piso = "Piso " + pisoEscolha;
                    int localEscolha;
                    String local = "";
                    if(blocoEscolha == 1) {
                        if(pisoEscolha <= 3) {
                            System.out.println("1 - Sala");
                            System.out.println("2 - Estacionamento");
                            System.out.println("3 - Espaço Comum");
                        } else {
                            System.out.println("1 - Sala");
                            System.out.println("2 - Espaço Comum");
                        }
                        System.out.print("Escolha: ");
                        localEscolha = sc.nextInt();
                        sc.nextLine();
                        if(localEscolha == 1) {
                            System.out.print("Número da sala (1-21): ");
                            int numeroSala = sc.nextInt();
                            sc.nextLine();
                            local = "Sala " + pisoEscolha + numeroSala;
                        }
                        else if(localEscolha == 2 && pisoEscolha <= 3) {
                            local = "Estacionamento";
                        }
                        else {
                            if(pisoEscolha == 1) {
                                System.out.println("1 - Biblioteca");
                                System.out.println("2 - Secretaria");
                                System.out.println("3 - Papelaria");
                                System.out.println("4 - Corredor");
                                System.out.println("5 - Espelho de Água");
                                System.out.print("Escolha: ");
                                int espaco = sc.nextInt();
                                sc.nextLine();
                                switch(espaco) {
                                    case 1: local = "Biblioteca"; break;
                                    case 2: local = "Secretaria"; break;
                                    case 3: local = "Papelaria"; break;
                                    case 4: local = "Corredor"; break;
                                    case 5: local = "Espelho de Água"; break;
                                }
                            } else if(pisoEscolha == 2) {
                                System.out.println("1 - Bar");
                                System.out.println("2 - Esplanada");
                                System.out.println("3 - Corredor");                                 
                                System.out.print("Escolha: ");
                                int espaco = sc.nextInt();
                                sc.nextLine();
                                if(espaco == 1) {
                                    local = "Bar";
                                } else if( espaco == 2){
                                    local = "Esplanada";
                                } else {
                                	local = "Corredor";
                                }
                            } else {
                                local = "Corredor";
                            }
                        }
                    } else {//bloco são tomé
                        if(pisoEscolha == 1) {
                            System.out.println("1 - Estacionamento");
                            System.out.println("2 - Espaço Comum");
                            System.out.print("Escolha: ");
                            localEscolha = sc.nextInt();
                            sc.nextLine();
                            if(localEscolha == 1) {
                                local = "Estacionamento";
                            }
                            else {
                                System.out.println("1 - Cantina");
                                System.out.println("2 - Sala de Estudo");
                                System.out.println("3 - Corredor");
                                System.out.print("Escolha: ");
                                int espaco = sc.nextInt();
                                sc.nextLine();
                                switch(espaco) {
                                    case 1: local = "Cantina"; break;
                                    case 2: local = "Sala de Estudo"; break;
                                    case 3: local = "Corredor"; break;
                                }
                            }
                        } else {
                            System.out.println("1 - Sala");
                            System.out.println("2 - Espaço Comum");
                            System.out.print("Escolha: ");
                            localEscolha = sc.nextInt();
                            sc.nextLine();
                            if(localEscolha == 1) {
                                System.out.print("Número da sala (750-755): ");
                                int numeroSala = sc.nextInt();
                                sc.nextLine();
                                if(numeroSala >= 750 && numeroSala <= 755) {
                                    local = "Sala " + numeroSala;
                                } else {
                                    System.out.println("Sala inválida!");
                                    local = "Sala Desconhecida";
                                }
                            } else {
                                local = "Corredor";
                            }
                        }
                    }
                    System.out.println("\nPrioridade:");
                    System.out.println("1 - Alta");
                    System.out.println("2 - Media");
                    System.out.println("3 - Baixa");
                    System.out.print("Escolha: ");
                    int prioridadeOpcao = sc.nextInt();
                    sc.nextLine();
                    Prioridade prioridade;
                    switch (prioridadeOpcao) {
                        case 1:
                            prioridade = Prioridade.Alta;
                            break;
                        case 2:
                            prioridade = Prioridade.Média;
                            break;
                        default:
                            prioridade = Prioridade.Baixa;
                    }
                    utilizadorAtual.criarOcorrencia(
                            titulo,
                            descricao,
                            prioridade,
                            bloco,
                            piso,
                            local
                    );
                    break;

                case 4:
                	if (sistema.getUtilizadores().isEmpty()) {
                        System.out.println("\nNenhum utilizador foi criado.");
                        break;
                    }
                    System.out.println("\n========== OCORRÊNCIAS ==========");
                    for (Utilizador u : sistema.getUtilizadores()) {
                        System.out.println("\nUtilizador: " + u.getNome());
                        if (u.getOcorrencias().isEmpty()) {
                            System.out.println("Sem ocorrências.");
                        } else {
                            u.consultarOcorrencia();
                        }
                    }
                    break;

                case 5:
                    if (sistema.getUtilizadores().isEmpty()) {
                        System.out.println("\nNão existem utilizadores.");
                        break;
                    }
                    System.out.println("\n===== UTILIZADORES =====");
                    for (int i = 0; i < sistema.getUtilizadores().size(); i++) {
                        System.out.println(
                            (i + 1) + " - " +
                            sistema.getUtilizadores().get(i).getNome()
                        );
                    }
                    System.out.print("Escolha o utilizador: ");
                    int userEscolha = sc.nextInt();
                    sc.nextLine();
                    utilizadorAtual =sistema.getUtilizadores().get(userEscolha - 1);
                    if (utilizadorAtual.getOcorrencias().isEmpty()) {
                        System.out.println("\nEsse utilizador não tem ocorrências.");
                        break;
                    }
                    System.out.println("\n===== OCORRÊNCIAS =====");
                    for (int i = 0; i < utilizadorAtual.getOcorrencias().size(); i++) {
                        System.out.println(
                            (i + 1) + " - " +
                            utilizadorAtual.getOcorrencias().get(i).getTitulo()
                        );
                    }
                    System.out.print("\nEscolha a ocorrência: ");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    Ocorrencia ocorrencia =utilizadorAtual.getOcorrencias().get(escolha - 1);
                    System.out.println("\n1 - Por Resolver");
                    System.out.println("2 - Em Progresso");
                    System.out.println("3 - Concluída");
                    System.out.print("Novo estado: ");
                    int estado = sc.nextInt();
                    sc.nextLine();
                    EstadoOcorrencia novoEstado;
                    if (estado == 1) {
                        novoEstado = new EstadoOcorrencia(
                            "EST-01",
                            "Por Resolver",
                            "Ocorrência Por Resolver",
                            LocalDate.now()
                        );
                    } else if (estado == 2) {
                        novoEstado = new EstadoOcorrencia(
                            "EST-02",
                            "Em Progresso",
                            "Ocorrência em progresso",
                            LocalDate.now()
                        );
                    } else {
                        novoEstado = new EstadoOcorrencia(
                            "EST-03",
                            "Concluída",
                            "Ocorrência concluída",
                            LocalDate.now()
                        );
                    }
                    sistema.atualizarEstadoOcorrencia(ocorrencia,novoEstado);
                    break;

                case 6:
                    if (sistema.getUtilizadores().isEmpty()) {
                        System.out.println("\nNão existem utilizadores.");
                        break;
                    }
                    System.out.println("\n===== UTILIZADORES =====");
                    for (int i = 0; i < sistema.getUtilizadores().size(); i++) {
                        System.out.println(
                            (i + 1) + " - " +
                            sistema.getUtilizadores().get(i).getNome()
                        );
                    }
                    System.out.print("Escolha o utilizador a remover: ");
                    int removerEscolha = sc.nextInt();
                    sc.nextLine();
                    Utilizador utilizadorRemover =sistema.getUtilizadores().get(removerEscolha - 1);
                    sistema.removerUtilizador(utilizadorRemover.getId());
                    System.out.println("\nUtilizador removido com sucesso!");
                    break;

                case 0:
                    System.out.println("\nSistema encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);
        sc.close();
    }
}