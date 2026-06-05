package PROJ26E4;
import java.util.Scanner;
import java.util.ArrayList;
public class Mapa {
    private ArrayList<Local>locaisNovos = new ArrayList<>();

	public Mapa() {
	}
	public String escolherLocal(Scanner sc) {
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
                    System.out.println("6 - Casa de Banho");
                    System.out.print("Escolha: ");
                    int espaco = sc.nextInt();
                    sc.nextLine();
                    switch(espaco) {
                        case 1:
                            local = "Biblioteca";
                            break;
                        case 2:
                            local = "Secretaria";
                            break;
                        case 3:
                            local = "Papelaria";
                            break;
                        case 4:
                            local = "Corredor";
                            break;
                        case 5:
                            local = "Espelho de Água";
                            break;
                        case 6:
                        	local = "Casa de Banho";
                        	break;
                    }
                } else if(pisoEscolha == 2) {
                    System.out.println("1 - Bar");
                    System.out.println("2 - Esplanada");
                    System.out.println("3 - Corredor");
                    System.out.println("4 - Casa de Banho");
                    System.out.print("Escolha: ");
                    int espaco = sc.nextInt();
                    sc.nextLine();
                    if(espaco == 1) {
                        local = "Bar";
                    } else if(espaco == 2){
                        local = "Esplanada";
                    } else if(espaco == 3){
                        local = "Corredor";
                    }
                    else {
                    	local = "Casa de Banho";
                    }
                } else {
                    System.out.println("1 - Corredor");
                    System.out.println("2 - Casa de Banho");
                    System.out.print("Escolha: ");
                    int espaco = sc.nextInt();
                    sc.nextLine();
                    if(espaco == 1) {
                        local = "Corredor";
                    } else {
                        local = "Casa de Banho";
                    }
                }
            }
        } else {
            if(pisoEscolha == 1) {
                System.out.println("1 - Estacionamento");
                System.out.println("2 - Espaço Comum");
                System.out.print("Escolha: ");
                localEscolha = sc.nextInt();
                sc.nextLine();
                if(localEscolha == 1) {
                    local = "Estacionamento";
                } else {
                    System.out.println("1 - Cantina");
                    System.out.println("2 - Sala de Estudo");
                    System.out.println("3 - Corredor");
                    System.out.println("4 - Casa de Banho");
                    System.out.print("Escolha: ");
                    int espaco = sc.nextInt();
                    sc.nextLine();
                    switch(espaco) {
                        case 1:
                            local = "Cantina";
                            break;
                        case 2:
                            local = "Sala de Estudo";
                            break;
                        case 3:
                            local = "Corredor";
                            break;
                        case 4:
                        	local = "Casa de Banho";
                        	break;
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
                    System.out.println("1 - Corredor");
                    System.out.println("2 - Casa de Banho");
                    System.out.print("Escolha: ");
                    int espaco = sc.nextInt();
                    sc.nextLine();
                    if(espaco == 1) {
                        local = "Corredor";
                    } else {
                        local = "Casa de Banho";
                    }
                }
            }
        }
        return bloco + " - " + piso + " - " + local;
    }
    public void adicionarLocal(
            String bloco,
            int piso,
            String nome) {
        Local novoLocal = new Local(
                bloco,
                piso,
                nome
        );
        locaisNovos.add(novoLocal);
        System.out.println("Local adicionado com sucesso!");
    }
    public void mostrarLocaisNovos() {
        if(locaisNovos.isEmpty()) {
            System.out.println("Não existem locais adicionados.");
            return;
        }
        System.out.println("\n===== LOCAIS ADICIONADOS =====");
        for(Local l : locaisNovos) {
            System.out.println(l);
        }
    }
}