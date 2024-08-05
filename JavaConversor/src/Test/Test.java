package Test;

import Models.Conversor;

public class Test {
    public static void main(String[] args) {
        Conversor conversor = new Conversor("Dólar");
        conversor.validaCotacao();

        conversor.converterParaReal(31.2d);

    }
}
