package moto;

public class Moto extends Veiculos.Veiculos {
    public Moto(String modelo, String cor) {
        super(modelo, cor);
    }


    public void acionar() {
        System.out.println("Moto acionando o kickstart");
    }


    public String obterTipoCombustivel() {
        return "Gasolina";
    }
}