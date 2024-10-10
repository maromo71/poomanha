package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaView extends JFrame implements WindowListener, ActionListener {
    private Caixa caixa;
    private Dimension dLabel, dTextField, dFrame, dTextArea, dButton;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;

    //método contrutor - construir a janela
    public CaixaView() {
        //Instanciando o objeto caixa
        caixa = new Caixa();
        //Definir a aparencia da janela
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //definição da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);//centro da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adicionar componentes na tela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this); //comportamento de acao para o botão
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225, 150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225, 185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea();
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
        //adicionar comportamento listeners
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(
                null,
                "Fechando com cuidado!"
        );
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdSair){
            System.exit(0);
        }
        if(e.getSource() == cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtMsg.append("Consulta de saldo realizada com sucesso: R$ " + txtValor.getText() + "\n");
            txtValor.setText(null);
            txtSaldo.requestFocus();
            return;
        }
        if(e.getSource() == cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.depositar(valor)){
                txtMsg.append("Depositado realizado com sucesso: R$ " + valor + "\n");
            }else{
                txtMsg.append("Valor inválido para depósito. Deve ser positivo \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus(); //coloca o foco no controle
            return;
        }
        if(e.getSource() == cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.sacar(valor)){
                txtMsg.append("Saque efetuado com sucesso: R$ " + caixa.getSaldo() + "\n");
            }else{
                txtMsg.append("Sem saldo suficiente para o saque \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
    }
}
