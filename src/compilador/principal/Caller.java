package compilador.principal;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder;
import java.util.ArrayList;
import java.util.List;

public class Caller {
    private List<String> commands = new ArrayList<>();
    public Caller(List <String> commands) {
        this.commands = commands;
    }
    public void execute() throws IOException {
        ProcessBuilder process = new ProcessBuilder(this.commands);
        process.directory(new File("/home/jorge/IdeaProjects/Compilador/"));
        process.start();
    }
}