package br.com.prog3.aula1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class UsandoSet {
    public HashSet<String> listarHashSet(){
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public LinkedHashSet<String> listarLinked(){
        LinkedHashSet<String> nomes = new LinkedHashSet<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public TreeSet<String> listarTreeSet(){
        TreeSet<String> nomes = new TreeSet<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public Set<String> listar(){
        Set<String> nomes = new HashSet<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public Set<Aluno> listarAlunos(){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setMatricula(3);
        a1.setNome("Maria");

        a2.setMatricula(2);
        a2.setNome("Jo�o");

        a3.setMatricula(4);
        a3.setNome("Andreia");

        a4.setMatricula(1);
        a4.setNome("Andreia");

        Set<Aluno> lista = new HashSet<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        return lista;
    }
    
}
