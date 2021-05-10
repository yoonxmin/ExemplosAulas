package br.com.proway.senior.aula.TestModel;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.aula.model.Aluno;
import br.com.proway.senior.aula.model.Boletim;

public class BoletimTest {

	static Boletim boletim;
	private static int periodoPadrao = 202105;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		Aluno aluno = new Aluno();
		Integer periodo = 202105;
		 boletim = new Boletim(aluno, periodo);

	}

	@Test
	public void testGetPeriodo() {
		assertEquals(periodoPadrao, (int) boletim.getPeriodo());
	}

	@Test
	public void testGetMedia() throws Exception {

		assertEquals(0.0, boletim.getMedia(), 0.1);
	}

	@Test
	public void testBoletim() {
		assertNotNull(boletim);
	}

	@Test
	public void testGetAluno() {
		assertNotNull(boletim.getAluno());
	}

}
