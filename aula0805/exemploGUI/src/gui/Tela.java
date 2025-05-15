package gui;

import bus.Caixa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener {
    private Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdDepositar, cmdSacar, cmdConsultar, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa;

    //metodo construtor
    public Tela(){
        definirTamanhos();
        definirJanela();
        definirLabels();
        definirTextFields();
        definirButtons();
        definirTextArea();
        caixa = new Caixa(); //instanciando o caixa
    }

    private void definirTextArea() {
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);
    }

    private void definirButtons() {
        cmdDepositar = new Button("Depositar");
        cmdDepositar.setSize(dButton);
        cmdDepositar.setLocation(25, 150);
        cmdDepositar.addActionListener(this);
        add(cmdDepositar);

        cmdSacar = new Button("Sacar");
        cmdSacar.setSize(dButton);
        cmdSacar.setLocation(225, 150);
        cmdSacar.addActionListener(this);
        add(cmdSacar);

        cmdConsultar = new Button("Consultar");
        cmdConsultar.setSize(dButton);
        cmdConsultar.setLocation(25, 185);
        cmdConsultar.addActionListener(this);
        add(cmdConsultar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225, 185);
        cmdSair.addActionListener(this);
        add(cmdSair);
    }

    private void definirTextFields() {
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);
    }

    private void definirLabels() {
        //definir os componentes que vao na tela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);
    }

    private void definirJanela() {
        //mudar a aparencia da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLayout(null); //sem layout - definiremos os posicionamentos e tamanhos
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //sair ao fechar
    }

    private void definirTamanhos() {
        dFrame = new Dimension(350,400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdDepositar){
            //logica do depositar aqui
            try{
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                txtMsg.append("Depositado com sucesso! Valor " + valor + "\n");
                JOptionPane.showMessageDialog(null,
                        "Sucesso, depositado.",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText("");
                txtValor.requestFocus();
                return;
            }catch (Exception erro){
                JOptionPane.showMessageDialog(null,
                        "Erro: " + erro.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        if(e.getSource() == cmdSacar){
            //logica do sacar aqui
            try{
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                txtMsg.append("Sacado com sucesso! Valor " + valor + "\n");
                JOptionPane.showMessageDialog(null,
                        "Sucesso, sacado.",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                txtValor.setText("");
                txtValor.requestFocus();
                return;
            }catch (Exception erro){
                JOptionPane.showMessageDialog(null,
                        "Erro: " + erro.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
        if(e.getSource() == cmdConsultar){
            //logica do consultar
            double saldo = caixa.getSaldo();
            txtSaldo.setText(Double.toString(saldo));
            txtMsg.append("Saldo consultado atual: " + saldo + "\n");
            JOptionPane.showMessageDialog(null,
                    "Consulta Saldo",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(e.getSource() == cmdSair){
            //logica do sair
            System.exit(0);
        }
    }
}
