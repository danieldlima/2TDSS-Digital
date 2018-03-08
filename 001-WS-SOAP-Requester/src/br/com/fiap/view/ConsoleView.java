package br.com.fiap.view;

import br.com.fiap.bo.NotaBOStub;
import br.com.fiap.bo.NotaBOStub.CalcularMedia;
import br.com.fiap.bo.NotaBOStub.CalcularMediaResponse;

public class ConsoleView {

	public static void main(String[] args) throws Exception {
		NotaBOStub stub = new NotaBOStub();

		//Parametros para enviar ao web service
		CalcularMedia parametros = new CalcularMedia();
		parametros.setAm(7);
		parametros.setNac(6);
		parametros.setPs(6);
		
		//Chama o web service e recupera o retorno
		CalcularMediaResponse resp =
						stub.calcularMedia(parametros);
		
		//Exibe o valor calculado do web service
		System.out.println(resp.get_return());
	}
	
	
	
}



