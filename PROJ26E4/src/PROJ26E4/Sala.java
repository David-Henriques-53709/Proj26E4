package PROJ26E4;

public class Sala extends Piso {

    private String idSala;
    private String nomeSala;
    private int capacidade;
    private String tipoSala;

    public Sala(String idSala, String nomeSala, int capacidade, String tipoSala) {

        super();
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
