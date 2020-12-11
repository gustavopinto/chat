package prova1b;
import java.util.Date;
public class Mensagem {

	  private String texto;
	    
	    private Date dataHoraenvio;

	    public Mensagem(String texto) {
	        this.texto = texto;
	      
	        this.dataHoraenvio = new Date(System.currentTimeMillis());
	    }

	    public String getMensagem() {
	        return texto;
	    }
	    

	    public Date infoDataHoraEnvio() {
	        return this.dataHoraenvio;
	    }
}
