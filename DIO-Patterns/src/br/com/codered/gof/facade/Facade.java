package br.com.codered.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepService;

public class Facade {

	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepService.getInstance().recuperarCidade(cep);
		String estado = CepService.getInstance().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
