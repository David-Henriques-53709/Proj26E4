package PROJ26E4;

public class Local {
	/**
	 * @param bloco
	 * @param piso
	 * @param nome
	 */
	public Local(String bloco, int piso, String nome) {
		this.bloco = bloco;
		this.piso = piso;
		this.nome = nome;
	}
	private String bloco;
    private int piso;
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
	public int getPiso() {
		return piso;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	public String toString() {
		return "Nome do Bloco: "+bloco+
				"\nNúmero do Piso: "+piso+
				"\nNome do Local: "+nome;
	}
}