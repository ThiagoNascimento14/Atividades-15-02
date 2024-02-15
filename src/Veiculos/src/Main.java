package principal;

import carro.Carro;
import moto.Moto;
import caminhao.Caminhao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de veículos variados
        List<Veiculos.Veiculos> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fusca", "Azul"));
        veiculos.add(new Moto("Honda", "Vermelha"));
        veiculos.add(new Caminhao("Volvo", "Branco"));

        // Chamando o método acionar() e obterTipoCombustivel() para cada veículo
        Object Veiculos;
        for (Veiculos.Veiculos veiculo : veiculos) {
            veiculo.acionar();
            System.out.println("Tipo de combustível do " + veiculo.getClass().getSimpleName() + ": " + veiculo.obterTipoCombustivel());

        }
    }
}