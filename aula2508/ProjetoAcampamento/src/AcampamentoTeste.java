import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do escoteiro(a): ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do escoteiro(a): ");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        //Imprimir sem separar o grupo
        membro.imprimir();
        //Separando qual grupo o escoteiro vai pertencer
        membro.separarGrupo();
        //Imprimindo corretamente
        System.out.println(); //pula uma linha
        membro.imprimir();
    }
}
