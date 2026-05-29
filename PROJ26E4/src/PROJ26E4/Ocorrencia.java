package PROJ26E4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum Prioridade{
	Alta,
	Média,
	Baixa	
}

enum Categoria {
    Informatica,
    Estrutura,
    Eletricidade,
    Climatizacao_Ventilacao,
    Seguranca,
    Limpeza,
    Equipamentos
}

public class Ocorrencia {
	private static int proximoId = 1;
	private String idOcorrencia;
	private String titulo;
	private String descricao;
	private LocalDate dataCriacao;
	private Prioridade prioridades;
	private EstadoOcorrencia estadoAtual;
	private String bloco;
	private String piso;
	private String local;
	private Integer avaliacao;
	private Categoria categoria;
	private ArrayList<Comentario>comentarios;
	
	public Ocorrencia(String titulo,String descricao,LocalDate dataCriacao,Prioridade prioridades,Categoria categoria,EstadoOcorrencia estadoInicial,String bloco,String piso,String local) {
		this.idOcorrencia = String.valueOf(proximoId);
		proximoId++;
		this.titulo=titulo;
		this.descricao=descricao;
		this.dataCriacao=dataCriacao;
		this.prioridades=prioridades;
		this.categoria=categoria;
		this.estadoAtual=estadoInicial;
		this.bloco=bloco;
		this.piso=piso;
		this.local=local;
		this.comentarios=new ArrayList<>();
 	}
	public String getIdOcorrencia() {
		return idOcorrencia;	
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;	
	}
	public Prioridade getPrioridades() {
		return prioridades;
	}
	public Categoria getCategoria() {
	    return categoria;
	}
	public EstadoOcorrencia getEstadoAtual() {
		return estadoAtual;
	}
	public Integer getAvaliacao() {
	    return avaliacao;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	public void setPrioridade(Prioridade prioridade) {
		this.prioridades=prioridade;
	}
	public void setEstado(EstadoOcorrencia novoEstado) {
		this.estadoAtual = novoEstado;
	}
	public void consultarEstado() {
		if (estadoAtual == null) {
            System.out.println("Ocorrência sem estado definido.");
        } else {
            System.out.println("Estado atual: " + estadoAtual);
        }
	}
	public void avaliarOcorrencia(int classificacao) {	
	    if(classificacao < 1 || classificacao > 5) {
	        System.out.println("A classificação deve ser entre 1 e 5!");
	        return;
	    }
	    this.avaliacao = classificacao;
	    System.out.println("Avaliação registada com sucesso!");
	}
	public void adicionarComentario(String texto, String autor) {
	    if(texto == null || texto.trim().isEmpty()) {
	        System.out.println("Erro: comentário vazio!");
	        return;
	    }
	    Comentario comentario =new Comentario(texto, autor);
	    comentarios.add(comentario);
	    System.out.println("Comentário adicionado com sucesso!");
	}
	public String toString() {
	    return "\n==================================" +
	           "\nID Ocorrência : " + idOcorrencia +
	           "\nTítulo        : " + titulo +
	           "\nDescrição     : " + descricao +
	           "\nData Criação  : " + dataCriacao +
	           "\nPrioridade    : " + prioridades +
	           "\nCategoria     : " + categoria +
	           "\nEstado Atual  : " + estadoAtual +
	           "\nBloco         : " + bloco +
	           "\nPiso          : " + piso +
	           "\nLocal         : " + local +
	           "\nAvaliação     : " + avaliacao +
	           "\nComentários   : " + comentarios +
	           "\n==================================";
	}
 }