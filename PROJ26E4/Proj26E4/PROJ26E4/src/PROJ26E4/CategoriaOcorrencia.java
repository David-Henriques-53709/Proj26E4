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
		public String getCategoria() {
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
		@Override
		public String toString() {
			return "CategoriaOcorrencia [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + ", descricao="
					+ descricao + "]";
}
