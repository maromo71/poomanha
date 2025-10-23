
import view.CaixaGUI;
import view.CaixaGUI2;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //CaixaGUI tela = new CaixaGUI();
       // tela.setVisible(true);
       JFrame frame = new JFrame("Conta Corrente");
       frame.setContentPane(new CaixaGUI2().getPanel());
       frame.setSize(350,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
}
