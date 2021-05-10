package br.com.proway.senior.aula.TestModel;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.aula.model.Aluno;
import br.com.proway.senior.aula.model.Materia;
import br.com.proway.senior.aula.model.Prova;

public class ProvaTest {

	static Prova prova;
	static int periodoParam = 202105;
	
	@BeforeClass
	public static void creatProva(){
	Integer periodo = 202105;
	Materia materia = new Materia();
	Aluno aluno = new Aluno();
	prova = new Prova(periodo, aluno, materia);
	
	}
	
	@Test
	public void testSetGetNotaCorreta() {
		try {
			
			prova.setNota(10.0);
			
		}catch (Exception e) {
			fail(e.getMessage());
		}
		
		assertEquals(10.0, (double) prova.getNota(), 0.1);
	}

	@Test (expected = Exception.class )
	public void testSetGetNotaIncorreta() throws Exception {
		prova.setNota(-10.0);
	}

	@Test
	public void testGetPeriodo() {
		assertEquals(periodoParam, (int) prova.getPeriodo());
	}

	@Test
	public void testGetAluno() {
		assertNotNull(prova.getAluno());
	}

	@Test
	public void testGetMateria() {
		assertNotNull(prova.getMateria());
	}

}
