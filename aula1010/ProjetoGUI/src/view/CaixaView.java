package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;

public class CaixaView extends JFrame {
    private Caixa caixa;
    private Dimension dLabel, dTextField, dFrame, dTextArea, dButton;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;

    //método contrutor - construir a janela
    public CaixaView() {
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
        add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225, 150);
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225, 185);
        add(cmdSair);

        txtMsg = new TextArea();
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
    }

}
