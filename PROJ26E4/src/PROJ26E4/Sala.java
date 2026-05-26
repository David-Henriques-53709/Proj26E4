package PROJ26E4;

public class Sala extends Piso {

    private String idSala;
    private String nomeSala;
    private int capacidade;
    private String tipoSala;

    public Sala(String idPiso, int numPiso, String descricao, String idBloco, String idSala, String nomeSala, int capacidade, String tipoSala) {

        super(idPiso, numPiso, descricao, idBloco);
        this.idSala = idSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
        this.tipoSala = tipoSala;
    }

    public String getIdSala() {
		return idSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public String getTipoSala() {
		return tipoSala;
	}

	public String toString() {
    	return " Sala " + idSala + nomeSala + " com capacidade para " + capacidade + " do tipo " + tipoSala + ".";
    }
}
