package caminhao;

public class Caminhao extends Veiculos.Veiculos {
    public Caminhao(String modelo, String cor) {
        super(modelo, cor);
    }

    public void acionar() {
        System.out.println("Caminhão buzinando");
    }

    public String obterTipoCombustivel() {
        return "Diesel";
    }
}