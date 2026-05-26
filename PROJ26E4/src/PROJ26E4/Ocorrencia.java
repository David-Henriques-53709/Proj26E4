/**
 * 
 */
package PROJ26E4;

/**
 * 
 */
import java.time.LocalDate;

enum Prioridade{
	Alta,
	Média,
	Baixa
	
}
public class Ocorrencia {
	private String idOcorrencia;
	private String titulo;
	private String descricao;
	private LocalDate dataCriacao;
	private Prioridade prioridades;
	private EstadoOcorrencia estadoAtual;
	public Ocorrencia(String idOcorrencia , String titulo,String descricao,LocalDate dataCriacao,Prioridade prioridades,EstadoOcorrencia estadoInicial) {
		this.idOcorrencia=idOcorrencia;
		this.titulo=titulo;
		this.descricao=descricao;
		this.dataCriacao=dataCriacao;
		this.prioridades=prioridades;
		this.estadoAtual=estadoInicial;
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
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setDescricao(String descricao) {
		this.descricao=descricao;
	}
	public void setPrioridade(Prioridade prioridade) {
		this.prioridades=prioridade;
	}
	public void consultarEstado() {
		this.estadoAtual = novoEstado ;
		
	}
	@Override
	public String toString() {
		return "Ocorrencia [idOcorrencia=" + idOcorrencia + ", titulo=" + titulo + ", descricao=" + descricao
				+ ", dataCriacao=" + dataCriacao + ", prioridades=" + prioridades + ", getIdOcorrencia()="
				+ getIdOcorrencia() + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao()
				+ ", getDataCriacao()=" + getDataCriacao() + ", getPrioridades()=" + getPrioridades() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
 }
