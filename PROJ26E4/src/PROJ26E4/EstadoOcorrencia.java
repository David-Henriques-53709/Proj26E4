package PROJ26E4;
import java.time.LocalDate;
public class EstadoOcorrencia {
	/**
	 * @param idEstado
	 * @param nomeEstado
	 * @param descricaoEstado
	 * @param dataAtualizacao
	 */
	public EstadoOcorrencia(String idEstado, String nomeEstado, String descricaoEstado, LocalDate dataAtualizacao) {
		this.idEstado = idEstado;
		this.nomeEstado = nomeEstado;
		this.descricaoEstado = descricaoEstado;
		this.dataAtualizacao = dataAtualizacao;
	}
	private String idEstado;
	private String nomeEstado;
	private String descricaoEstado;
	private LocalDate dataAtualizacao;
	/**
	 * @return the idEstado
	 */
	public String getIdEstado() {
		return idEstado;
	}
	/**
	 * @param idEstado the idEstado to set
	 */
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	/**
	 * @return the nomeEstado
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}
	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	/**
	 * @return the descricaoEstado
	 */
	public String getDescricaoEstado() {
		return descricaoEstado;
	}
	/**
	 * @param descricaoEstado the descricaoEstado to set
	 */
	public void setDescricaoEstado(String descricaoEstado) {
		this.descricaoEstado = descricaoEstado;
	}
	/**
	 * @return the dataAtualizacao
	 */
	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}
	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String toString() {
		return "Estado da Ocorrência: "+
				"\nIdEstado= "+idEstado+
				"\nNome Estado: "+nomeEstado+
				"\nDescrição do estado: "+descricaoEstado+
				"\nData de atualização: "+dataAtualizacao;
	}
}
