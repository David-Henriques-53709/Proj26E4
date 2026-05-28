package PROJ26E4;
import java.time.LocalDate;

enum Prioridade{
	Alta,
	Média,
	Baixa	
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
	
	public Ocorrencia(String titulo,String descricao,LocalDate dataCriacao,Prioridade prioridades,EstadoOcorrencia estadoInicial,String bloco,String piso,String local) {
		this.idOcorrencia = String.valueOf(proximoId);
		proximoId++;
		this.titulo=titulo;
		this.descricao=descricao;
		this.dataCriacao=dataCriacao;
		this.prioridades=prioridades;
		this.estadoAtual=estadoInicial;
		this.bloco=bloco;
		this.piso=piso;
		this.local=local;
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
	public EstadoOcorrencia getEstadoAtual() {
		return estadoAtual;
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
	public String toString() {
	    return "\n==================================" +
	           "\nID Ocorrência : " + idOcorrencia +
	           "\nTítulo        : " + titulo +
	           "\nDescrição     : " + descricao +
	           "\nData Criação  : " + dataCriacao +
	           "\nPrioridade    : " + prioridades +
	           "\nEstado Atual  : " + estadoAtual +
	           "\nBloco         : " + bloco +
	           "\nPiso          : " + piso +
	           "\nLocal         : " + local +
	           "\n==================================";
	}
 }