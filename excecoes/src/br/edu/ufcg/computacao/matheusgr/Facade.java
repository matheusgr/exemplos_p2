package br.edu.ufcg.computacao.matheusgr;

public class Facade {

    private final Operacoes operacoes;

    public Facade() {
        this.operacoes = new Operacoes();
    }

    // Pq lançar uma checked aqui?
    // Não é realmente necessário, mas uma boa prática é lançar checked nas 'bordas' do sistema de forma que
    // se outro desenvolvedor precisar usar, ele sabe do contrato. Ainda assim, provavelmente não usaria
    // essa exceção como checked aqui.
    public Double execute(String op, double operando1, double operando2) throws CalculadoraException {
        try {
            return operacoes.execute(op, operando1, operando2);
        } catch (ArithmeticException e) {
            // Chained exception: pegando uma exceção mais interna e colocando numa de controle
            // da nossa aplicação.
            throw new CalculadoraException(e);
        }
    }
}
