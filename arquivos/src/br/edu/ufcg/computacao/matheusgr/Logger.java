package br.edu.ufcg.computacao.matheusgr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Logger {

    public void info(String entrada) throws IOException {
        // Uso do tradicional FileWriter:
        FileWriter fw = new FileWriter("text.log", true);
        fw.write(entrada + "\n");
        fw.close();
    }

    public void info2(String entrada) throws IOException {
        if (!new File("text.log").exists()) {
            new File("text.log").createNewFile();
        }
        // Uma alternativa é usar o objeto Files para escrever e ler arquivos:
        Files.write(new File("text.log").toPath(), (entrada + "\n").getBytes(), StandardOpenOption.APPEND);
    }

}