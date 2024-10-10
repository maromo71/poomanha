import view.CaixaView;
import view.CaixaView_;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        //CaixaView tela = new CaixaView();
        //tela.setVisible(true); //mostrar a janela

        JFrame minhaNovaTela = new JFrame();
        minhaNovaTela.setTitle("Controle de Caixa");
        minhaNovaTela.setSize(350,400);
        minhaNovaTela.setLocationRelativeTo(null);
        minhaNovaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        minhaNovaTela.setContentPane(new CaixaView_().getCaixaPanel());
        minhaNovaTela.setVisible(true);
    }
}
