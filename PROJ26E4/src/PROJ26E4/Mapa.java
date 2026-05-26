package PROJ26E4;

public class Mapa {
	public Mapa(String idMapa, String nomeMapa, String descricao) {
		this.idMapa = idMapa;
		this.nomeMapa = nomeMapa;
		this.descricao = descricao;
	}
	private String idMapa;
    private String nomeMapa;
    private String descricao;

	public String getIdMapa() {
		return idMapa;
	}
	public void setIdMapa(String idMapa) {
		this.idMapa = idMapa;
	}
	public String getNomeMapa() {
		return nomeMapa;
	}
	public void setNomeMapa(String nomeMapa) {
		this.nomeMapa = nomeMapa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
    public void mostrarMapa() {
        System.out.println("==========================================");
        System.out.println("               MAPA: " + nomeMapa);
        System.out.println("==========================================");
        System.out.println("ID       : " + idMapa);
        System.out.println("Nome     : " + nomeMapa);
        System.out.println("Descrição: " + descricao);
        System.out.println("==========================================");
    }
 
    public String toString() {
        return "Mapa{" +
                "idMapa='" + idMapa + '\'' +
                ", nomeMapa='" + nomeMapa + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

}
