package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaGUI2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton btnDepositar;
    private JButton btnSacar;
    private JButton btnConsultar;
    private JButton btnSair;
    private JTextArea txtMsg;
    private JPanel panel;
    private Caixa caixa;

    public JPanel getPanel() {
        return panel;
    }

    public CaixaGUI2() {
        caixa = new Caixa();
        btnDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.depositar(valor)){
                    txtMsg.append("Depositado com sucesso!\n");
                    JOptionPane.showMessageDialog(null,
                            "Depósito efetuado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Valor deve ser positivo");
                }
                txtValor.setText("");
                txtValor.requestFocus();
                return;
            }
        });
    }
}
