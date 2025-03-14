package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Camomila", "89", "Bairro das Rosas");

        System.out.println(endereco.getRua() + "," + endereco.getComplemento() + " - " + endereco.getBairro()) ;
        System.out.println("\n----------------\n");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Eduardo");
        vendedor.setDocumento("978-3-16-178410-0");
        vendedor.setEndereco(endereco);
        vendedor.setValorsalario(1000d);

        vendedor.calculaBonificacao(2d); //pode ser com "d" ou com ".0" para indicar que é do tipo double

        System.out.println(vendedor);
        System.out.println("\n----------------\n");


        System.out.println(vendedor.getNome() + " -> " + vendedor.getDocumento()
                + "\n" + "Salário: " + vendedor.getValorsalario()
                + "\n" + endereco.getRua() + "," + endereco.getComplemento()
                + "\n" + endereco.getBairro()) ;
        System.out.println("\n----------------\n");

        OperadorDeCaixa operador = new OperadorDeCaixa("Mônica", "654.456.45",1500d, endereco);
        System.out.println(operador);
        System.out.println("\n----------------\n");

        Gerente gerente = new Gerente();
        gerente.setNome("Gerente");
        gerente.setDocumento("978-3-16-178410-0");
        gerente.setEndereco(String.valueOf(endereco));
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);


    }
}
