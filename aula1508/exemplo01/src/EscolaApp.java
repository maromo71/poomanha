import model.Aluno;

public class EscolaApp {
    public static void main(String[] args) {
        //definir uma variavel inteira

        int x = 10;
        //definir o aluno 2
        Aluno aluno2 = new Aluno();


        //definir uma variavel objeto
        Aluno alunoJoao = new Aluno();
        alunoJoao.ra = 123;
        alunoJoao.nome = "Joao Carlos";
        alunoJoao.email = "joao@gmail.com";
        alunoJoao.telefone = "2222-2222";

        //Apresentar o valor de x
        System.out.println("Valor de x:" + x);
        //Matricular o alunoJoao
        alunoJoao.matricular();

        aluno2.matricular();



    }


}
