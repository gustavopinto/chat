package prova1b;

import java.util.ArrayList;

public class ObjectIsNull extends Exception {
	private Object ob;
	public ObjectIsNull(ArrayList<Participante> participantes) {
		this.ob = participantes;
	}
	
	public ObjectIsNull() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Nao foi possivel realizar operacao. Objeto <"+ this.ob + "> possui valor NULO";
	}

}
