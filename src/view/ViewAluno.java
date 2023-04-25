package view;

import model.Aluno;
import model.Endereco;
import model.Cidade;
import model.Estado;
import model.Pais;

import java.util.Scanner;

public class ViewAluno {
    private Aluno aluno;

    
    
    
    private void exibirMenu() {
        int opcao = -1;
        Scanner sc = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("Você deve selecionar uma operação:");
            System.out.println("1-Cadastrar/Alterar aluno");
            System.out.println("2-Exibir um aluno");
            System.out.println("3-Sair");
            System.out.println("Digite o número da opção ");
            opcao = sc.nextInt();
            filtrarOpcao(opcao);
        }
    }

    
    
    
    
    private void filtrarOpcao(int opcao) {
        switch (opcao) {
            case 1 : cadastrarAluno();
            case 2 : exibirAluno();
        }
    }
    
    
    

    private void cadastrarAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o RM: ");
        aluno.setRm(Integer.parseInt(sc.nextLine()));
        System.out.print("Informe o nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Informe o email: ");
        aluno.setEmail(sc.nextLine());
        System.out.print("Informe o nome da rua, " +
                "o número," +
                " o complemento, " +
                "o CEP, " +
                "a cidade e o estado, " +
                "teclando enter ao final de cada um : ");
        aluno.setEndereco(new Endereco(sc.nextLine(), 
                Integer.parseInt(sc.nextLine()), 
                sc.nextLine(), 
                sc.nextLine(), 
                sc.nextLine()));
        System.out.print("Informe o R.G.: ");
        aluno.setRg(sc.nextLine());
        System.out.print("Informe o C.P.F.: ");
        aluno.setCpf(sc.nextLine());

    }

    private void exibirAluno() {
        System.out.println("RM: " + aluno.getRm());
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("EMAIL: " + aluno.getEmail());
        System.out.println("ENDERECO: " + aluno.getEndereco().getLogradouro() + ", "
                + aluno.getEndereco().getNumero() + ", "
                + aluno.getEndereco().getComplemento() + ", "
                + aluno.getEndereco().getCep() + ", "
                + aluno.getEndereco().getCidade() + ", "
                + aluno.getEndereco().getEstado());
        System.out.println("R.G.: " + aluno.getRg());
        System.out.println("C.P.F.: " + aluno.getCpf());
    }
    

    
    
    public static void main(String[] args) {
        ViewAluno janela = new ViewAluno();
        janela.aluno = new Aluno();
        janela.exibirMenu();
        System.exit(0);
    }
}

