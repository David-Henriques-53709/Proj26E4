package PROJ26E4;

import Projeto.Piso;

public class Estacionamento extends Piso {

    private String idEstacionamento;
    private int numeroLugares;
    private String tipoEstacionamento;

    public Estacionamento (String idEstacionamento, int numeroLugares, String tipoEstacionamento) {

        super();
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
        return " Estacionamento " + idEstacionamento + " com " + numeroLugares + " lugares e do tipo " + tipoEstacionamento + ".";
    }
}
