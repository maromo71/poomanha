/**
 * @author Marcos Moraes
 * @since fev
 * @version 1.0 beta
 * Classe que contém métodos de operações matemáticas
 */
public class Main {
    /**
     * Somar dois valores inteiros passados para a função
     * @param a primeiro valor passado
     * @param b segundo valor passado
     * @return a soma dos dois valores passados
     */
    int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Main m = new Main();
        int x = m.somar(10, 20);
        System.out.println("Valor de X: " + x);
    }
}