package managedBean;

import java.util.ArrayList;
import java.util.List;







public class Mensagem {
	
	private Msg msg = new Msg();
	private List<Msg> lista = new ArrayList<Msg>();
	
	
	
	public String enviarMensagem(){
		lista.add(msg);
		msg = new Msg();
		return "listarMensagens";
	}



	public Msg getMsg() {
		return msg;
	}



	public void setMsg(Msg msg) {
        this.msg = msg;
	}



	public List<Msg> getLista() {
		return lista;
	}



	public void setLista(List<Msg> lista) {
		this.lista = lista;
	}
	
	}
