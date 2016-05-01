package br.edu.ufcg.computacao.matheusgr;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Facade fc = new Facade();
        Logger logger = new Logger();

        for (;;) {
            String op = sc.next();
            if ("fim".equals(op)) {
                logger.close();
                System.exit(0);
            }
            double operando1 = sc.nextDouble();
            double operando2 = sc.nextDouble();
            logger.info("LOG: " + op + " " + operando1 + " " + operando2);

            // no lugar de capturar uma exceção, vc poderia verificar se o operador é / e se
            // o segundo operando é 0.0 mas isso quebra a coesão: quem sabe operar a divisão
            // é a classe Divisao, não faz sentido essa checagem estar aqui.

            try {
                System.out.println(fc.execute(op, operando1, operando2));
            } catch (CalculadoraException ce) {
                System.err.println("Erro! " + ce.getMessage());
                System.err.println("Origem: " + ce.getCause().getMessage());
                ce.printStackTrace();
            }
        }
    }
}
