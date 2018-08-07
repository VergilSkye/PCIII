package br.com.prog3.aula1_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UsandoList {
    public LinkedList<String> listaLinked(){
        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public ArrayList<String> listaArray() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public Vector<String> listaVector(){
        Vector<String> nomes = new Vector<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }
    public List<String> listaList(){
        List<String> nomes = new ArrayList<>();
        nomes.add("Silvia");
        nomes.add("Marina");
        nomes.add("Carla");
        nomes.add("Bruna");
        nomes.add("Silvia");
        return nomes;
    }

    public List<Aluno> listarAlunos(){
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();

        a1.setMatricula(3);
        a1.setNome("Maria");

        a2.setMatricula(2);
        a2.setNome("João");

        a3.setMatricula(4);
        a3.setNome("Andreia");

        a4.setMatricula(1);
        a4.setNome("Andreia");

        List<Aluno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        return lista;
    }
}
