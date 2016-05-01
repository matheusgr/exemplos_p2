package br.edu.ufcg.computacao.matheusgr;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Facade {

    private List<Lembrete> lembretes;

    public Facade() {
        this.lembretes = new LinkedList<>();
    }

    public void salvar() throws IOException {
        // Salvando objetos:
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teste.obj"));
        oos.writeObject(lembretes);
        oos.close();
    }

    public void carregar() throws IOException, ClassNotFoundException {
        // Lendo objetos:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teste.obj"));
        this.lembretes = (LinkedList<Lembrete>) ois.readObject();
    }

    public Lembrete[] listar() {
        return lembretes.toArray(new Lembrete[]{});
    }

    public void adicionarLembrete(String msg) {
        Lembrete lembrete = new Lembrete(msg);
        lembretes.add(lembrete);
    }
}
