public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;



    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo()  {
        if(idade < 6){
           equipe = '-';
           return;
        }
        if(idade <=10){
            equipe = 'A';
            return;
        }
        if(idade <=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';

    }
}
