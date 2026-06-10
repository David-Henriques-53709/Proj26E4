package PROJ26E4;
import java.time.LocalDate;
import java.util.ArrayList;
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
	public static void menuLogin() {
        System.out.println("\n=======================================================");
        System.out.println("        SISTEMA DE COMUNICAÇÃO DE OCORRÊNCIAS NA UPT");
        System.out.println("=======================================================");
        System.out.println("1 - Criar Utilizador");
        System.out.println("2 - Login");
        System.out.println("0 - Sair");
        System.out.println("=======================================================");
        System.out.print("Escolha uma opção: ");
    }
    public static void menuAdmin() {
        System.out.println("\n=======================================================");
        System.out.println("                  MENU ADMINISTRADOR");
        System.out.println("=======================================================");
        System.out.println("1 - Mostrar Utilizadores");
        System.out.println("2 - Consultar Ocorrências");
        System.out.println("3 - Atribuir Ocorrência a Técnico");
        System.out.println("4 - Adicionar Comentário");
        System.out.println("5 - Criar Relatório de Ocorrências");
        System.out.println("6 - Remover Utilizador");
        System.out.println("7 - Adicionar Local Novo");
        System.out.println("8 - Adicionar Bloco Novo");
        System.out.println("9 - Desbloquear Conta");
        System.out.println("10 - Logout");
        System.out.println("0 - Sair");
        System.out.println("=======================================================");
        System.out.print("Escolha uma opção: ");
    }
    public static void menuUtilizador() {
        System.out.println("\n=======================================================");
        System.out.println("                  MENU UTILIZADOR");
        System.out.println("=======================================================");
        System.out.println("1 - Criar Ocorrência");
        System.out.println("2 - Consultar Ocorrências");
        System.out.println("3 - Cancelar Ocorrência");
        System.out.println("4 - Avaliar Resolução da Ocorrência");
        System.out.println("8 - Logout");
        System.out.println("0 - Sair");
        System.out.println("=======================================================");
        System.out.print("Escolha uma opção: ");
    }
    public static void menuTecnico() {
    	System.out.println("\n=======================================================");
        System.out.println("                    MENU TÉCNICO");
        System.out.println("=======================================================");
        System.out.println("1 - Ver As Minhas Ocorrências");
        System.out.println("2 - Atualizar Estado de Ocorrência");
        System.out.println("3 - Adicionar Comentário");
        System.out.println("8 - Logout");
        System.out.println("0 - Sair");
        System.out.println("=======================================================");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void main(String[] args) {
        Teste sistemaVisual = new Teste();
        sistemaVisual.mostrarSistema();
        Scanner sc = new Scanner(System.in);
        GereUtilizadores sistema = new GereUtilizadores();
        Utilizador utilizadorAtual = null;
        Mapa mapa = new Mapa();
        int opcao;
        do {
            if (utilizadorAtual == null) {
                menuLogin();
            } else if (utilizadorAtual.isAdministrador()) {
                menuAdmin();
            } else if (utilizadorAtual.isTecnico()) {
            	menuTecnico();
            } else {
                menuUtilizador();
            }
            opcao = sc.nextInt();
            sc.nextLine();
            if (utilizadorAtual == null) {
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
                        Utilizador novo = new Utilizador(id, nome, email, password);
                        if (novo.isTecnico()) {
                        	System.out.println("\n===== ESPECIALIDADE DO TÉCNICO =====");
                        	System.out.println("1 - Informática     → Informática e Equipamentos");
                        	System.out.println("2 - Manutenção      → Manutenção Geral");
                        	System.out.println("3 - Eletricidade    → Elétrica");
                        	System.out.println("4 - Climatização    → Climatização e Ventilação");
                        	System.out.println("5 - Limpeza         → Limpeza");
                        	System.out.println("6 - Segurança       → Segurança");
                        	System.out.println("7 - Marketing       → Marketing");
                        	System.out.println("=====================================");
                        	System.out.print("Escolha a especialidade: ");
                            int espOpcao = sc.nextInt();
                            sc.nextLine();
                            switch (espOpcao) {
                                case 1: novo.setEspecialidade("Informática"); break;
                                case 2: novo.setEspecialidade("Manutenção"); break;
                                case 3: novo.setEspecialidade("Eletricidade"); break;
                                case 4: novo.setEspecialidade("Climatização"); break;
                                case 5: novo.setEspecialidade("Limpeza"); break;
                                case 6: novo.setEspecialidade("Segurança"); break;
                                default: novo.setEspecialidade("Marketing");
                            }
                        }
                        sistema.criarUtilizador(novo);
                        break;
                    
                    case 2:
                        System.out.print("Email: ");
                        String mail = sc.nextLine();
                        System.out.print("Password: ");
                        String pass = sc.nextLine();
                        utilizadorAtual = sistema.login(mail, pass);
                        if (utilizadorAtual != null) {
                            System.out.println("Login efetuado com sucesso!");
                            System.out.println("Tipo: " + utilizadorAtual.getTipoUtilizador());
                        }
                        break;
                    
                    case 0:
                        System.out.println("\nSistema encerrado.");
                        break;
                    
                    default:
                        System.out.println("\nOpção inválida!");
                }
            } else if (utilizadorAtual.isAdministrador()) {
                switch (opcao) {
                    
                	case 1:
                        System.out.println("\n========== UTILIZADORES ==========");
                        sistema.mostrarUtilizadores();
                        break; 
                    
                    case 2:
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
                    
                    case 3:
                        if (sistema.getTecnicos().isEmpty()) {
                            System.out.println("\nNão existem técnicos no sistema.");
                            break;
                        }
                        if (sistema.getUtilizadores().isEmpty()) {
                            System.out.println("\nNão existem utilizadores.");
                            break;
                        }
                        System.out.println("\n===== UTILIZADORES COM OCORRÊNCIAS =====");
                        boolean algumComOcorrencia = false;
                        ArrayList<Utilizador> utilizadoresComOcorrencias = new ArrayList<>();
                        for (Utilizador u : sistema.getUtilizadores()) {
                            if (!u.getOcorrencias().isEmpty()) {
                                utilizadoresComOcorrencias.add(u);
                                algumComOcorrencia = true;
                            }
                        }
                        if (!algumComOcorrencia) {
                            System.out.println("\nNenhum utilizador tem ocorrências.");
                            break;
                        }
                        for (int i = 0; i < utilizadoresComOcorrencias.size(); i++) {
                            System.out.println((i + 1) + " - " + utilizadoresComOcorrencias.get(i).getNome());
                        }
                        System.out.print("Escolha o utilizador: ");
                        int userAtribuir = sc.nextInt();
                        sc.nextLine();
                        Utilizador uAtribuir = utilizadoresComOcorrencias.get(userAtribuir - 1);
                        if (uAtribuir.getOcorrencias().isEmpty()) {
                            System.out.println("\nEsse utilizador não tem ocorrências.");
                            break;
                        }
                        System.out.println("\n===== OCORRÊNCIAS =====");
                        for (int i = 0; i < uAtribuir.getOcorrencias().size(); i++) {
                            System.out.println((i + 1) + " - " + uAtribuir.getOcorrencias().get(i).getTitulo()
                                + " [" + uAtribuir.getOcorrencias().get(i).getTecnicoAtribuido() + "]");
                        }
                        System.out.print("Escolha a ocorrência: ");
                        int ocorrenciaAtribuir = sc.nextInt();
                        sc.nextLine();
                        Ocorrencia ocorrenciaParaAtribuir = uAtribuir.getOcorrencias().get(ocorrenciaAtribuir - 1);
                        Categoria catOcorrencia = ocorrenciaParaAtribuir.getCategoria();
                        ArrayList<Utilizador> tecnicosCompativeis = sistema.getTecnicosCompativeis(catOcorrencia);
                        if (tecnicosCompativeis.isEmpty()) {
                            System.out.println("\nNão existem técnicos compatíveis com esta categoria!");
                            break;
                        }
                        System.out.println("\n===== TÉCNICOS COMPATÍVEIS =====");
                        for (int i = 0; i < tecnicosCompativeis.size(); i++) {
                            System.out.println((i + 1) + " - " + tecnicosCompativeis.get(i).getNome()
                                + " (" + tecnicosCompativeis.get(i).getEspecialidade() + ")");
                        }
                        System.out.print("Escolha o técnico: ");
                        int tecnicoEscolha = sc.nextInt();
                        sc.nextLine();
                        String nomeTecnico = tecnicosCompativeis.get(tecnicoEscolha - 1).getNome();
                        ocorrenciaParaAtribuir.atribuirTecnico(nomeTecnico);
                        System.out.println("Ocorrência atribuída a " + nomeTecnico + " com sucesso!");
                        break;
 
                    case 4:
                        if (sistema.getUtilizadores().isEmpty()) {
                            System.out.println("\nNão existem utilizadores.");
                            break;
                        }
                        System.out.println("\n===== UTILIZADORES =====");
                        for (int i = 0; i < sistema.getUtilizadores().size(); i++) {
                            System.out.println((i + 1) + " - " + sistema.getUtilizadores().get(i).getNome());
                        }
                        System.out.print("Escolha o utilizador: ");
                        int userComentario = sc.nextInt();
                        sc.nextLine();
                        Utilizador uComentario = sistema.getUtilizadores().get(userComentario - 1);
                        if (uComentario.getOcorrencias().isEmpty()) {
                            System.out.println("\nO utilizador não tem ocorrências.");
                            break;
                        }
                        System.out.println("\n===== OCORRÊNCIAS =====");
                        for (int i = 0; i < uComentario.getOcorrencias().size(); i++) {
                            System.out.println((i + 1) + " - " + uComentario.getOcorrencias().get(i).getTitulo());
                        }
                        System.out.print("Escolha a ocorrência: ");
                        int ocorrenciaComentario = sc.nextInt();
                        sc.nextLine();
                        Ocorrencia ocorrenciaComentada = uComentario.getOcorrencias().get(ocorrenciaComentario - 1);
                        System.out.print("Comentário: ");
                        String comentario = sc.nextLine();
                        ocorrenciaComentada.adicionarComentario(comentario, utilizadorAtual.getNome());
                        break;
 
                    case 5:
                        sistema.criarRelatorioOcorrencias();
                        break;
 
                    case 6:
                        if (sistema.getUtilizadores().isEmpty()) {
                            System.out.println("\nNão existem utilizadores.");
                            break;
                        }
                        System.out.println("\n===== UTILIZADORES =====");
                        for (int i = 0; i < sistema.getUtilizadores().size(); i++) {
                            System.out.println((i + 1) + " - " + sistema.getUtilizadores().get(i).getNome());
                        }
                        System.out.print("Escolha o utilizador a remover: ");
                        int removerEscolha = sc.nextInt();
                        sc.nextLine();
                        Utilizador utilizadorRemover = sistema.getUtilizadores().get(removerEscolha - 1);
                        sistema.removerUtilizador(utilizadorRemover.getId());
                        System.out.println("\nUtilizador removido com sucesso!");
                        break;
 
                    case 7:
                        mapa.adicionarLocal(sc);
                        break;
                        
                    case 8:
                        mapa.adicionarBloco(sc);
                        break;
                        
                    case 9:
                        sistema.desbloquearUtilizador(sc, sistema.getUtilizadores());
                        break; 
                        
                    case 10:
                        utilizadorAtual = null;
                        System.out.println("Logout efetuado com sucesso!");
                        break;
 
                    case 0:
                        System.out.println("\nSistema encerrado.");
                        break;
 
                    default:
                        System.out.println("\nOpção inválida!");
                }
            } else if (utilizadorAtual.isTecnico()) {
                switch (opcao) {
                
                case 1:
                    System.out.println("\n========== AS MINHAS OCORRÊNCIAS ==========");
                    boolean temAtribuidas = false;
                    for (Utilizador u : sistema.getUtilizadores()) {
                        for (Ocorrencia o : u.getOcorrencias()) {
                            if (o.getTecnicoAtribuido().equals(utilizadorAtual.getNome())) {
                                temAtribuidas = true;
                                System.out.println(o);
                            }
                        }
                    }
                    if (!temAtribuidas) {
                        System.out.println("Não tens ocorrências atribuídas.");
                    }
                    break;

                case 2:
                    boolean existeAtribuidaTecnico = false;
                    for (Utilizador u : sistema.getUtilizadores()) {
                        for (Ocorrencia o : u.getOcorrencias()) {
                            if (o.getTecnicoAtribuido().equals(utilizadorAtual.getNome())) {
                                existeAtribuidaTecnico = true;
                                break;
                            }
                        }
                    }
                    if (!existeAtribuidaTecnico) {
                        System.out.println("\nNão tens ocorrências atribuídas.");
                        break;
                    }
                    System.out.println("\n===== AS MINHAS OCORRÊNCIAS =====");
                    ArrayList<Ocorrencia> listaParaEstado = new ArrayList<>();
                    for (Utilizador u : sistema.getUtilizadores()) {
                        for (Ocorrencia o : u.getOcorrencias()) {
                            if (o.getTecnicoAtribuido().equals(utilizadorAtual.getNome())) {
                                listaParaEstado.add(o);
                                System.out.println(listaParaEstado.size() + " - " + o.getTitulo());
                            }
                        }
                    }
                    System.out.print("Escolha a ocorrência: ");
                    int escolhaEstadoTec = sc.nextInt();
                    sc.nextLine();
                    Ocorrencia ocEstado = listaParaEstado.get(escolhaEstadoTec - 1);
                    System.out.println("\n1 - Por Resolver");
                    System.out.println("2 - Em Progresso");
                    System.out.println("3 - Concluída");
                    System.out.print("Novo estado: ");
                    int estadoTecnico = sc.nextInt();
                    sc.nextLine();
                    EstadoOcorrencia novoEstadoTecnico;
                    if (estadoTecnico == 1) {
                        novoEstadoTecnico = new EstadoOcorrencia("EST-01", "Por Resolver", "Ocorrência Por Resolver", LocalDate.now());
                    } else if (estadoTecnico == 2) {
                        novoEstadoTecnico = new EstadoOcorrencia("EST-02", "Em Progresso", "Ocorrência em progresso", LocalDate.now());
                    } else {
                        novoEstadoTecnico = new EstadoOcorrencia("EST-03", "Concluída", "Ocorrência concluída", LocalDate.now());
                    }
                    sistema.atualizarEstadoOcorrencia(ocEstado, novoEstadoTecnico);
                    break;

                case 3:
                    boolean existeParacomentarTec = false;
                    for (Utilizador u : sistema.getUtilizadores()) {
                        for (Ocorrencia o : u.getOcorrencias()) {
                            if (o.getTecnicoAtribuido().equals(utilizadorAtual.getNome())) {
                                existeParacomentarTec = true;
                                break;
                            }
                        }
                    }
                    if (!existeParacomentarTec) {
                        System.out.println("\nNão tens ocorrências atribuídas.");
                        break;
                    }
                    System.out.println("\n===== AS MINHAS OCORRÊNCIAS =====");
                    ArrayList<Ocorrencia> listaParaComentario = new ArrayList<>();
                    for (Utilizador u : sistema.getUtilizadores()) {
                        for (Ocorrencia o : u.getOcorrencias()) {
                            if (o.getTecnicoAtribuido().equals(utilizadorAtual.getNome())) {
                                listaParaComentario.add(o);
                                System.out.println(listaParaComentario.size() + " - " + o.getTitulo());
                            }
                        }
                    }
                    System.out.print("Escolha a ocorrência: ");
                    int escolhaComentarioTec = sc.nextInt();
                    sc.nextLine();
                    Ocorrencia ocComentario = listaParaComentario.get(escolhaComentarioTec - 1);
                    System.out.print("Comentário: ");
                    String comentarioTecnico = sc.nextLine();
                    ocComentario.adicionarComentario(comentarioTecnico, utilizadorAtual.getNome());
                    break;
                    
                case 8:
                    utilizadorAtual = null;
                    System.out.println("Logout efetuado com sucesso!");
                    break;

                case 0:
                    System.out.println("\nSistema encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
                
            } else {
                switch (opcao) {
                    case 1:
                        System.out.println("\n========== CRIAR OCORRÊNCIA ==========");
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Descrição: ");
                        String descricao = sc.nextLine();
                        System.out.println("\nCategorias:");
                        System.out.println("1 - Informática");
                        System.out.println("2 - Manutenção Geral");
                        System.out.println("3 - Elétrica");
                        System.out.println("4 - Climatização e Ventilação");
                        System.out.println("5 - Segurança");
                        System.out.println("6 - Limpeza");
                        System.out.println("7 - Marketing");
                        System.out.println("8 - Equipamentos");
                        System.out.print("Escolha: ");
                        int categoriaOpcao = sc.nextInt();
                        sc.nextLine();
                        Categoria categoria;
                        switch (categoriaOpcao) {
                            case 1: categoria = Categoria.Informatica; break;
                            case 2: categoria = Categoria.Manutencao_Geral; break;
                            case 3: categoria = Categoria.Eletricidade; break;
                            case 4: categoria = Categoria.Climatizacao_Ventilacao; break;
                            case 5: categoria = Categoria.Seguranca; break;
                            case 6: categoria = Categoria.Limpeza; break;
                            case 7: categoria = Categoria.Marketing; break;
                            default: categoria = Categoria.Equipamentos;
                        }
                        String localizacao = mapa.escolherLocal(sc);
                        String[] partes = localizacao.split(" - ");
                        String bloco = partes[0];
                        String piso = partes[1];
                        String local = partes[2];
                        System.out.println("\nPrioridade:");
                        System.out.println("1 - Alta");
                        System.out.println("2 - Media");
                        System.out.println("3 - Baixa");
                        System.out.print("Escolha: ");
                        int prioridadeOpcao = sc.nextInt();
                        sc.nextLine();
                        Prioridade prioridade;
                        switch (prioridadeOpcao) {
                            case 1: prioridade = Prioridade.Alta; break;
                            case 2: prioridade = Prioridade.Média; break;
                            default: prioridade = Prioridade.Baixa;
                        }
                        utilizadorAtual.criarOcorrencia(titulo, descricao, prioridade, categoria, bloco, piso, local);
                        break;
 
                    case 2:
                        utilizadorAtual.consultarOcorrencia();
                        break;
 
                    case 3:
                        if (utilizadorAtual.getOcorrencias().isEmpty()) {
                            System.out.println("\nNão tens ocorrências.");
                            break;
                        }
                        System.out.println("\n===== OCORRÊNCIAS =====");
                        for (int i = 0; i < utilizadorAtual.getOcorrencias().size(); i++) {
                            System.out.println((i + 1) + " - " + utilizadorAtual.getOcorrencias().get(i).getTitulo());
                        }
                        System.out.print("\nEscolha a ocorrência a cancelar: ");
                        int cancelar = sc.nextInt();
                        sc.nextLine();
                        Ocorrencia ocorrenciaCancelar = utilizadorAtual.getOcorrencias().get(cancelar - 1);
                        if (!ocorrenciaCancelar.getEstadoAtual().getNomeEstado().equals("Por Resolver")) {
                            System.out.println("Só pode cancelar ocorrências Por Resolver!");
                            break;
                        }
                        System.out.print("Tem a certeza? (sim | não): ");
                        String confirmacao = sc.nextLine();
                        if (confirmacao.equalsIgnoreCase("sim")) {
                            utilizadorAtual.cancelarOcorrencia(cancelar - 1);
                        } else {
                            System.out.println("Cancelamento cancelado.");
                        }
                        break;
 
                    case 4:
                        if (utilizadorAtual.getOcorrencias().isEmpty()) {
                            System.out.println("\nNão tens ocorrências.");
                            break;
                        }
                        System.out.println("\n===== OCORRÊNCIAS =====");
                        for (int i = 0; i < utilizadorAtual.getOcorrencias().size(); i++) {
                            System.out.println((i + 1) + " - " + utilizadorAtual.getOcorrencias().get(i).getTitulo());
                        }
                        System.out.print("\nEscolha a ocorrência: ");
                        int ocorrenciaAvaliacao = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Classificação (1 a 5): ");
                        int classificacao = sc.nextInt();
                        sc.nextLine();
                        utilizadorAtual.avaliarOcorrencia(ocorrenciaAvaliacao - 1, classificacao);
                        break;
 
                    case 8:
                        utilizadorAtual = null;
                        System.out.println("Logout efetuado com sucesso!");
                        break;
 
                    case 0:
                        System.out.println("\nSistema encerrado.");
                        break;
 
                    default:
                        System.out.println("\nOpção inválida!");
                }
            }
 
        } while (opcao != 0);
        sc.close();
    }
}