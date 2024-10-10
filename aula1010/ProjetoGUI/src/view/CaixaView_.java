package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaView_ {
    private JPanel caixaPanel;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton entradaButton;
    private JButton retiradaButton;
    private JButton consultaButton;
    private JButton sairButton;
    private JTextArea txtMsg;
    private JLabel lblValor;
    private JLabel lblSaldo;
    private Caixa caixa;

    public JPanel getCaixaPanel() {
        return caixaPanel;
    }

    public CaixaView_() {
        caixa = new Caixa();
        entradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.depositar(valor)){
                    txtMsg.append("Depositado realizado com sucesso: R$ " + valor + "\n");
                }else{
                    txtMsg.append("Valor inválido para depósito. Deve ser positivo \n");
                }
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        retiradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.sacar(valor)){
                    txtMsg.append("Saque efetuado com sucesso: R$ " + caixa.getSaldo() + "\n");
                }else{
                    txtMsg.append("Sem saldo suficiente para o saque \n");
                }
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        consultaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
                txtMsg.append("Consulta de saldo realizada com sucesso: R$ " + txtValor.getText() + "\n");
                txtValor.setText(null);
                txtSaldo.requestFocus();
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }
}
