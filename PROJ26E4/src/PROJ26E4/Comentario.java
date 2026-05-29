package PROJ26E4;
import java.time.LocalDate;
public class Comentario {
	 private String texto;
	 private String autor;
	 private LocalDate data;
	 
	 public Comentario(String texto, String autor) {
		 this.texto = texto;
	     this.autor = autor;
	     this.data = LocalDate.now();
	 }
	 public String getTexto() {
		 return texto;
	 }
	 public String getAutor() {
		 return autor;
	 }
	 public LocalDate getData() {
		 return data;
	 }
	    public String toString() {
	        return "\n------------------------" +
	               "\nAutor : " + autor +
	               "\nData  : " + data +
	               "\nComentário: " + texto +
	               "\n------------------------";
	    }
}
