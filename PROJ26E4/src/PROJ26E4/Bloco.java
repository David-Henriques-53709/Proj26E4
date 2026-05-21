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
	
	@Override
	public String toString() {
		return "ID do Bloco:" + idBloco + "| Nome do Bloco: " + nomeBloco + "| Descrição: " + descricao;
	}
}

