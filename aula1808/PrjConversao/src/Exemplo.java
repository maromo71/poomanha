public class Exemplo {
    public static void main(String[] args) {
        String strValor = "200";
        int valor = 100;
        int soma = valor + Integer.parseInt(strValor);
        System.out.println("Soma é: " + soma);
        String strSalario = "3001.89";
        double novoSalario = Double.parseDouble(strSalario) * 1.10;
        System.out.println("Novo Salario: " + novoSalario);
        String strSoma = Integer.toString(soma);
        String strSoma2 = String.valueOf(soma);
    }
}
