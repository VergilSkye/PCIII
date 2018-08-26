package br.com.prog3.aula3;

public class ExaminaClasseTeste {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//ExaminaClasse.examina(Class.forName("br.com.prog3.aula3.Carro"));
		//ExaminaClasse.examina(Class.forName("java.util.concurrent.ConcurrentNavigableMap"));
		//ExaminaClasse.capturaMembro(Class.forName("br.com.prog3.aula3.Carro"));
		//ExaminaClasse.capturaMembro(Class.forName("br.com.prog3.aula3.Carro"),"CONSTRUTOR");
		//ExaminaClasse.capturaMembro(Class.forName("br.com.prog3.aula3.Carro"),"ATRIBUTO");
		ExaminaClasse.capturaMembro(Class.forName("br.com.prog3.aula3.Carro"),"METODO");
	
	}

}
