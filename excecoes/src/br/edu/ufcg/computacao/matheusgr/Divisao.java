package br.edu.ufcg.computacao.matheusgr;

public class Divisao implements Operacao{

    @Override
    public Double executa(double op1, double op2) {
        if (op2 == 0.0) {
            // eu poderia retornar null para sinalizar um erro
            // MASSSS... e se outra classe precisasse sinalizar
            // um erro também? É melhor usar exception pra tratar
            // o fluxo de exceção:
            // 1. só vai tratar o fluxo quem precisa
            // 2. é possível ter mais informação sobre o erro
            // (mensagem + stacktrace)
            //
            // pq não é checked? não se trata de recursos, houve
            // má programação ou mau uso do sistema pra chegar aqui
            throw new ArithmeticException("/ by 0.0");
        }
        return op1 / op2;
    }
}
