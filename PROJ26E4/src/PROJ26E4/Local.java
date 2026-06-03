package PROJ26E4;

public class Local {
	/**
	 * @param bloco
	 * @param piso
	 * @param nome
	 */
	public Local(String bloco, String piso, String nome) {
		this.bloco = bloco;
		this.piso = piso;
		this.nome = nome;
	}
	private String bloco;
    private String piso;
    private String nome;
	/**
	 * @return the bloco
	 */
	public String getBloco() {
		return bloco;
	}
	/**
	 * @return the piso
	 */
	public String getPiso() {
		return piso;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	public String toString() {
		return "Bloco: "+bloco+
				"\nPiso: "+piso+
				"|nNome do Local: "+nome;
	}
}