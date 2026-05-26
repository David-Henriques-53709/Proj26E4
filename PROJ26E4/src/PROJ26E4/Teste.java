package PROJ26E4;

import java.time.LocalDate;
import PROJ26E4.*; // Garante que importa as tuas classes se estiverem num pacote diferente

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
        System.out.println("\n53841 - Afonso Dias");
        System.out.println("\n53709 - David Henriques");
        System.out.println("\n53336 - Pedro Ferreira");
        System.out.println("\n53297 - Rafael Viana");
        System.out.println("\n53340 - Sérgio Correia");
        System.out.println("\n=======================================================\n");
    }

    public static void main(String[] args) {
        // Inicializa a classe de teste e mostra o cabeçalho ASCII
        Teste sistema = new Teste();
        sistema.mostrarSistema();

        // -----------------------------------------------------------------
        // 1. TESTE DA INFRAESTRUTURA (Mapa, Bloco, Piso, Sala, EspacoComum, Estacionamento)
        // -----------------------------------------------------------------
        System.out.println(">>> 1. Criação da Infraestrutura Física...");
        Mapa mapaUPT = new Mapa("MAP-01", "Bloco A", "Planta digitalizada de todo o recinto");
        Bloco blocoA = new Bloco("BLC-A", "Bloco de Aulas", "Edifício principal");
     
        // Criando uma Sala (Herda de Piso)
        Sala pratica = new Sala(
            "PIS-02", 2, "Segundo andar do Bloco A", "BLC-A", 
            "S-204", "Laboratório de Redes", 32, "Informática"
        );
        
        // Criando um Espaço Comum (Herda de Piso)
        EspacoComum auditorio = new EspacoComum(
            "PIS-01", 1, "Primeiro andar do Bloco A", "BLC-A", 
            "EC-01", "Aula Magna", "Anfiteatro para palestras", 120
        );
        
        // Criando um Estacionamento (Herda de Piso)
        Estacionamento parqueSubterraneo = new Estacionamento(
            "PIS-01", 1, "Estacionamento do Bloco A", "BLC-A", 
            "EST-A", 45, "Coberto - Exclusivo Clientes da UPT"
        );

        System.out.println(mapaUPT);
        System.out.println(blocoA);
        System.out.println(pratica);
        System.out.println(auditorio);
        System.out.println(parqueSubterraneo);
        System.out.println("\n-------------------------------------------------------\n");

        // -----------------------------------------------------------------
        // 2. TESTE DE CATEGORIAS DE OCORRÊNCIA
        // -----------------------------------------------------------------
        System.out.println(">>> 2. Configuração Categorias do Sistema...");
        
        CategoriaOcorrencia catHardware = new CategoriaOcorrencia("CAT-01", "Hardware/TI", "Problemas com computadores e redes");
        CategoriaOcorrencia catInfra = new CategoriaOcorrencia("CAT-02", "Infraestrutura", "Problemas de AC");
        
        System.out.println(catHardware);
        System.out.println(catInfra);
        System.out.println("\n-------------------------------------------------------\n");

        // -----------------------------------------------------------------
        // 3. TESTE DO GESTOR DE UTILIZADORES
        // -----------------------------------------------------------------
        System.out.println(">>> 3. Inicialização Administrador e Registar Utilizadores...");
        
        GereUtilizadores sistemaAdministracao = new GereUtilizadores();
        
        Utilizador Afonso = new Utilizador("U-100", "Afonso Dias", "53841@alunos.upt.pt", "pass123", "Docente");
        Utilizador Rafa = new Utilizador("U-200", "Rafael Viana", "53297@alunos.upt.pt", "admin456", "Aluno");
        
        // Adicionar ao controlador
        sistemaAdministracao.criarUtilizador(Afonso);
        sistemaAdministracao.criarUtilizador(Rafa);
        System.out.println();
        
        // Mostrar lista atual
        sistemaAdministracao.mostrarUtilizadores();
        System.out.println("\n-------------------------------------------------------\n");

        // -----------------------------------------------------------------
        // 4. TESTE DO FLUXO DE CRIAÇÃO E CONSULTA DE OCORRÊNCIAS
        // -----------------------------------------------------------------
        System.out.println(">>> 4. Simulação de Reporte de Ocorrências...");
        
        System.out.println("[Ação] Utilizador '" + Afonso.getNome() + "' vai registar uma avaria:");
        Afonso.criarOcorrencia(
            "OCO-5001", 
            "Projetor sem imagem", 
            "O projetor central liga mas a lâmpada vermelha de erro está intermitente.", 
            Prioridade.Alta
        );
        System.out.println();
        
        // Validar se a ocorrência foi guardada dentro do utilizador
        Afonso.consultarOcorrencia();
        System.out.println("\n-------------------------------------------------------\n");

        // -----------------------------------------------------------------
        // 5. TESTE DE ATUALIZAÇÃO DO ESTADO DA OCORRÊNCIA
        // -----------------------------------------------------------------
        System.out.println(">>> 5. Fluxo de Resolução (Alteração de Estados)...");
        
        // Capturamos a ocorrência criada pelo Afonso para podermos mudá-la
        Ocorrencia avariaProjetor = Afonso.getOcorrencias().get(0);
        
        // Criar o novo estado
        EstadoOcorrencia estadoEmProgresso = new EstadoOcorrencia(
            "EST-02", 
            "Em Resolução", 
            "Equipa de IT alertada. Lâmpada de substituição requisitada ao armazém.", 
            LocalDate.now()
        );
        
        System.out.println("[Ação] Atualizando estado da ocorrência via Administrador:");
        // CORREÇÃO: Mudado de sistemaGestao para sistemaAdministracao
        sistemaAdministracao.atualizarEstadoOcorrencia(avariaProjetor, estadoEmProgresso);
        System.out.println();
        
        // Verificar se o estado mudou na ficha do utilizador
        System.out.println("--- Nova Consulta de Ocorrências do Utilizador ---");
        Afonso.consultarOcorrencia();
        System.out.println("\n-------------------------------------------------------\n");

        // -----------------------------------------------------------------
        // 6. TESTE DE REMOÇÃO DE UTILIZADORES
        // -----------------------------------------------------------------
        System.out.println(">>> 6. Teste de Segurança: Eliminação de Contas...");
        
        System.out.println("[Ação] Tentando remover utilizador ID: U-200");
        sistemaAdministracao.removerUtilizador("U-200");
        System.out.println();
        
        // Validar lista final de utilizadores ativos
        sistemaAdministracao.mostrarUtilizadores();
    }
}