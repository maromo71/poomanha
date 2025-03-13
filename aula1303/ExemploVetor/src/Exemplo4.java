public class Exemplo4 {
    public void alterar(int valor) {
        valor++;
        System.out.println(valor);
    }

    public static void main(String[] args) {
        int valor = 30;
        Exemplo4 exemplo = new Exemplo4();
        exemplo.alterar(valor);
        System.out.println(valor);
    }
}
