package PROJ26E4;
import java.util.Scanner;
import java.util.ArrayList;

public class Mapa {
    private ArrayList<Local> locaisNovos = new ArrayList<>();
    private ArrayList<String[]> blocosNovos = new ArrayList<>();

    public Mapa() {
    }
    
    private ArrayList<String> getLocaisPorBlocoPiso(String bloco, int piso) {
        ArrayList<String> resultado = new ArrayList<>();
        for (Local l : locaisNovos) {
            if (l.getBloco().equalsIgnoreCase(bloco) && l.getPiso() == piso) {
                resultado.add(l.getNome());
            }
        }
        return resultado;
    }
    private String getNomeBloco(int blocoOpcao, ArrayList<String> todosOsBlocos) {
        return todosOsBlocos.get(blocoOpcao - 1);
    }
    private int lerOpcaoValida(Scanner sc, int min, int max) { //serve para evitar que o programa crasha quando o utilizador introduz um número inválido.
        int opcao = sc.nextInt();
        sc.nextLine();
        while (opcao < min || opcao > max) {
            System.out.println("Opção inválida! Escolha entre " + min + " e " + max + ":");
            opcao = sc.nextInt();
            sc.nextLine();
        }
        return opcao;
    }
    public String escolherLocal(Scanner sc) {
        ArrayList<String> todosOsBlocos = new ArrayList<>();
        todosOsBlocos.add("Bloco Principal");
        todosOsBlocos.add("Bloco São Tomé");
        for (String[] b : blocosNovos) {
            todosOsBlocos.add(b[0]);
        }
        System.out.println("\nBLOCOS:");
        for (int i = 0; i < todosOsBlocos.size(); i++) {
            System.out.println((i + 1) + " - " + todosOsBlocos.get(i));
        }
        System.out.print("Escolha o bloco: ");
        int blocoEscolha = lerOpcaoValida(sc, 1, todosOsBlocos.size());
        String bloco = getNomeBloco(blocoEscolha, todosOsBlocos);
        int maxPisos;
        if (blocoEscolha == 1) {
            maxPisos = 6;
        } else if (blocoEscolha == 2) {
            maxPisos = 2;
        } else {
            String[] blocoNovo = blocosNovos.get(blocoEscolha - 3);
            maxPisos = Integer.parseInt(blocoNovo[1]);
        }
        System.out.println("\nPISOS:");
        for (int i = 1; i <= maxPisos; i++) {
            System.out.println(i + " - Piso " + i);
        }
        System.out.print("Escolha o piso: ");
        int pisoEscolha = lerOpcaoValida(sc, 1, maxPisos);
        String piso = "Piso " + pisoEscolha;
        ArrayList<String> opcoesPreDefinidas = getOpcoesPredefinidas(blocoEscolha, pisoEscolha);
        ArrayList<String> locaisAdicionados = getLocaisPorBlocoPiso(bloco, pisoEscolha);
        System.out.println("\nLOCAIS:");
        int i = 1;
        for (String op : opcoesPreDefinidas) {
            System.out.println(i + " - " + op);
            i++;
        }
        for (String la : locaisAdicionados) {
            System.out.println(i + " - " + la);
            i++;
        }
        System.out.print("Escolha: ");
        int localEscolha = lerOpcaoValida(sc, 1, opcoesPreDefinidas.size() + locaisAdicionados.size());
        String local;
        int totalPredef = opcoesPreDefinidas.size();
        if (localEscolha <= totalPredef) {
            local = resolverLocalPreDefinido(sc, blocoEscolha, pisoEscolha, localEscolha, opcoesPreDefinidas);
        } else {
            int indicePersonalizado = localEscolha - totalPredef - 1;
            local = locaisAdicionados.get(indicePersonalizado);
        }
        return bloco + " - " + piso + " - " + local;
    }
    private ArrayList<String> getOpcoesPredefinidas(int blocoEscolha, int pisoEscolha) {
        ArrayList<String> opcoes = new ArrayList<>();
        if (blocoEscolha == 1) {
            opcoes.add("Sala");
            if (pisoEscolha <= 3) opcoes.add("Estacionamento");
            opcoes.add("Espaço Comum");
        } else if (blocoEscolha == 2) {
            if (pisoEscolha == 1) {
                opcoes.add("Estacionamento");
                opcoes.add("Espaço Comum");
            } else {
                opcoes.add("Sala");
                opcoes.add("Espaço Comum");
            }
        }
        return opcoes;
    }
    private String resolverLocalPreDefinido(Scanner sc, int blocoEscolha, int pisoEscolha,
                                            int localEscolha, ArrayList<String> opcoes) {
        String opcaoEscolhida = opcoes.get(localEscolha - 1);
        if (opcaoEscolhida.equals("Sala")) {
            if (blocoEscolha == 1) {
                System.out.print("Número da sala (1-21): ");
                int numeroSala = sc.nextInt(); sc.nextLine();
                return "Sala " + pisoEscolha + numeroSala;
            } else {
                System.out.print("Número da sala (750-755): ");
                int numeroSala = sc.nextInt(); sc.nextLine();
                if (numeroSala >= 750 && numeroSala <= 755) return "Sala " + numeroSala;
                System.out.println("Sala inválida!");
                return "Sala Desconhecida";
            }
        }
        if (opcaoEscolhida.equals("Estacionamento")) 
        	return "Estacionamento";

        if (blocoEscolha == 1) {
            return resolverEspacoComunBloco1(sc, pisoEscolha);
        } else {
            return resolverEspacoComunBloco2(sc);
        }
    }
    private String resolverEspacoComunBloco1(Scanner sc, int piso) {
        if (piso == 1) {
            System.out.println("1 - Biblioteca\n2 - Secretaria\n3 - Papelaria\n4 - Corredor\n5 - Espelho de Água\n6 - Casa de Banho");
            System.out.print("Escolha: ");
            int e = sc.nextInt(); sc.nextLine();
            switch (e) {
                case 1: return "Biblioteca";
                case 2: return "Secretaria";
                case 3: return "Papelaria";
                case 4: return "Corredor";
                case 5: return "Espelho de Água";
                default: return "Casa de Banho";
            }
        } else if (piso == 2) {
            System.out.println("1 - Bar\n2 - Esplanada\n3 - Corredor\n4 - Casa de Banho");
            System.out.print("Escolha: ");
            int e = sc.nextInt(); sc.nextLine();
            switch (e) {
                case 1: return "Bar";
                case 2: return "Esplanada";
                case 3: return "Corredor";
                default: return "Casa de Banho";
            }
        } else {
            System.out.println("1 - Corredor\n2 - Casa de Banho");
            System.out.print("Escolha: ");
            int e = sc.nextInt(); sc.nextLine();
            if (e == 1) {
                return "Corredor";
            } else {
                return "Casa de Banho";
            }
        }
    }
    private String resolverEspacoComunBloco2(Scanner sc) {
        System.out.println("1 - Cantina\n2 - Sala de Estudo\n3 - Corredor\n4 - Casa de Banho");
        System.out.print("Escolha: ");
        int e = sc.nextInt(); sc.nextLine();
        switch (e) {
            case 1: return "Cantina";
            case 2: return "Sala de Estudo";
            case 3: return "Corredor";
            default: return "Casa de Banho";
        }
    }
    public void adicionarLocal(Scanner sc) {
        ArrayList<String> todosOsBlocos = new ArrayList<>();
        todosOsBlocos.add("Bloco Principal");
        todosOsBlocos.add("Bloco São Tomé");
        for (String[] b : blocosNovos) {
            todosOsBlocos.add(b[0]);
        }
        System.out.println("\n===== ADICIONAR LOCAL =====");
        System.out.println("Blocos disponíveis:");
        for (int i = 0; i < todosOsBlocos.size(); i++) {
            System.out.println((i + 1) + " - " + todosOsBlocos.get(i));
        }
        System.out.print("Escolha o bloco: ");
        int blocoOpcao = lerOpcaoValida(sc, 1, todosOsBlocos.size());
        String bloco = getNomeBloco(blocoOpcao, todosOsBlocos);
        int maxPisos;
        if (blocoOpcao == 1) {
            maxPisos = 6;
        } else if (blocoOpcao == 2) {
            maxPisos = 2;
        } else {
            maxPisos = Integer.parseInt(blocosNovos.get(blocoOpcao - 3)[1]);
        }
        System.out.println("\nPisos disponíveis:");
        for (int i = 1; i <= maxPisos; i++) {
            System.out.println(i + " - Piso " + i);
        }
        System.out.print("Escolha o piso: ");
        int piso = lerOpcaoValida(sc, 1, maxPisos);
        System.out.print("Nome do novo local: ");
        String nome = sc.nextLine();
        for (Local l : locaisNovos) {
            if (l.getBloco().equalsIgnoreCase(bloco) && l.getPiso() == piso
                    && l.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Esse local já existe neste bloco e piso!");
                return;
            }
        }
        locaisNovos.add(new Local(bloco, piso, nome));
        System.out.println("Local \"" + nome + "\" adicionado em " + bloco + " - Piso " + piso + "!");
    }
    public void adicionarBloco(Scanner sc) {
        System.out.println("\n===== ADICIONAR BLOCO =====");
        System.out.print("Nome do novo bloco: ");
        String nome = sc.nextLine();
        if (nome.equalsIgnoreCase("Bloco Principal") || nome.equalsIgnoreCase("Bloco São Tomé")) {
            System.out.println("Esse bloco já existe!");
            return;
        }
        for (String[] b : blocosNovos) {
            if (b[0].equalsIgnoreCase(nome)) {
                System.out.println("Esse bloco já existe!");
                return;
            }
        }
        System.out.print("Número de pisos: ");
        int pisos = sc.nextInt();
        sc.nextLine();
        blocosNovos.add(new String[]{nome, String.valueOf(pisos)});
        System.out.println("Bloco \"" + nome + "\" com " + pisos + " piso(s) adicionado com sucesso!");
    }
    public void mostrarLocaisNovos() {
        if (locaisNovos.isEmpty()) {
            System.out.println("Não existem locais personalizados adicionados.");
            return;
        }
        System.out.println("\n===== LOCAIS PERSONALIZADOS =====");
        for (Local l : locaisNovos) {
            System.out.println(l);
        }
    }
}