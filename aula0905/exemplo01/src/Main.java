public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Chica da Silva");
        Pessoa p2 = new Pessoa(2, "Mariana Tavares");
        Pessoa p3 = new Pessoa(3, "Mariana Teveza");

        System.out.println("Hashcode de p1: " + p1.hashCode());
        System.out.println("Hashcode de p2: " + p2.hashCode());
        System.out.println("Hashcode de p3: " + p3.hashCode());

        System.out.println(p1.equals(p3));

    }
}