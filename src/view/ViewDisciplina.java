package view;

import model.Disciplina;

import java.util.Scanner;

public class ViewDisciplina {
	private Disciplina disciplina;
	
	private void exibirMenu() {
        int opcao = -1;
        Scanner sc = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("Você deve selecionar uma operação:");
            System.out.println("1-Cadastrar/Alterar discplina");
            System.out.println("2-Exibir um disciplina");
            System.out.println("3-Sair");
            System.out.println("Digite o número da opção ");
            opcao = sc.nextInt();
            filtrarOpcao(opcao);
        }
    }
	
	
	private void filtrarOpcao(int opcao) {
        switch (opcao) {
            case 1 : cadastrarDisciplina();
            case 2 : exibirDisciplina();
        }
    }
	
	
	private void cadastrarDisciplina() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o Codigo de Identificação: ");
        disciplina.setId(Integer.parseInt(sc.nextLine()));
        System.out.print("Informe a carga horaria: ");
        disciplina.setCarga(Integer.parseInt(sc.nextLine()));
        System.out.print("Informe o nome: ");
        disciplina.setNome(sc.nextLine());
    }
	
	
	private void exibirDisciplina() {
        System.out.println("NOME: " + disciplina.getNome());
        System.out.println("CARGA HORARIA: " + disciplina.getCarga());
        System.out.println("CODIGO DE IDENTIFICAÇÃO: " + disciplina.getId());
    }
	
	
    
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViewDisciplina janela = new ViewDisciplina();
		janela.disciplina = new Disciplina();
		janela.exibirMenu();
		System.exit(0);
		
		
	}

}
