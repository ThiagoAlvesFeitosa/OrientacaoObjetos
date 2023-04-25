/*
 * Em um encontro de jovens realizado anualmente pelo grupo YoungHackers,
 * os participantes ficam em quatro salas e são divididos conforme sua idade, conforme as regras abaixo:
 * 
 * Jovens com menos de 12 anos, ficam na sala “Noobs” 
 * Jovens que têm entre 12 e 15 anos, ficam na sala “Script Kids” 
 * Jovens que têm de 16 anos para cima, ficam na sala “Capitão Crunch” 
 * 
 * 
 * Elabore uma classe que, além de ser capaz de armazenar o 
 * NOME, ANO DE NASCIMENTO, E-MAIL e NICKNAME de um participante, 
 * também seja capaz de retornar à sala para qual o jovem irá.
 * 
 * 
 * 
 * 
 * */


public class Ex02 {
	private String nome;
	private String email;
	private String nick;
	private int anoNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getSala() {
		int idade = (2023 - anoNascimento);
		if (idade <12) {
			return "Noobs";
		}else{
			if(idade<16) {
				return "Script Kids";
			}else {
				return "Capitão Crunch";
			}
		}
	}
}