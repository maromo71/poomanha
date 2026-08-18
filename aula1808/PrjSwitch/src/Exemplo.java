import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exemplo exemplo = new Exemplo();
        int opcao = 0;
        do{
            System.out.println("Menu de Opções");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Consultar Aluno");
            System.out.println("3. Excluir Alunos");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> exemplo.execCadastrar();
                case 2 -> exemplo.execConsultar();
                case 3 -> exemplo.execExcluir();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opção invalida");
            }
        }while(opcao != 9);
    }

    public void execCadastrar(){
        System.out.println("Rotina do cadastrar");
    }

    public void execConsultar(){
        System.out.println("Rotina do consultar");
    }

    public void execExcluir(){
        System.out.println("Rotina do excluir");
    }
}
