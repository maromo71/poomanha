import model.Funcionario;




public class GerenciarEmpresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        //Evitar o uso do import static com * no final
        //Use o nome da classe . metodo ou constante
        //Veja os exemplos Math.PI e Math.pow()
        System.out.println("Valor do PI: " + Math.PI);
        System.out.println("Para um Raio de 10. O valor da area eh");
        double area = Math.PI * Math.pow(10, 2);
        System.out.println(area);
    }
}
