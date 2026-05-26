package PROJ26E4;

public class Bloco {
	private String idBloco;
	private String nomeBloco;
	private String descricao;
	
	public Bloco(String idBloco, String nomeBloco, String descricao) {
		this.idBloco = idBloco;
		this.nomeBloco = nomeBloco;
		this.descricao = descricao;
		}
	/**
	 * @return the idBloco
	 */
	public String getIdBloco() {
		return idBloco;
	}
	/**
	 * @return the nomeBloco
	 */
	public String getNomeBloco() {
		return nomeBloco;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return "ID do Bloco:" + idBloco + "| Nome do Bloco: " + nomeBloco + "| Descrição: " + descricao;
	}
}

