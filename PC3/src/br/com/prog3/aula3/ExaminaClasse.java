package br.com.prog3.aula3;
import java.lang.reflect.*;

public class ExaminaClasse {
	public static void examina(Class<?> classe) {
		System.out.println("Classes: " + classe.getCanonicalName());
		System.out.println("Modificadores: " + Modifier.toString(classe.getModifiers()));

		TypeVariable[] tv = classe.getTypeParameters();
		if (tv.length != 0) {
			for (TypeVariable t : tv)
				System.out.println(t.getName());
		} else {
			System.out.println("Sem tipo de parâmetro");
		}

		Type[] interf = classe.getGenericInterfaces();

		if (interf.length != 0) {
			for (Type t : interf)
				System.out.println(t.toString());
		} else {
			System.out.println("Sem interface implementada");
		}

	}

	public static void capturaMembro(Class<?> classe, String tipoMembro) {
		System.out.println("Classe: " + classe.getName());
		Package p = classe.getPackage();
		String pacote = p != null ? p.getName() : "Classe não tem pacote";
		System.out.println("Pacote: " + pacote);
		System.out.println();
		switch (tipoMembro) {
		case "ATRIBUTO": exibirDadosDosAtributos(classe);
		break;
		case "METODO": exibirDadosDosMetodos(classe);
		break;
		case "CONSTRUTOR": exibirDadosDosConstrutores(classe);
		break;
		default: System.out.println("Nada escolhido");
		}

	}

	public static void exibirDadosDosAtributos(Class<?> c) {
		System.out.println("Exibindo lista de atributos, exceto os herdados");
		for (Field f : c.getDeclaredFields()) {
			System.out.println(f.getName());
		}
		System.out.println("Exibindo lista de atributos, exceto os privados");
		for (Field f : c.getFields()) {
			System.out.println(f.getName());
		}

	}

	public static void exibirDadosDosMetodos(Class<?> c) {
		System.out.println("Exibindo lista de métodos , exceto os herdados");
		for (Method m : c.getDeclaredMethods()) {
			System.out.println(m.getName());
		}
		System.out.println("Exibindo lista de métodos, exceto os privados");
		for (Method m : c.getMethods()) {
			System.out.println(m.getName());
		}
	}

	public static void exibirDadosDosConstrutores(Class<?> c) {
		System.out.println("Exibindo lista de construtores");
		for(Constructor ct : c.getDeclaredConstructors()){
		System.out.println(ct.getName());
		}
		System.out.println("Exibindo lista de construtores, exceto os privados");
		for(Constructor ct : c.getConstructors()){
		System.out.println(ct.getName());
		}
		}

}
