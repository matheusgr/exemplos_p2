package br.edu.ufcg.computacao.matheusgr;

import java.io.Serializable;

// Implementando serializable:
public class Lembrete implements Serializable {

    // Garante que a classe do objeto lido é a mesma da classe do objeto gravado.
    // Se quando o objeto foi salvo, o ID era diferente, isso dá problema ao carregar!
    private static final long serialVersionUID = 1L;

    private String texto;

    public Lembrete(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

}
