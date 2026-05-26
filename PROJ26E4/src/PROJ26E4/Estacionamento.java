package PROJ26E4;

public class Estacionamento {

    private String idEstacionamento;
    private int numeroLugares;
    private String tipoEstacionamento;

    public Estacionamento (String idEstacionamento, int numeroLugares, String tipoEstacionamento) {

        this.idEstacionamento = idEstacionamento;
        this.numeroLugares = numeroLugares;
        this.tipoEstacionamento = tipoEstacionamento;
    }
    
    public String getIdEstacionamento() {
		return idEstacionamento;
	}

	public int getNumeroLugares() {
		return numeroLugares;
	}

	public String getTipoEstacionamento() {
		return tipoEstacionamento;
	}

	public String toString() {
	    return "ID Estacionamento: " + idEstacionamento +
	           "\nLugares: " + numeroLugares +
	           "\nTipo: " + tipoEstacionamento;
	}
}
