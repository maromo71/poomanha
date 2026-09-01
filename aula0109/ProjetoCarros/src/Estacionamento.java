import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {
    private List<Pessoa> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Estacionamento gerenciar = new Estacionamento();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("Estacionamento Ze Ruela Mogi Mirim");
            System.out.println("Gerenciar Clientes e Veículos");
            System.out.println("1) Cadastro de Pessoa");
            System.out.println("2) Cadastro de Carros");
            System.out.println("3) Listar Clientes e seus carros");
            System.out.println("4) Total de Veiculos por Cliente");
            System.out.println("5) Total de Veiculos Geral");
            System.out.println("6) Total de Clientes no momento");
            System.out.println("9) SAIR");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> gerenciar.execCadPessoa();
                case 2 -> gerenciar.execCadCarro();
                case 3 -> gerenciar.execListarClientes();
                case 4 -> gerenciar.execTotalVeiculosClientes();
                case 5 -> gerenciar.execTotalVeiculosGeral();
                case 6 -> gerenciar.execTotalClientes();
                case 9 -> System.out.println("Fim do programa");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }

    private void execTotalClientes() {
        System.out.println("Total de clientes da loja: " + clientes.size());
    }

    private void execTotalVeiculosGeral() {
        int total = 0;
        for(Pessoa pessoa : clientes){
           total += pessoa.getCarros().size();
        }
        System.out.println("Total de carros cadastrados para os clientes: " + total);
    }

    private void execTotalVeiculosClientes() {
        for(Pessoa pessoa : clientes){
            System.out.println("Cliente: " + pessoa.getNome() +
                    " tem " + pessoa.getCarros().size() + " carros.");
        }
    }

    private void execListarClientes() {
        for(Pessoa pessoa : clientes){
            pessoa.imprimir();
        }
    }

    private void execCadCarro() {
        Scanner sc = new Scanner(System.in);
        //Listar os clientes cadastrados
        System.out.println("===================================================");
        System.out.println("Pos | Nome completo ");
        int i = 1;
        for(Pessoa  pessoa : clientes){
            System.out.printf("%5d | %50s\n", i , pessoa.getNome());
            i++;
        }
        System.out.println("===================================================");
        System.out.println("Digite o numero da pessoa: ");
        int pos = Integer.parseInt(sc.nextLine());
        pos--;
        System.out.println("Cadastrando o carro do " + clientes.get(pos).getNome());
        Carro carro = new Carro();
        System.out.println("Digite o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Digite a placa do carro: ");
        carro.setPlaca(sc.nextLine());
        System.out.println("Digite o valor do carro: ");
        carro.setValor(Double.parseDouble(sc.nextLine()));
        carro.setDataCadastro(LocalDate.now());
        clientes.get(pos).adicionarCarro(carro);
        System.out.println("Carro cadastrado para o cliente: " + clientes.get(pos).getNome());
        System.out.println("Modelo do carro cadastrado: " + carro.getModelo());
    }

    private void execCadPessoa() {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(); //Objeto pessoa
        System.out.println("Digite o nome do cliente: ");
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite o telefone do cliente: ");
        pessoa.setTelefone(sc.nextLine());
        System.out.println("Digite o endereco do cliente: ");
        pessoa.setEndereco(sc.nextLine());
        System.out.println("Digite dia de nascimento: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o mes de nascimento: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o ano de nascimento: ");
        int ano = Integer.parseInt(sc.nextLine());
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        pessoa.setDataNascimento(dataNascimento);
        clientes.add(pessoa); //Adicionar essa pessoa na lista de clientes
        System.out.println("Cliente cadastrado com sucesso");
    }
}
