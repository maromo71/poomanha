//Questao 3a) - A classe livro criada representa um molde
//para um objeto (quando instaciar)

public class Livro {
    //1a) Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    //3d) Exemplo de encapsulamento usando o private
    private int quantidadeExamplares;
    //3.3 atributo estático
    private static String empresaComercial = "Editora Maromo";

    //3b) Sobrecarga de construtores
    public Livro(){

    }
    //Essa é a sobrecarga.
    public Livro(int codigo,  String titulo, String autor, int anoPublicacao, int quantidadeExamplares){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeExamplares = quantidadeExamplares;
    }
    //1b) um get e um set
    public int getCodigo(){
        return codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //1c)
    //Uso do atributo encapsulado quantidadeExamplares
    public boolean empretarLivro(int quantidade){
        if(quantidade <= quantidadeExamplares){
            quantidadeExamplares -= quantidade;
            return true;
        }
        return false;
    }
}
