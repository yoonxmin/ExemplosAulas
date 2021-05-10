package br.com.proway.senior.aula.Persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.aula.model.Aluno;
import br.com.proway.senior.aula.model.Boletim;

public class ArrayListPersistenceBoletimTest {

	static Boletim boletim;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		boletim = new Boletim(aluno, periodo);

	}

	@Test
	public void testAdicionarNoBoletim() {
		ArrayListPersistenceBoletim arrayBoletim = new ArrayListPersistenceBoletim();
		arrayBoletim.add(boletim);
		assertFalse(arrayBoletim.getAll().size() > 1);

	}

	@Test
	public void testPegarNoBoletim() {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		Boletim boletim2 = new Boletim(aluno, periodo);

		ArrayListPersistenceBoletim arrayBoletim = new ArrayListPersistenceBoletim();

		arrayBoletim.add(boletim);
		arrayBoletim.add(boletim2);

		assertEquals(boletim, arrayBoletim.get(0));

	}
	
	@Test
	public void testPegarTodosBoletim() {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		Boletim boletim2 = new Boletim(aluno, periodo);

		ArrayListPersistenceBoletim arrayBoletim = new ArrayListPersistenceBoletim();

		arrayBoletim.add(boletim);
		arrayBoletim.add(boletim2);

		assertEquals(2, arrayBoletim.getAll().size());

	}

	@Test
	public void testRemoverBoletim() {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		Boletim boletim2 = new Boletim(aluno, periodo);
		
		ArrayListPersistenceBoletim arrayBoletim = new ArrayListPersistenceBoletim();
	
		arrayBoletim.add(boletim2);
		arrayBoletim.add(boletim);
		arrayBoletim.remove(1);
		assertFalse(arrayBoletim.getAll().size() > 1);

	}
	
	@Test
	public void testRemoverTodosNoBoletim() {
		ArrayListPersistenceBoletim arrayBoletim = new ArrayListPersistenceBoletim();
		arrayBoletim.add(boletim);
		arrayBoletim.removeAll();
		assertFalse(arrayBoletim.getAll().size() > 0);

	}

}
