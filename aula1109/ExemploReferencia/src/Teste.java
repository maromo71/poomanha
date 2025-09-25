public class Teste {
    public static void main(String[] args) {
        Aluno[] alunos = new  Aluno[3];
        alunos[0] = new Aluno();
        alunos[0].setMatricula(1);
        alunos[0].setNome("Fulano");
        alunos[0].setCurso("ADS");
        System.out.println(alunos[0]);
        //Linha abaixo gera um erro NullPointerException
        //Nao é possivel acessar um nome de um objeto
        //que ainda nao existe
        System.out.println(alunos[1].getMatricula());
    }
}
