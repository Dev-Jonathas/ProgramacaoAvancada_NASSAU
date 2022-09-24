package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {

	private String matricula;
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String sexo;
	private String endereco;
	private String cidade;
	private String uf;
	private List <Turma> turma = new ArrayList<>();
	
	public Aluno() {
		
	}

	public Aluno(String matricula, String nome, String cpf, Date dataNascimento, String sexo, String endereco,
			String cidade, String uf) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
