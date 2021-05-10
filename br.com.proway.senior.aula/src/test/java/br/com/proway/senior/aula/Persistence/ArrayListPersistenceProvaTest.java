package br.com.proway.senior.aula.Persistence;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.aula.model.Aluno;
import br.com.proway.senior.aula.model.Boletim;
import br.com.proway.senior.aula.model.Materia;
import br.com.proway.senior.aula.model.Prova;

public class ArrayListPersistenceProvaTest {

	static Prova prova;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		Materia materia = new Materia();
		prova = new Prova(periodo, aluno, materia);
	}

	@Test
	public void testAdicionarProva() {
		ArrayListPersistenceProva arrayProva = new ArrayListPersistenceProva();
		arrayProva.add(prova);
		assertFalse(arrayProva.getAll().size() > 1);
	}

	@Test

	public void testPegarProva() {

		Aluno aluno2 = new Aluno();
		Integer periodo2 = 202125;
		Materia materia2 = new Materia();
		Prova prova2 = new Prova(periodo2, aluno2, materia2);

		ArrayListPersistenceProva arrayProva = new ArrayListPersistenceProva();

		arrayProva.add(prova);
		arrayProva.add(prova2);

		assertEquals(prova, arrayProva.get(0));

	}

	@Test
	public void testPegarTodasAsProvas() {
		Aluno aluno2 = new Aluno();
		Integer periodo2 = 202125;
		Materia materia2 = new Materia();
		Prova prova2 = new Prova(periodo2, aluno2, materia2);

		ArrayListPersistenceProva arrayProva = new ArrayListPersistenceProva();

		arrayProva.add(prova);
		arrayProva.add(prova2);

		assertEquals(2, arrayProva.getAll().size());

	}

	@Test
	public void testRemoverProva() {
		Aluno aluno2 = new Aluno();
		Integer periodo2 = 202125;
		Materia materia2 = new Materia();
		Prova prova2 = new Prova(periodo2, aluno2, materia2);

		ArrayListPersistenceProva arrayProva = new ArrayListPersistenceProva();

		arrayProva.add(prova);
		arrayProva.add(prova2);
		arrayProva.remove(1);

		assertEquals(1, arrayProva.getAll().size());
	}
	
	@Test
	public void testRemoverTodasAsProvas() {
		ArrayListPersistenceProva arrayProva = new ArrayListPersistenceProva();
		arrayProva.add(prova);
		arrayProva.removeAll();
		assertFalse(arrayProva.getAll().size() > 0);

	}


}
