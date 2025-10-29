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
	private String ds_nome;
	private String dt_nascimento;
	private String nr_telefone;
	private String ds_email;
	
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
