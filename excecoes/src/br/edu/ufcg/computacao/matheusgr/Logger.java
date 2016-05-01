package br.edu.ufcg.computacao.matheusgr;

import java.io.*;

public class Logger {

    private final BufferedWriter writer;

    // Implementação de escrita de arquvos.
    // Claro uso de checked: o arquivo pode deixar de existir ou vc usar um codec não disponível, são coisas
    // fora do controle da aplicação. O mesmo vale para os demais métodos.
    public Logger() throws FileNotFoundException, UnsupportedEncodingException {
        File logFile = new File("teste");
        boolean append = false;
        if (!logFile.isFile()) {
            append = true;
        }
        this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile, append), "utf-8"));
    }

    public void info(String msg) throws IOException {
        this.writer.write(msg + "\n");
    };

    public void close() throws IOException {
        this.writer.close();
    }

}