import model.Funcionario;
import model.MesBonificacao;

public class Gerenciar {
    public static void main(String[] args) {
        //Criar um funcionario com mes de bonificacao 08 (agosto)
        Funcionario funcionario = new
                Funcionario(111, "Maria", MesBonificacao.ago);
        funcionario.imprimir();
    }
}
