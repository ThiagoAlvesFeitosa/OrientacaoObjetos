package model;


public class Aluno {
	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	private String cpf;
	private String rg;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void status() {
		System.out.println("Status atualizado");
		
	}
	
	public int getRm() {
		return rm;
	}
	public Aluno setRm(int rm) {
		this.rm = rm;
		return this;
	}
	
	public String getNome() {
		return nome;
	}
	public Aluno setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	public Aluno setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public Endereco getEndereco() {
	    return endereco;
	}

	public Aluno setEndereco(Endereco endereco) {
	    this.endereco = endereco;
	    return this;
	}
	
	public String getCpf() {
		return cpf;
	}
	public Aluno setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
	
	public String getRg() {
		return rg;
	}
	public Aluno setRg(String rg) {
		this.rg = rg;
		return this;
	}
}




