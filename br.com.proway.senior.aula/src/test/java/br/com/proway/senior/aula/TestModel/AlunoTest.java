package br.com.proway.senior.aula.TestModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.proway.senior.aula.model.Aluno;

public class AlunoTest {

	
	@Test
	public void testNomeAlunoValido() throws Exception {
		Aluno aluno = new Aluno();
			aluno.setNome("Joao");
			assertNotNull(aluno.getNome());
		
	}
	
	@Test (expected = Exception.class)
	public void testNomeAlunoInvalido() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setNome("Jõa;o11");
	
	}
	
	@Test
	public void testSobrenomeAlunoValido() throws Exception {
		Aluno aluno = new Aluno();
			aluno.setSobrenome("Silva");
			assertNotNull(aluno.getSobrenome());
		
	}
	
	@Test (expected = Exception.class)
	public void testSobrenomeInvalido() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setSobrenome("Sil;va");
	
	}
	
	@Test
	public void testIdadeValida() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setIdade(12);
		assertEquals (12, (int) aluno.getIdade());
		
	}

	@Test (expected = Exception.class)
	public void testIdadeInvalida() throws Exception {
		Aluno aluno = new Aluno();
		aluno.setIdade(150);
		
	}

	
}
