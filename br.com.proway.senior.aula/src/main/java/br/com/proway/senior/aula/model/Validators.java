package br.com.proway.senior.aula.model;

public class Validators {

	static public boolean onlyValidChars(String verify) {
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\"
				+ "/?]+.*");
	}
	
}
