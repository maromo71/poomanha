import model.*;
import utils.GerenciarEntrada;

public class ClubeApp {

    public static void main(String[] args) {
        //Criar os objetos
        Socio socio = new Socio();
        socio.setId(1);
        socio.setNomeSocio("Oscar dos Santos");

        Diretor diretor = new Diretor();
        diretor.setId(2);
        diretor.setNomeFuncionario("Pedro Barbosa");

        Eletricista eletricista = new Eletricista();
        eletricista.setId(3);
        eletricista.setNomeFuncionario("Odair José");

        Professor professor = new Professor();
        professor.setId(4);
        professor.setNomeFuncionario("Roberto Carlos");

        Servente servente = new Servente();
        servente.setId(5);
        servente.setNomeFuncionario("Sidney Magal");

        diretor.entrar();
        eletricista.entrar();
        professor.entrar();
        servente.entrar();
        socio.entrar();

        socio.sair();
        diretor.sair();

        GerenciarEntrada.listarPessoasNoClube();

    }
}
