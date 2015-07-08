package br.com.waiso.teste;

import br.com.waiso.entity.JoiaEntity;

public class JoiaMassa {
	
	JoiaEntity popularJoia(){
		JoiaEntity joia = new JoiaEntity();
		joia.setMarca("Stern");
		joia.setCor("Rosa");
		joia.setTipo("Colar");
		joia.setValor(100.00);
		joia.setMaterial("Ouro");
		joia.setTamanho("longo");
		return joia;
	}
}
