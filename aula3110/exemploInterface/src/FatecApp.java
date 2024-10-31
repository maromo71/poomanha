import model.*;
import utils.GerenciarAcesso;

public class FatecApp {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(1);
        aluno.setNomeAluno("Roberto");

        Diretor diretor = new Diretor();
        diretor.setId(11);
        diretor.setNomeFunc("Andre Giraldi");

        Professor professor = new Professor();
        professor.setId(12);
        professor.setNomeFunc("Fideli");

        Vigilante vigilante = new Vigilante();
        vigilante.setId(13);
        vigilante.setNomeFunc("Oliveira");
        aluno.login();
        diretor.login();
        professor.login();
        // vigilante.login(); vigilante nao pode logar
        diretor.logout();
        System.out.println("Lista dos que estao logados no momento: ");
        for (Logavel logado : GerenciarAcesso.getLogados()){
            if(logado instanceof Aluno){
                Aluno alunoLogado = (Aluno) logado;
                System.out.println("Aluno: " + alunoLogado.getNomeAluno());
            }else{
                Funcionario funcionarioLogado = (Funcionario) logado;
                System.out.println("Funcionario: " + funcionarioLogado.getNomeFunc());
            }
        }

    }
}
