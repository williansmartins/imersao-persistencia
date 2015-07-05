package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.especific.PessoaDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;

public class PessoaDAOTest {

	JpaGenericDao<PessoaEntity> dao = new PessoaDAOImpl();
	
	@Test
	public void inserirPessoa() {
		PessoaEntity pessoaMockada = new PessoaMassa().popularPessoa();
		dao.insert(pessoaMockada);
		Assert.assertTrue(pessoaMockada.getId() != null);
	}
	
	@Test
	public void testaSeExcluiuPessoa() {
		PessoaEntity pessoaMockada = new PessoaMassa().popularPessoa();
		
		//testa se o id da pessoa é nullo
		Assert.assertNull( pessoaMockada.getId() );
		
		dao.insert(pessoaMockada);
		
		//testa se inseriu no banco
		Assert.assertNotNull( pessoaMockada.getId() );
		int id = pessoaMockada.getId();

		dao.delete( pessoaMockada.getId() );
		
		//testar se excluiu mesmo
		Assert.assertNull( dao.findById(id) );
		System.out.println(dao.findById(id));
	}
	
	
	
	@Test
	public void test() {
		System.out.println("ola mundo");
	}

}
