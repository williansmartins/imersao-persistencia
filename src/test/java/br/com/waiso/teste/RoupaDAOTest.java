package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.especific.PessoaDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;
import br.com.waiso.entity.RoupaEntity;

public class RoupaDAOTest {

	JpaGenericDao<RoupaEntity> dao = new JpaGenericDao<RoupaEntity>();
	
	@Test
	public void inserirRoupa() {
		RoupaEntity roupaMockada = new RoupaMassa().popularRoupa();
		dao.insert(roupaMockada);
		Assert.assertTrue(roupaMockada.getId() != null);

}
}