package me.dio.models;

//extends significa que é filha de outra. Extende outra
public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorsalario=" + valorsalario +
                ", endereco=" + endereco +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = (this.valorsalario * (porcentagemBonificacao/100));

    }
}
