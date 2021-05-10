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

	private Integer id;
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
	 * Id do Boletim
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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


	

	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	
	public void setMedia(double mediaCalculada) {
		this.media = mediaCalculada;
		
	}

	public void resetProvas() {
		provas.removeAll(provas);
		
	}

		

}
