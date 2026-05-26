package PROJ26E4;

public class CategoriaOcorrencia {
	private String idCategoria;
	private String nomeCategoria;
	private String descricao;
		
	public CategoriaOcorrencia(String idCategoria,String nomeCategoria , String descricao) {
		this.idCategoria=idCategoria;
		this.nomeCategoria=nomeCategoria;
		this.descricao=descricao;
		}
	public String getIdCategoria() {
		return idCategoria;	
		}
	public String getNomeCategoria() {
		return nomeCategoria;
		}
	public String getDescricao() {
		return descricao;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria=nomeCategoria;
		}
	public void setDescricao(String descricao) {
		this.descricao=descricao;
		}
	public String toString() {
	    return "\n==============================" +
	           "\nID Categoria : " + idCategoria +
	           "\nNome         : " + nomeCategoria +
	           "\nDescrição    : " + descricao +
	           "\n==============================";
	}
}
