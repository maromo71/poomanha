import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Acampamento membro = new Acampamento();

        System.out.println("Membros do Acampamento");
        System.out.println("Digite o Nome: ");
        membro.nome = ler.nextLine();
        System.out.println("Digite a idade do Acampante: ");
        membro.idade = ler.nextInt();
        membro.imprimir();
        System.out.println();
        membro.separarGrupo();
        membro.imprimir();
    }
}
