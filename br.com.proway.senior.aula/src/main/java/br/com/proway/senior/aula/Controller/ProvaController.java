package br.com.proway.senior.aula.Controller;

import br.com.proway.senior.aula.Persistence.ArrayListPersistenceProva;
import br.com.proway.senior.aula.model.Prova;
import br.com.proway.senior.aula.model.ProvaDao;

public class ProvaController {
	private ProvaDao provaDao;
	private Prova prova;
	private ArrayListPersistenceProva dbProvas = new ArrayListPersistenceProva();

	public ProvaController(Prova prova) {
		this.provaDao = new ProvaDao(dbProvas);
		this.prova = prova;

	}

	public ProvaController(int index) {
		this.provaDao = new ProvaDao(dbProvas);
		this.prova = provaDao.get(index);
	}

	/**
	 * Adiciona uma avaliaÃ§Ã£o
	 * 
	 * @param prova
	 */

	public Prova addProva() {
		if (this.prova.getId() == null) {
			return this.provaDao.add(this.prova);
		}
		return this.prova;
	}

	/**
	 * Remove uma avaliaÃ§Ã£o do boletim.
	 * 
	 * Ao remover a Prova, a mÃ©dia Ã© recalculada.
	 * 
	 * @param prova
	 */

	public void removeProva() {
		try {

			provaDao.removeProva(prova.getId());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	public Prova get(Integer id) {
		return this.provaDao.get(id);
	}
}
