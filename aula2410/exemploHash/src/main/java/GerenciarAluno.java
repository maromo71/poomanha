import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GerenciarAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(33, "Tereza", "ADS");
        Aluno aluno2 = new Aluno(11, "Maria", "ADS");
        Aluno aluno3 = new Aluno(22, "Ana", "Mec");

        //comparar o hash do aluno1, aluno2 e aluno3
        System.out.println("Hash do aluno1: " + aluno1.hashCode());
        System.out.println("Hash do aluno2: " + aluno2.hashCode());
        System.out.println("Hash do aluno3: " + aluno3.hashCode());

        //comparação - objetos sao iguais
        System.out.println(aluno2.equals(aluno3));

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a matricula procurada: ");
        int mat = Integer.parseInt(sc.nextLine());

        Aluno alunoProc = new Aluno();
        alunoProc.setMatricula(mat);

        if(listaAlunos.contains(alunoProc)){
            int indice = listaAlunos.indexOf(alunoProc);
            alunoProc = listaAlunos.get(indice);
            listaAlunos.remove(alunoProc);
            System.out.println("Aluno removido da lista");
        }
        listaAlunos.sort(new AlunoComparator()); //ordena em ordem alfabetica
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getMatricula());
            System.out.println(aluno.getNomeAluno());
            System.out.println();
        }
    }
}
