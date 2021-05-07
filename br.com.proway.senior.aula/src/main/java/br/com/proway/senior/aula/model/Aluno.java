package br.com.proway.senior.aula.model;

/**
 * Pessoa que estuda na escola.
 * 
 * Um aluno é uma pessoa que estuda na escola. O aluno frequenta as aulas tem
 * Nota {@link Nota} , uma Turma{@link Turma} e Boletim {@link Boletim}.
 * 
 * @author bruna Carvalho <sh4323202@gmail.com>
 * @see Nota
 * @see Boletim
 * @see Turma
 */

public class Aluno {
	/**
	 * Primeiro Nome do aluno.
	 */
	private String nome;

	/**
	 * Último nome do aluno.
	 */
	private String sobrenome;

	/**
	 * Idade do aluno.
	 */
	private Integer idade;

	// ---------------------Getters and Setters--------------

	/**
	 * Primeiro Nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Primeiro Nome do aluno.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Execption não utilize números no nome do aluno.
	 */
	public void setNome(String nomeEntrada) throws Exception {

		// retirar o que não é alfabético.
		if (Validators.onlyValidChars(nomeEntrada)) {
			this.nome = nomeEntrada;
		} else
			throw new Exception("Não utilize números no nome");
	}

	/**
	 * Último nome do aluno.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Último nome do aluno.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @throws Exception
	 */
	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if (!Validators.onlyValidChars(sobrenomeEntrada)) {
			throw new Exception("Não utilize números no nome");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	/**
	 * Idade do aluno.
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * Idade do aluno.
	 * 
	 * Idade em anos. Deve ser um número inteiro.
	 * 
	 * @throws Exception
	 * 
	 */
	public void setIdade(Integer idadeEntrada) throws Exception {
		if (idadeEntrada < 0 || idadeEntrada > 139) {
			throw new Exception("Idade precisa estar entre 0 e 130 (inclusive)");
		}

		this.idade = idadeEntrada;
	}

}
