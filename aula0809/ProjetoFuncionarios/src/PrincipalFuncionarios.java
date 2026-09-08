import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrincipalFuncionarios gerenciar = new PrincipalFuncionarios();
        int opcao = 0;
        do{
            System.out.println("Menu de Funcionarios");
            System.out.println("1. Cadastrar funcionarios");
            System.out.println("2. Consultar funcionarios");
            System.out.println("3. Bonificar funcionarios");
            System.out.println("4. Inativar funcionario");
            System.out.println("5. Total da Folha de Pagamento");
            System.out.println("9. Sair");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadastro();
                case 2 -> gerenciar.execConsulta();
                case 3 -> gerenciar.execBonificacao();
                case 4 -> gerenciar.execInativar();
                case 5 -> gerenciar.execSomarFolha();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }

    private void execSomarFolha() {
        double totalFolha  = 0;
        for(Funcionario funcionario : funcionarios){
            if(funcionario.isNaEmpresa()){
                totalFolha += funcionario.getSalario();
            }
        }
        System.out.println("Total da Folha: " + totalFolha);
    }

    private void execInativar() {
        Funcionario funcionario = procurarFuncionario();
        if(funcionario!=null) {
            funcionario.setNaEmpresa(false);
            System.out.println("Funcionario inativado");
        }else{
            System.out.println("Funcionario nao encontrado");
        }
    }

    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(sc.nextLine());
        System.out.println("Digite o departamento: ");
        funcionario.setDepartamento(sc.nextLine());
        System.out.println("Digite o rg do funcionario: ");
        funcionario.setRg(sc.nextLine());
        System.out.println("Digite o salario: ");
        funcionario.setSalario(Double.parseDouble(sc.nextLine()));
        funcionario.setNaEmpresa(true);
        System.out.println("Cadastrado com sucesso");
        funcionarios.add(funcionario);
    }
    public void execBonificacao(){
        Funcionario funcionario = procurarFuncionario();
        if(funcionario!=null){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor da bonificacao: ");
            double valor = Double.parseDouble(sc.nextLine());
            funcionario.bonificar(valor);
            System.out.println("Bonificado com sucesso");
        }else{
            System.out.println("Funcionario nao encontrado");
        }
    }
    public void execConsulta(){
        Funcionario funcionario = procurarFuncionario();
        if(funcionario!=null){
            funcionario.imprimir();
        }else{
            System.out.println("Funcionario nao cadastrado");
        }
    }
    public Funcionario procurarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o rg do funcionario: ");
        String rgProc = sc.nextLine();
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equals(rgProc)){
                return funcionario; //devolver o funcionario
            }
        }
        return null; //caso nao encontre func com rg digitado
    }
}
