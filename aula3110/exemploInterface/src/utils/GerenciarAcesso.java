package utils;

import model.Logavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {

    private static List<Logavel> logados = new ArrayList<>();

    public static List<Logavel> getLogados() {
        return logados;
    }

    public static void adicionarLogavel(Logavel logavel) {
        logados.add(logavel);
    }

    public static void removerLogavel(Logavel logavel) {
        logados.remove(logavel);
    }
}
