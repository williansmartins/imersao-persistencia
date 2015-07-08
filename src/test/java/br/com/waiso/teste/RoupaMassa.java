package br.com.waiso.teste;

import br.com.waiso.entity.RoupaEntity;

public class RoupaMassa {
	
	RoupaEntity popularRoupa(){
		RoupaEntity roupa = new RoupaEntity();
		roupa.setCor("Azul");
		roupa.setValor(40.00);
		roupa.setTecido("seda");
		roupa.setMarca("M Officer");
		roupa.setTamanho("P");
		roupa.setModelo("Verão");
		return roupa;
	}
}
