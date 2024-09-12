import model.Produto;
import model.Disponibilidade;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {
    private List<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Consultar Todos os Produtos");
            System.out.println("3. Consultar Produto por Nome");
            System.out.println("4. Alterar Disponibilidade");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciador.execCadastrar();
                    break;
                case 2:
                    gerenciador.execConsultar();
                    break;
                case 3:
                    gerenciador.execConsultarPorNome();
                    break;
                case 4:
                    gerenciador.execAlterarDisponibilidade();
                    break;
                case 9:
                    gerenciador.execSair();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    // Método para cadastrar produto
    public void execCadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Disponibilidade (1 para DISPONÍVEL, 2 para INDISPONÍVEL): ");
        int disponibilidadeOpcao = scanner.nextInt();
        Disponibilidade disponibilidade = (disponibilidadeOpcao == 1) ? Disponibilidade.DISPONIVEL : Disponibilidade.INDISPONIVEL;
        LocalDate dataCadastro = LocalDate.now();

        Produto produto = new Produto(nome, preco, disponibilidade, dataCadastro);
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Método para consultar todos os produtos
    public void execConsultar() {
        if (listaProdutos.isEmpty()) { //lista vazia
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    // Método para consultar produtos por nome
    public void execConsultarPorNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto que deseja consultar: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(produto);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para alterar a disponibilidade
    public void execAlterarDisponibilidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto para alterar a disponibilidade: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + produto);
                System.out.print("Nova disponibilidade (1 para DISPONÍVEL, 2 para INDISPONÍVEL): ");
                int novaDisponibilidade = scanner.nextInt();
                produto.setDisponibilidade(novaDisponibilidade == 1 ? Disponibilidade.DISPONIVEL : Disponibilidade.INDISPONIVEL);
                System.out.println("Disponibilidade alterada com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // Método para finalizar a aplicação
    public void execSair() {
        System.out.println("Encerrando o sistema...");
    }
}

