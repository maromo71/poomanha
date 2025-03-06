public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Equipe: " + equipe);
    }

    public void separarGrupo(){
        if(idade<6) {
            equipe = '-';
            return;
        }
        if(idade<=10){
            equipe = 'A';
            return;
        }
        if(idade<=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }
}
