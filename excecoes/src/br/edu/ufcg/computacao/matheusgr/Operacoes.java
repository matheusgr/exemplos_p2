package br.edu.ufcg.computacao.matheusgr;

/**
 * Created by Matheus on 4/26/2016.
 */
public class Operacoes {

    private final Soma soma;
    private final Divisao divisao;

    public Operacoes() {
        this.soma = new Soma();
        this.divisao = new Divisao();
    }

    public Double execute(String op, double operando1, double operando2) {
        switch (op) {
            case "/":
                return this.divisao.executa(operando1, operando2);
            case "+":
                return this.soma.executa(operando1, operando2);
            default:
                return null;
        }
    }
}
