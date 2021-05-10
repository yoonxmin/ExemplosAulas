package br.com.proway.senior.aula.TestController;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.aula.Controller.BoletimController;
import br.com.proway.senior.aula.model.Aluno;
import br.com.proway.senior.aula.model.Boletim;
import br.com.proway.senior.aula.model.Materia;
import br.com.proway.senior.aula.model.Prova;

public class BoletimControllerTest {

	static BoletimController controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202125;
		Boletim boletim = new Boletim(aluno, periodo);
		controller = new BoletimController(boletim);
	}

	@Test
	public void testBoletimController() {
	}

	@Test
	public void testAddProva() throws Exception {
		controller.removeTodasProvas();	
		Materia materia = new Materia();
	

		Prova prova = new Prova(202105, controller.getBoletim().getAluno(), materia);
		prova.setNota(5.0);
		prova.setId(0);
		
		controller.addProva(prova);
		assertEquals(1, (int) controller.getBoletim().getProvas().size());
	}
	
	@Test
	public void RemoveProvas() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		
		Prova prova = new Prova(202105, controller.getBoletim().getAluno(), materia);
		Prova prova2 = new Prova(202105, controller.getBoletim().getAluno(), materia);
		Prova prova3 = new Prova(202105, controller.getBoletim().getAluno(), materia);
		
		prova.setNota(6.0);
		prova2.setNota(3.0);
		prova3.setNota(3.0);
	
		prova.setId(0);
		prova2.setId(1);
		prova3.setId(2);
		
		controller.addProva(prova);
		controller.addProva(prova2);
		controller.addProva(prova3);
		
		controller.removeProva(1);
		
		assertFalse(controller.getBoletim().getProvas().size() > 3);
		
		
	}
	
	@Test
	public void testRemoveTodasProvas() throws Exception {
		Materia materia = new Materia();
		controller.addBoletim();
		Prova prova = new Prova(202105, controller.getBoletim().getAluno(), materia);
		prova.setNota(5.0);
		prova.setId(0);
		controller.addProva(prova);
		
		controller.removeTodasProvas();
		
		assertFalse(controller.getBoletim().getProvas().size() > 0);
	}
	
	@Test
	public void testRemoveProvaInexistente() throws Exception {
		Materia materia = new Materia();
		Prova prova = new Prova(202105, controller.getBoletim().getAluno(), materia);
		Prova prova2 = new Prova(202105, controller.getBoletim().getAluno(), materia);
		prova.setNota(5.0);
		prova2.setNota(5.0);
		controller.addProva(prova);
		controller.addProva(prova2);
		controller.removeProva(1);
		assertEquals(1, controller.getBoletim().getProvas().size());
	}
	

}
