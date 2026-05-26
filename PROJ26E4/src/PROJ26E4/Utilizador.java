package PROJ26E4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utilizador {

    private String idUtilizador;
    private String nome;
    private String email;
    private String password;
    private String tipoUtilizador;

    private ArrayList<Ocorrencia> ocorrencias;

    // construtor vazio
    public Utilizador() {
        this.ocorrencias = new ArrayList<>();
    }

    // construtor principal
    public Utilizador(String idUtilizador,
                       String nome,
                       String email,
                       String password,
                       String tipoUtilizador) {

        this.idUtilizador = idUtilizador;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.tipoUtilizador = tipoUtilizador;

        this.ocorrencias = new ArrayList<>();
    }

    public String getIdUtilizador() {
        return idUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTipoUtilizador() {
        return tipoUtilizador;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    // CRIAR OCORRÊNCIA
    public void criarOcorrencia(String idOcorrencia,
                                String titulo,
                                String descricao,
                                Prioridade prioridade) {

        // estado inicial automático
        EstadoOcorrencia estadoInicial = new EstadoOcorrencia(
                "EST-01",
                "Aberta",
                "Ocorrência criada pelo utilizador",
                LocalDate.now()
        );

        // criar ocorrência corretamente
        Ocorrencia novaOcorrencia = new Ocorrencia(
                idOcorrencia,
                titulo,
                descricao,
                LocalDate.now(),
                prioridade,
                estadoInicial
        );

        ocorrencias.add(novaOcorrencia);

        System.out.println("Ocorrência '" + titulo +
                "' criada com sucesso pelo utilizador: " + nome);
    }

    // consultar ocorrências
    public void consultarOcorrencia() {

        if (ocorrencias.isEmpty()) {

            System.out.println("O utilizador " + nome +
                    " não tem ocorrências registadas.");
            return;
        }
        System.out.println("< Ocorrências do utilizador: " + nome + " >");
        
        for (Ocorrencia o : ocorrencias) {
            System.out.println(o);
        }
    }

    public String toString() {

        return "Utilizador{" +
                "idUtilizador='" + idUtilizador + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipoUtilizador='" + tipoUtilizador + '\'' +
                ", totalOcorrencias=" + ocorrencias.size() +
                '}';
    }
}