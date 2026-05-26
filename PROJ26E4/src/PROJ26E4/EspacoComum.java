package PROJ26E4;

public class EspacoComum {

    private String idEspacoComum;
    private String nomeEspaco;
    private String descricaoEspaco;
    private int capacidadeMaxima;

    public EspacoComum(String idEspacoComum, String nomeEspaco, String descricaoEspaco, int capacidadeMaxima) {

        this.idEspacoComum = idEspacoComum;
        this.nomeEspaco = nomeEspaco;
        this.descricaoEspaco = descricaoEspaco;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getIdEspacoComum() {
		return idEspacoComum;
	}

	public String getNomeEspaco() {
		return nomeEspaco;
	}

	public String getDescricaoEspaco() {
		return descricaoEspaco;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public String toString() {
	    return "ID Espaço: " + idEspacoComum +
	           " | Nome: " + nomeEspaco +
	           " | Descrição: " + descricaoEspaco +
	           " | Capacidade: " + capacidadeMaxima;
	}
 }
