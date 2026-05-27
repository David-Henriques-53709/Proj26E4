package PROJ26E4;

public class Piso {
	private String idPiso;
	private int numPiso;
	private String descricao;
	private String idBloco;
	
	public Piso(String idPiso, int numPiso, String descricao, String idBloco) {
		this.idPiso = idPiso;
		this.numPiso = numPiso;
		this.descricao = descricao;
		this.idBloco = idBloco;
	}
	
	public String getIdPiso() {
		return idPiso;
	}
	
	public int getNumPiso() {
		return numPiso;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getIdBloco() {
		return idBloco;
	}
	
	public void mostrarOcorrencias() {
		System.out.println("Ocorrências do piso: "  + numPiso);
	}

	public String toString() {
		return "Piso:"+numPiso+
				"\nID do Piso: "+idPiso+
				"\nBloco em que se encontra: "+idBloco+
				"\nDescrição: "+descricao;
	}
}