package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorDaBonificacao;
    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco='" + super.getEndereco() + '\'' +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", remuneracao=" + super.getRemuneracao() +
                ", valorDaBonificacao=" + this.valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = (super.getRemuneracao() * (porcentagemBonificacao/100) + 100d);

    }
}
