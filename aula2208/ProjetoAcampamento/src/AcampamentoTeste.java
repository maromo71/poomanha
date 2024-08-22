import model.Acampamento;

import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        //criar leitor de teclado
        Scanner leitor = new Scanner(System.in);
        //criando o objeto membro
        Acampamento membro = new Acampamento();
        //definir valores de nome e idade
        System.out.println("Digite o nome do membro: ");
        membro.nome = leitor.nextLine();
        System.out.println("Digite a idade do membro: ");
        membro.idade = Integer.parseInt(leitor.nextLine());
        //executar imprimir
        membro.imprimir();
        //executar a logica do separar grupo
        membro.separarGrupo();
        //executar imprimir apos separar grupo
        membro.imprimir();
    }
}
