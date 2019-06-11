package com.xseed.model;

public class Funcionario {

	
	public String matricula ="";
	public String nome = "";
	public double salario;
	
	public Funcionario() {}
	
	public Funcionario(String string, String string2, double string3) {
		this.matricula = string;
		this.nome = string2;
		this.salario = string3;
		
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
