package br.com.proway.senior.aula.model;

/**
 * A avaliação do desempenho do Aluno em uma Matéria.
 * 
 * A prova registra ma avalição pelo Aluno{@link Aluno} relativo ao 	conhecimento de uma matéria. O Aluno{@link Aluno} poderá realizar várias 	avaliações da mesma Materia. A média ponderada das notas das Provas é 	registrada no Boletim{@link Boletim} e verifica se o Aluno{@link Aluno} 	foi aprovado.
 * 
 * @author bruna Carvalho <sh4323202@gmail.com>
 * @see Aluno
 * @see Boletim
 */

public class Prova {

	private Integer id;
	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota;

	
	/**
	 * 
	 * Avaliação de desempenho do aluno.
	 * 
	 * No construtor da prova não atribui-se valor para a nota para que seja possível a criação de provas para depois serem atribuídas as notas.
	 * 
	 * @param periodo Periodo no formato YYYYMM.
	 * @param aluno Aluno que realizou a prova.
	 * @param materia Materia da prova.
	 * @param nota
	 * @throws Exception 
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia) {
		super();
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
	}

	// ---------------------Getters and Setters--------------
	
	/**
	 * Id da Prova
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public Double getNota() {
		return nota;
	}

	/**
	 * Determina a avaliação do aluno.
	 * 
	 * Não pode ser menor que 0 nem maior do que o atributo 		Materia.notaMaxima.
	 * 
	 * @param nota
	 * @throws Exception 
	 */
	public void setNota(Double nota) throws Exception {
		if (nota < 0 || nota > this.materia.notaMaxima) {
			throw new Exception ("valor da nota inválido.");
		}
		this.nota = nota;
	}
	

	public Integer getPeriodo() {
		return periodo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Materia getMateria() {
		return materia;
	}

}
