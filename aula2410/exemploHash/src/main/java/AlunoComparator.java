import java.util.Comparator;

public class AlunoComparator implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNomeAluno().compareTo(o2.getNomeAluno()); //ordem pelo nome do aluno
    }
}
