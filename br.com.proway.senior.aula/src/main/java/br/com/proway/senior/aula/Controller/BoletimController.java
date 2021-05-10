package br.com.proway.senior.aula.Controller;

import java.util.ArrayList;

import br.com.proway.senior.aula.Persistence.ArrayListPersistenceBoletim;
import br.com.proway.senior.aula.model.Boletim;
import br.com.proway.senior.aula.model.BoletimDao;
import br.com.proway.senior.aula.model.Prova;


public class BoletimController {

	public Boletim boletim;
	private BoletimDao boletimDao;
	private ArrayListPersistenceBoletim dbBoletim = new ArrayListPersistenceBoletim();

	/**
	 * Classe de controle do boletim.
	 * 
	 * Recebe um boletim e verifica se o boletim já existe na persistência. Se não
	 * existir, cria um novo.
	 * 
	 * @param boletimEntrada
	 */
	public BoletimController(Boletim boletimEntrada) {
		this.boletimDao = new BoletimDao(dbBoletim);
		this.boletim = boletimEntrada;
	}

	public Boletim addBoletim() {
		if (this.boletim.getId() == null) {
			return this.boletimDao.add(this.boletim);
		}
		return this.boletim;
	}

	/**
	 * Adiciona uma avaliação ao boletim.
	 * 
	 * Ao adicionar a prova a média é recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {

		ProvaController provaController = new ProvaController(prova);
		if (prova.getId() == null) {
			provaController.addProva();
		} else {
			provaController.get(prova.getId());
		}
		boletim.getProvas().add(prova);
		this.calcularMedia();
	}

	/**
	 * Remova uma avaliação ao boletim.
	 *
	 * Ao remover a prova a média é recalculada.
	 *
	 * @param prova
	 */
	public void removeProva(int index) {
		ProvaController provaController = new ProvaController(index);
		provaController.removeProva();
		try {

			boletim.getProvas().remove(index);
			this.calcularMedia();
		

		} catch (Exception e) {
			e.getMessage();
		}

	}

	/**
	 * Remove todas as provas.
	 *
	 * @param prova
	 */
	public void removeTodasProvas() {
		ArrayList<Prova> provas = new ArrayList<Prova>();
	
		for(Prova prova : provas) {
			
			ProvaController provaController = new ProvaController(prova);
			provaController.removeProva();
			
		}
		
	
		this.calcularMedia();
	}

	/**
	 * Retorna todas as provas.
	 * 
	 * *
	 * 
	 * @param ArrayList<Prova>
	 */
	public ArrayList<Prova> returnProva() {
		return boletim.getProvas();
	}

	/**
	 * Calcula a média ponderada das provas.
	 * 
	 * Realiza o calculo das medias das provas das provas e atualiza 
	 * o valor da média.
	 */
	private void calcularMedia() {
		
		double valorTotal = 0.0;
		
		for (int i = 0; i < boletim.getProvas().size(); i++) {
			valorTotal += boletim.getProvas().get(i).getNota();
		}
		
		boletim.setMedia(valorTotal / boletim.getProvas().size());

	}

	public Boletim getBoletim() {
		return this.boletim;
	}
}
