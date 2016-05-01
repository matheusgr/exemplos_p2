package br.edu.ufcg.computacao.matheusgr;

/**
 * Created by Matheus on 4/26/2016.
 */
public class Soma implements Operacao {
    @Override
    public Double executa(double op1, double op2) {
        return op1 + op2;
    }
}
