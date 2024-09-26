public class Operacao {
    public int qtdDigitos(int numero){
        return Integer.toString(numero).length();
    }

    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        System.out.println("Digitos no 5690: " + operacao.qtdDigitos(5690) );
    }
}
