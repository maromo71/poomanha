public class Aluno {
    //1. Definir atributos
    public int ra;
    public String nome;
    public String nomeCurso;
    public String nomeFaculdade = "Fatec Mogi Mirim";

    //2. Definir um método
    public void imprmirDados(){
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("nomeCurso = " + nomeCurso);
    }
}
