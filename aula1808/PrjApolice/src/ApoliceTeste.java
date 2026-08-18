import java.util.Scanner;

public class ApoliceTeste {

    public static void main(String[] args) {
        //Objeto apolice do tipo Apolice (classe)
        Scanner sc = new Scanner(System.in);
        Apolice apolice = new Apolice();
        System.out.println("Digite o nome do segurado: ");
        apolice.setNomeSegurado(sc.nextLine());
        System.out.println("Digite a idade do segurado: ");
        /*
         Aqui o comentário pode estar em
         mais do que
         uma linha
         */
        apolice.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor do premio: ");
        apolice.setValorPremio(Double.parseDouble(sc.nextLine()));
        apolice.imprimir();

        double pagamento = apolice.pagarPremioBeneficiario();
    }
}
