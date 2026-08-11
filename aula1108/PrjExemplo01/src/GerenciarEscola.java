public class GerenciarEscola {
    public static void main(String[] args) {
        //Matricular dois alunos, Maria e Joao.
        Aluno aluno1 = new Aluno(); //Construir o objeto na memoria
        aluno1.setRa(111);
        aluno1.setNome("João Carlos da Silva");
        aluno1.setEmail("joao.silva@gmail.com");
        aluno1.setTurma("4. Semestre");
        //Matricular o Joao
        aluno1.matricular();
        //Matricular a Maria
        Aluno aluno2 = new Aluno();
        aluno2.setRa(222);
        aluno2.setNome("Maria Moreira");
        aluno2.setEmail("maria.moreira@oulook.com");
        aluno2.setTurma("4. Semestre");
        aluno2.matricular();
        //Maria desistir, cancelar a matricula
        aluno2.cancelarMatricula();
        System.out.println("Turma do Aluno 1: " + aluno1.getTurma());
    }
}
