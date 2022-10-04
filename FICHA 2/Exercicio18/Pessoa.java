package entities;

import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private String cpf;
    private int matricula;
    private String nomeUsuario;
    private String cargo;
    private BigDecimal salario;
    private Boolean status;
    private String senha;
    private Endereco endereco;
    public Pessoa(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
            Boolean status, String senha, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nomeUsuario = nomeUsuario;
        this.cargo = cargo;
        this.salario = salario;
        this.status = status;
        this.senha = senha;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}
