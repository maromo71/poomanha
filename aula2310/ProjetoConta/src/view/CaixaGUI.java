package view;

import javax.swing.*;
import java.awt.*;

public class CaixaGUI extends JFrame {
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button btnDepositar, btnSacar, btnConsultar, btnSair;
    private TextArea txtMsg;
    private Dimension dButton, dTextField, dLabel, dTextArea, dFrame;

    public CaixaGUI(){
        adicionarComponentes();
        definirAparencia();
        adicionarComportamentos();
    }

    private void adicionarComportamentos() {

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

}
