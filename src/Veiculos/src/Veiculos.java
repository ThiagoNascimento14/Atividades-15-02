package Veiculos;

public abstract class Veiculos {
    private String modelo;
    private String cor;

    public Veiculos(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters e Setters para os atributos privados
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract void acionar();

    public abstract String obterTipoCombustivel();
}
