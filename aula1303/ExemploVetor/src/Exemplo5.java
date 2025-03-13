public class Exemplo5 {
    public static void alterar(Aluno aluno){
        aluno.ra = 12;
        aluno.nome ="Chica da Silva";
        aluno.imprimir();
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.ra = 15;
        aluno.nome = "Francisca Peres";
        alterar(aluno);
        System.out.println();
        aluno.imprimir();
    }
}
