package Models;


import Interface.InterfaceClass;

public class Conversor implements InterfaceClass {
    private String tipoMoeda;
    private double cotacao;

    public Conversor(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
        this.cotacao = 0;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void validaCotacao(){
        if (tipoMoeda.equals("Dólar")){
            cotacao = 5.5d;
        } else if (tipoMoeda.equals("Euro")) {
            cotacao = 6.6d;
        }
    }

    @Override
    public void converterParaReal(double valor) {
        double valorReal = valor * cotacao;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
