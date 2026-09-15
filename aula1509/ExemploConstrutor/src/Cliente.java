public class Cliente {
    //Atributos
    private int idCliente;
    private String nome;
    private String endereco;
    private String nomeUsuario;
    private String senha;

    //Construtor padrão
    public Cliente(){

    }
    //Construtor personalizado para login
    public Cliente(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    //Construtor personalizado
    public Cliente(int idCliente, String nome, String endereco, String nomeUsuario, String senha){
        this(nomeUsuario, senha);
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
    }

}
