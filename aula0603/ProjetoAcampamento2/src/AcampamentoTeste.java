import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do membro: ");
        membro.setNome(input.nextLine());
        System.out.println("Digite a idade do membro: ");
        membro.setIdade(Integer.parseInt(input.nextLine()));
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();

    }
}