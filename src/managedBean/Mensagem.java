package managedBean;

import java.util.ArrayList;
import java.util.List;





public class Mensagem {
	
	private int id;
	private String nome;
	private String end;
	private String email;
	private String texto;
	private List<Mensagem> lista = new ArrayList<Mensagem>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public List<Mensagem> getLista() {
		return lista;
	}
	public void setLista(List<Mensagem> lista) {
		this.lista = lista;
	}
	public String addMensagem(Mensagem mb) {
		this.lista.add(mb);
		return "show";
	}
	public void popMensagem(int id) {
		for(Mensagem mb:this.lista){
			if(mb.getId() == id){
				this.lista.remove(id);
			}
		}
	}
	private String algo = "algo";
}
