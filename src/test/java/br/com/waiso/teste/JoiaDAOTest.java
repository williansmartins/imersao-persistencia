package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.especific.PessoaDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.JoiaEntity;
import br.com.waiso.entity.PessoaEntity;

public class JoiaDAOTest {

	JpaGenericDao<JoiaEntity> dao = new JpaGenericDao<JoiaEntity>();
	
	@Test
	public void inserirJoia() {
		JoiaEntity joiaMockada = new JoiaMassa().popularJoia();
		dao.insert(joiaMockada);
		Assert.assertTrue(joiaMockada.getId() != null);
	}
	
	
}
