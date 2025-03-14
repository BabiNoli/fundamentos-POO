package me.dio.models;

public class OperadorDeCaixa extends FuncionarioCLT {
    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Double valorsalario, Endereco endereco) {
        super(nome, documento, valorsalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorsalario=" + valorsalario +
                ", endereco=" + endereco +
                '}';
    }
}
