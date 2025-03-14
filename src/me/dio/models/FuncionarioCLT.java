package me.dio.models;

//classe abstrata só serve para heranca
public abstract class FuncionarioCLT {
    //protected para ficar acessivel para as classes filhas
    protected String nome;
    protected String documento;
    protected Double valorsalario;
    protected Endereco endereco;

    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documento, Double valorsalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorsalario = valorsalario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorsalario() {
        return valorsalario;
    }

    public void setValorsalario(Double valorsalario) {
        this.valorsalario = valorsalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
