package br.edu.ufcg.computacao.matheusgr;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Facade facade = new Facade();
        Logger lg = new Logger();
        for (;;) {
            Scanner sc1 = new Scanner(System.in);
            String entrada = sc1.nextLine();
            lg.info(entrada);
            Scanner sc = new Scanner(entrada);
            switch (sc.next()) {
                case "SAIR":
                    System.exit(0);
                case "LEMBRETE":
                    facade.adicionarLembrete(sc.nextLine());
                    break;
                case "SALVAR":
                    facade.salvar();
                    break;
                case "CARREGAR":
                    facade.carregar();
                    break;
                case "LISTAR":
                    for (Lembrete lembrete : facade.listar()) {
                        System.out.println(lembrete.getTexto());
                    }
                    break;
                default:
                    break;

            }
        }
    }
}
