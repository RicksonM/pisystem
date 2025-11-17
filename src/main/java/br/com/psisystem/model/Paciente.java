package br.com.psisystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// Identificação pessoal
	private String ds_nome;
	private String dt_nascimento;
	private String tp_sexo;
	private Integer nr_idade;
	private String ds_religiao;
	private String ds_escolaridade;
	private String nr_telefone;
	private String ds_email;
	private String nr_cpf;
	private String ds_estadoCivil;
	private String tp_pagamento;

	// Se quiser manter um objeto Endereco, mantenha. 
	// Caso contrário, mude para String ds_endereco;
	private Endereco endereco;

	// Identificação dos pais
	private String ds_nomePai;
	private String ds_profissaoPai;
	private String ds_nomeMae;
	private String ds_profissaoMae;
	private String ds_enderecoPais;

	// Queixa principal
	private String ds_centroQueixa;
	private String observacoes_medicas;

	// Evolução da queixa
	private String ds_evolucao; // repentina ou gradual
	private String ds_sintomas;



	
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Paciente(String ds_nome, String dt_nascimento, String nr_telefone, String ds_email) {
		super();
		this.ds_nome = ds_nome;
		this.dt_nascimento = dt_nascimento;
		this.nr_telefone = nr_telefone;
		this.ds_email = ds_email;
	}
	
	
	
	
	
	public String getTp_sexo() {
		return tp_sexo;
	}

	public void setTp_sexo(String tp_sexo) {
		this.tp_sexo = tp_sexo;
	}

	public Integer getNr_idade() {
		return nr_idade;
	}

	public void setNr_idade(Integer nr_idade) {
		this.nr_idade = nr_idade;
	}

	public String getDs_religiao() {
		return ds_religiao;
	}

	public void setDs_religiao(String ds_religiao) {
		this.ds_religiao = ds_religiao;
	}

	public String getDs_escolaridade() {
		return ds_escolaridade;
	}

	public void setDs_escolaridade(String ds_escolaridade) {
		this.ds_escolaridade = ds_escolaridade;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public void setNr_cpf(String nr_cpf) {
		this.nr_cpf = nr_cpf;
	}

	public String getDs_estadoCivil() {
		return ds_estadoCivil;
	}

	public void setDs_estadoCivil(String ds_estadoCivil) {
		this.ds_estadoCivil = ds_estadoCivil;
	}

	public String getTp_pagamento() {
		return tp_pagamento;
	}

	public void setTp_pagamento(String tp_pagamento) {
		this.tp_pagamento = tp_pagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getDs_nomePai() {
		return ds_nomePai;
	}

	public void setDs_nomePai(String ds_nomePai) {
		this.ds_nomePai = ds_nomePai;
	}

	public String getDs_profissaoPai() {
		return ds_profissaoPai;
	}

	public void setDs_profissaoPai(String ds_profissaoPai) {
		this.ds_profissaoPai = ds_profissaoPai;
	}

	public String getDs_nomeMae() {
		return ds_nomeMae;
	}

	public void setDs_nomeMae(String ds_nomeMae) {
		this.ds_nomeMae = ds_nomeMae;
	}

	public String getDs_profissaoMae() {
		return ds_profissaoMae;
	}

	public void setDs_profissaoMae(String ds_profissaoMae) {
		this.ds_profissaoMae = ds_profissaoMae;
	}

	public String getDs_enderecoPais() {
		return ds_enderecoPais;
	}

	public void setDs_enderecoPais(String ds_enderecoPais) {
		this.ds_enderecoPais = ds_enderecoPais;
	}

	public String getDs_centroQueixa() {
		return ds_centroQueixa;
	}

	public void setDs_centroQueixa(String ds_centroQueixa) {
		this.ds_centroQueixa = ds_centroQueixa;
	}

	public String getObservacoes_medicas() {
		return observacoes_medicas;
	}

	public void setObservacoes_medicas(String observacoes_medicas) {
		this.observacoes_medicas = observacoes_medicas;
	}

	public String getDs_evolucao() {
		return ds_evolucao;
	}

	public void setDs_evolucao(String ds_evolucao) {
		this.ds_evolucao = ds_evolucao;
	}

	public String getDs_sintomas() {
		return ds_sintomas;
	}

	public void setDs_sintomas(String ds_sintomas) {
		this.ds_sintomas = ds_sintomas;
	}

	public String getDs_nome() {
		return ds_nome;
	}
	public void setDs_nome(String ds_nome) {
		this.ds_nome = ds_nome;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getNr_telefone() {
		return nr_telefone;
	}
	public void setNr_telefone(String nr_telefone) {
		this.nr_telefone = nr_telefone;
	}
	public String getDs_email() {
		return ds_email;
	}
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
	
}
