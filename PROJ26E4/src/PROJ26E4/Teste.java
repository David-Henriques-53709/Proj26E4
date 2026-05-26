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
        System.out.println("\n==================================================");
        System.out.println("        SISTEMA DE GESTÃO DE OCORRÊNCIAS");
        System.out.println("==================================================");
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
                    System.out.print("Tipo de Utilizador (Aluno | Docente | Administrador | Funcionário): ");
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
                    System.out.println("\n========== CRIAR OCORRÊNCIA ==========");
                    System.out.print("ID da Ocorrência: ");
                    String idOc = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.println("\nBLOCOS:");
                    System.out.println("1 - Bloco 1");
                    System.out.println("2 - Bloco 2");
                    System.out.print("Escolha o bloco: ");
                    int blocoEscolha = sc.nextInt();
                    sc.nextLine();
                    String bloco = "Bloco " + blocoEscolha;
                    int maxPisos;
                    if(blocoEscolha == 1) {
                        maxPisos = 6;
                    } else {
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
                    System.out.println("\nLOCAL:");
                    if(blocoEscolha == 1) {
                        if(pisoEscolha <= 3) {
                            System.out.println("1 - Sala");
                            System.out.println("2 - Estacionamento");
                            System.out.println("3 - Espaço Comum");
                        } else {
                            System.out.println("1 - Sala");
                            System.out.println("2 - Espaço Comum");
                        }
                    } else {
                        if(pisoEscolha == 1) {
                            System.out.println("1 - Estacionamento");
                            System.out.println("2 - Espaço Comum");
                        } else {
                            System.out.println("1 - Sala");
                        }
                    }
                    System.out.print("Escolha: ");
                    int localEscolha = sc.nextInt();
                    sc.nextLine();
                    String local = "";
                    if(localEscolha == 1) {
                        System.out.print("Número da sala (1-21): ");
                        int numeroSala = sc.nextInt();
                        sc.nextLine();
                        local = "Sala " + pisoEscolha + numeroSala;
                    } else if(localEscolha == 2) {
                        local = "Estacionamento";
                    } else {
                        local = "Espaço Comum";
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
                            idOc,
                            titulo,
                            descricao,
                            prioridade,
                            bloco,
                            piso,
                            local
                    );
                    break;

                case 4:
                    if (utilizadorAtual == null) {
                        System.out.println("\nNenhum utilizador criado.");
                        break;
                    }
                    System.out.println("\n========== OCORRÊNCIAS ==========");
                    utilizadorAtual.consultarOcorrencia();
                    break;

                case 5:
                    if (utilizadorAtual == null ||
                        utilizadorAtual.getOcorrencias().isEmpty()) {
                        System.out.println("\nNão existem ocorrências.");
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
                    sistema.atualizarEstadoOcorrencia(
                            ocorrencia,
                            novoEstado
                    );
                    break;

                case 6:
                    System.out.print("\nID do utilizador a remover: ");
                    String idRemover = sc.nextLine();
                    sistema.removerUtilizador(idRemover);
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