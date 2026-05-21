package PROJ26E4;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Utilizador {
	
	
    public Utilizador() {
        this.ocorrencias = new ArrayList<>();
    }
	

	public Utilizador(String idUtilizador, String nome, String email, String password, String tipoUtilizador) {
		IdUtilizador = idUtilizador;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.tipoUtilizador = tipoUtilizador;
		this.ocorrencias = new ArrayList<>();
	}
	
    
	private String IdUtilizador;
	private String nome;
	private String email;
	private String password;
	private String tipoUtilizador;
    private ArrayList<Ocorrencia> ocorrencias;

	
	
	
	public String getIdUtilizador() {
		return IdUtilizador;
	}

	public String getNome() {
		return nome;
	}

	public String getEmial() {
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
	
	
    public void criarOcorrencia(String idOcorrencia, String titulo, String descricao, Ocorrencia.Prioridade prioridade) {
        Ocorrencia novaOcorrencia = new Ocorrencia(idOcorrencia, titulo, descricao, LocalDate.now(), prioridade);
        
        ocorrencias.add(novaOcorrencia);
        
        System.out.println("Ocorrência '" + titulo + "' criada com sucesso pelo utilizador: " + nome);
    }
    
    public void consultarOcorrencia() {
        if (ocorrencias.isEmpty()) {
            System.out.println("O utilizador " + nome + " não tem ocorrências registadas.");
            return;
        }
        System.out.println("< Ocorrências do utilizador: " + nome + " >");
        for (Ocorrencia o : ocorrencias) {
            System.out.println(o.toString());
        }
    }
    
    @Override
    public String toString() {
        return "Utilizador{" +
                "idUtilizador='" + IdUtilizador + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipoUtilizador='" + tipoUtilizador + '\'' +
                ", totalOcorrencias=" + ocorrencias.size() +
                '}';
    }
}
