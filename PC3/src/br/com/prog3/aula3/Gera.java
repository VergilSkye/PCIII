package br.com.prog3.aula3;

public class Gera {
	public <T> T instanciarClasse(Class<?> classe) {
		T obj = null;
		try {
			obj = (T) Class.forName(classe.getName()).newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e1) {
			return null;
		}
		return obj;
	}
}
