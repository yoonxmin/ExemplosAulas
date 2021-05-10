package br.com.proway.senior.aula.model;

import java.util.ArrayList;

import br.com.proway.senior.aula.Persistence.ArrayListPersistenceProva;

public class ProvaDao {
	
	ArrayListPersistenceProva db;
	
	public ProvaDao(ArrayListPersistenceProva dbProvas) {
		
		this.db = dbProvas;
	}
	
	public void RemoveTodasProvas() {
		db.removeAll();
	}

	public void removeProva(Integer index) {
		db.remove(index);
	}
	
	public void addProva(Prova prova) {
		db.add(prova);		
		
	}
	
	public Prova add(Prova prova) {
		return db.add(prova);
	}
	
	public Prova get(Integer index) {
		return db.get(index);
	}
	
}
