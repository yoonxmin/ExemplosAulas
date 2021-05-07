package br.com.proway.senior.aula.model;

import java.util.ArrayList;

/**
 * Reúne as Provas{@link Provas} de um Aluno{@link Aluno}.
 * 
 * O boletim possui uma lista de Prova {@link Prova} e é referente a um 	periodo.
 * Para cada período é calculada a média das provas que resulta na nota do
 * boletim.
 * 
 * @author Bruna Carvalho<sh4323202@gamil.com>
 * 
 *
 */
public class Boletim {

	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim.
	 * 
	 * O Boletim é criado a partir de um aluno e um periodo. Conforme as 		provas são adicionas, realiza-se o cálculo atualizado da matéria.
	 * 
	 * @param aluno
	 * @param período
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer período) {
		super();
		this.aluno = aluno;
		this.periodo = período;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}

	/**
	 * Aluno do boletim.
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * Periodo no formato YYYYMM.
	 * 
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}

	/**
	 * Retorna média das provas atualizadas.
	 * 
	 * @return
	 */
	public Double getMedia() {
		return this.media;
	}

	/**
	 * Adiciona uma avaliação ao boletim.
	 * 
	 * Ao adicionar a prova a média é recalculada.
	 * 
	 * @param prova
	 */
	public void addProva(Prova prova) {
		
		this.provas.add(prova);
		calcularMedia();
	}
	
	

	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	/**
	 * Remova uma avaliação ao boletim.
	 *
	 * Ao remover a prova a média é recalculada.
	 *
	 * @param prova
	 */
	public void removeProva(Prova prova) {
		this.provas.remove(prova);
	}

	/**
	 * Remova uma avaliação ao boletim.
	 *
	 * Ao remover a prova a média é recalculada.
	 *
	 * @param prova
	 */
	public void removeTodasProvas() {
		this.provas.removeAll(provas);
	}
	
	/**
	 * Retorna todas as provas.
	 * 
	 * * 
	 * @param ArrayList<Prova>
	 */
	public ArrayList<Prova> returnProva() {
		return this.provas;
	}
	
	/**
	 * Calcula a média ponderada das provas.
	 * 
	 * Realiza o calculo das medias das provas.
	 */
	private void calcularMedia() {
		double valorTotal = 0.0;
		for (int i = 0; i<this.provas.size(); i++) {
			valorTotal += this.provas.get(i).getNota();
		}
		this.media = (valorTotal/this.provas.size());		

	}

}
