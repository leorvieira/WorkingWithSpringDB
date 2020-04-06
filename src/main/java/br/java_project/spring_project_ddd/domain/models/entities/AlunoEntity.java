package br.java_project.spring_project_ddd.domain.models.entities;

import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno")
	private int id_aluno;

	@Column(name = "matricula")
	private int matricula;

	@Column(name = "cpf")
	private double cpf;

	@Column(name = "nome")
	private String nome;

	@Column(name = "e_mail")
	private String e_mail;

	@Column(name = "telefone")
	private int telefone;

	@Column(name = "dt_cadastro")
	private String dt_cadastro;
	
	@OneToOne(mappedBy = "aluno", targetEntity = EnderecoEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private EnderecoEntity endereco;

	public AlunoEntity() {};

	public AlunoEntity(AlunoDTO aluno) {
		this.matricula = aluno.getMatricula();
		this.cpf = aluno.getCpf();
		this.nome = aluno.getNome();
		this.e_mail = aluno.getE_mail();
		this.telefone = aluno.getTelefone();
		this.dt_cadastro = aluno.getDt_cadastro();
	}

    public AlunoEntity(String nome, double cpf) {
		this.nome = nome;
		this.cpf = cpf;
    }

    public int getId_cliente() {
		return id_aluno;
	}

	public void setId_cliente(int id_cliente) {
		this.id_aluno = id_cliente;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(String dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
}


