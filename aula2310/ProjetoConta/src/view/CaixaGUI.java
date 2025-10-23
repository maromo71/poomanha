package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaGUI extends JFrame implements ActionListener {
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button btnDepositar, btnSacar, btnConsultar, btnSair;
    private TextArea txtMsg;
    private Dimension dButton, dTextField, dLabel, dTextArea, dFrame;
    //precisamo adicionar o Caixa
    private Caixa caixa;

    public CaixaGUI(){
        caixa = new Caixa();
        adicionarComponentes();
        definirAparencia();
        adicionarComportamentos();
    }

    private void adicionarComportamentos() {
        btnSair.addActionListener(this);
        btnDepositar.addActionListener(this);
        btnConsultar.addActionListener(this);
        btnSacar.addActionListener(this);
    }

    private void definirAparencia() {
        dLabel = new Dimension(40,20);
        dFrame = new Dimension(350,400);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setResizable(false); //nao redimensionar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); //Controlar o local dos componentes
        this.setLocationRelativeTo(null); //Centraliza a janela

        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        btnDepositar.setSize(dButton);
        btnSacar.setSize(dButton);
        btnConsultar.setSize(dButton);
        btnSair.setSize(dButton);
        btnDepositar.setLocation(25,150);
        btnSacar.setLocation(225,150);
        btnConsultar.setLocation(25,185);
        btnSair.setLocation(225,185);

        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);

    }

    private void adicionarComponentes() {
        lblValor = new Label("Valor:");
        add(lblValor);
        lblSaldo = new Label("Saldo:");
        add(lblSaldo);
        txtValor = new TextField();
        add(txtValor);
        txtSaldo = new TextField();
        add(txtSaldo);
        btnDepositar = new Button("Depositar");
        add(btnDepositar);
        btnSacar = new Button("Sacar");
        add(btnSacar);
        btnConsultar = new Button("Consultar");
        add(btnConsultar);
        btnSair = new Button("Sair");
        add(btnSair);
        txtMsg = new TextArea();
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSair){
            System.exit(0); //Fecha o programa
        }
        if(e.getSource() == btnConsultar){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            JOptionPane.showMessageDialog(
                    null,
                    "Saldo Atual: " + txtSaldo.getText(),
                    "Saldo consultado",
                    JOptionPane.INFORMATION_MESSAGE
            );
            txtMsg.append("Saldo atual: " + txtSaldo.getText() + "\n");
        }
        if(e.getSource()==btnDepositar){
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
        if(e.getSource()==btnSacar){
            double valor = Double.parseDouble(txtValor.getText());
            if(caixa.sacar(valor)){
                txtMsg.append("Sacado com sucesso!\n");
                JOptionPane.showMessageDialog(null,
                        "Sacado com sucesso!\n",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,
                        "Sem saldo suficiente para o saque",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            txtValor.setText("");
            txtValor.requestFocus();
        }
    }
}
