public class App {
    public static void main(String[] args) {
        CartaoCorporativo c1 = new CartaoCorporativo("Departamento TI", 5000.0);
        CartaoCorporativo c2 = new CartaoCorporativo("Departamento RH", 3000.0);

        c1.autorizarCompra(1200.0);
        c2.autorizarCompra(3500.0);
    }
}
