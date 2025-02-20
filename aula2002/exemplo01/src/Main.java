public class Main {
    //Falta ver conversao de dados
    public static void main(String[] args) {
        //Criar dois objetos do tipo aluno
        Aluno aluno1, aluno2;
        //Criar um objeto
        aluno1 = new Aluno();
        aluno1.ra = 1;
        aluno1.nome = "Igor";
        aluno1.nomeCurso = "ADS";
        //Outro objeto
        aluno2 = new Aluno();
        aluno2.ra = 2;
        aluno2.nome = "Sam";
        aluno2.nomeCurso = "ADS";
        //imprimir os dois objetos
        aluno1.imprmirDados();
        System.out.println();
        aluno2.imprmirDados();
    }
}