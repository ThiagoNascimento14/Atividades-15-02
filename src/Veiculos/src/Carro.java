package carro;

public class Carro extends Veiculos.Veiculos {
    public Carro(String modelo, String cor) {
        super(modelo, cor);
    }
    public void acionar() {
        System.out.println("Carro acionando o alarme");
    }

    public String obterTipoCombustivel() {
        return "Gasolina e Alcool";
    }
}