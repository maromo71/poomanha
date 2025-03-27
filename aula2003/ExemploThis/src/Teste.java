

public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("maromo", "123");
        aluno1.imprimir();
        System.out.println();
        aluno2.imprimir();
        Aluno aluno3 = new Aluno(1,"Juquinha", "juju@gmail.com", "juquinha", "1111");
        aluno3.imprimir();
    }
}
