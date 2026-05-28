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

    public Utilizador() {
        this.ocorrencias = new ArrayList<>();
    }

    public Utilizador(String idUtilizador,String nome,String email,String password,String tipoUtilizador) {
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
    public String getId() {
        return idUtilizador;
    }

    public void criarOcorrencia(String titulo,
                                String descricao,
                                Prioridade prioridade,
                                String bloco,
                                String piso,
                                String local) {

        EstadoOcorrencia estadoInicial = new EstadoOcorrencia(
                "EST-01",
                "Por Resolver",
                "Ocorrência criada pelo utilizador",
                LocalDate.now()
        );

        Ocorrencia novaOcorrencia = new Ocorrencia(
                titulo,
                descricao,
                LocalDate.now(),
                prioridade,
                estadoInicial,
                bloco,
                piso,
                local
        );
        ocorrencias.add(novaOcorrencia);
        System.out.println("Ocorrência '" + titulo +
                "' criada com sucesso pelo utilizador: " + nome);
    }

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
    
    public void cancelarOcorrencia(int indice) {

        if(indice < 0 || indice >= ocorrencias.size()) {
            System.out.println("Ocorrência inválida!");
            return;
        }

        Ocorrencia ocorrencia = ocorrencias.get(indice);

        if(!ocorrencia.getEstadoAtual().getNomeEstado()
                .equals("Por Resolver")) {

            System.out.println(
                "Só pode cancelar ocorrências Por Resolver!"
            );

            return;
        }

        ocorrencias.remove(indice);

        System.out.println(
            "Ocorrência cancelada com sucesso!"
        );
    }
    public String toString() {
        return "\n==============================" +
               "\nID Utilizador   : " + idUtilizador +
               "\nNome            : " + nome +
               "\nEmail           : " + email +
               "\nTipo Utilizador : " + tipoUtilizador +
               "\nOcorrências     : " + ocorrencias.size() +
               "\n==============================";
    }
}