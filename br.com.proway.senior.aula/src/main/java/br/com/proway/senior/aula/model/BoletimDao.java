package br.com.proway.senior.aula.model;

import br.com.proway.senior.aula.Persistence.ArrayListPersistenceBoletim;

public class BoletimDao {
	ArrayListPersistenceBoletim db;
	
	public BoletimDao(ArrayListPersistenceBoletim db) {
		this.db = db;
	}

	public void removeAll() {
		db.removeAll();
	}

	public void remove(Integer index) {
		db.remove(index);	
	}

	public Boletim add(Boletim boletim) {
		return db.add(boletim);
	}
	
	public Boletim get(int index) {
		return db.get(index);
	}

}

