package br.com.proway.senior.aula.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BoletimTest {

	static Boletim boletim;
	private static int periodoPadrao= 202105;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		boletim = new Boletim(aluno, periodo);
	}
	


	@Test
	public void testGetPeriodo() {
		assertEquals(periodoPadrao, (int) boletim.getPeriodo());
	}

	@Test
	public void testGetMedia() throws Exception {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		
		prova.setNota(10.0);
		prova2.setNota(3.0);
		prova3.setNota(5.0);
		
		boletim.addProva(prova);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		
		assertTrue((double) boletim.getMedia() == 6.0);
		}

	@Test
	public void testAddProva() throws Exception {
		Materia materia = new Materia();
		boletim.removeTodasProvas();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		prova.setNota(5.0);
		boletim.addProva(prova);
		assertEquals(1, (int) boletim.getProvas().size());
	}

	
	@Test
	public void listaProvas() throws Exception {
		Materia materia = new Materia();
		boletim.removeTodasProvas();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		
		prova.setNota(6.0);
		prova2.setNota(3.0);
		prova3.setNota(3.0);
		
		boletim.addProva(prova);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		
		assertTrue(boletim.returnProva().size() == 3);
	}
	
	@Test
	public void RemoveProvas() throws Exception {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		
		prova.setNota(6.0);
		prova2.setNota(3.0);
		prova3.setNota(3.0);
		
		boletim.addProva(prova);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		
		boletim.removeProva(prova3);
		
	}
	
		

}
