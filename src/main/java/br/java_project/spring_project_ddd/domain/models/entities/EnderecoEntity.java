package br.java_project.spring_project_ddd.domain.models.entities;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_endereco")
	private int id_endereco;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private AlunoEntity aluno;

	@Column(name = "rua")
	private String rua;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cep")
	private String cep;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "estado")
	private String estado;

	@Column(name = "pais")
	private String pais;

	@Column(name = "dt_inclusao")
	private Date dt_inclusao;

	@Column(name = "dt_atualizacao")
	private Date dt_atualizacao;
}
