package br.java_project.spring_project_ddd.domain.models.dto;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;

import java.util.Date;
import java.util.List;

public class AlunoDTO {
    private int id_cliente;

    private int matricula;

    private double cpf;

    private String nome;

    private String e_mail;

    private int telefone;

    private String dt_cadastro;

    // Contructors

    public AlunoDTO() { }

    public AlunoDTO(int id_cliente, int matricula, int cpf, String nome, String e_mail, int telefone, String dt_cadastro) {
        this.id_cliente = id_cliente;
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.e_mail = e_mail;
        this.telefone = telefone;
        this.dt_cadastro = dt_cadastro;
    }

    public AlunoDTO(AlunoEntity entity) {
        this.id_cliente = entity.getId_cliente();
        this.matricula = entity.getMatricula();
        this.cpf = entity.getCpf();
        this.nome = entity.getNome();
        this.e_mail = entity.getE_mail();
        this.telefone = entity.getTelefone();
        this.dt_cadastro = entity.getDt_cadastro();
    }

    // Getters and setters

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
