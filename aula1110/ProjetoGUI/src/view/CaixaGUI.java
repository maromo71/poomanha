package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;

public class CaixaGUI extends JFrame {
    //Atributos
    private JLabel lblValor, lblSaldo;
    private JTextField txtValor, txtSaldo;
    private JButton btnDepositar, btnSacar, btnSaldo, btnSair;
    private JTextArea txtMsg;
    private Dimension dimLabel, dimTextField, dimButton, dimTextArea, dimFrame;
    private Caixa caixa;

    //Construtor
    //Construir a janela com a aparencia esperada - e com o caixa zerado
    public CaixaGUI(){
        caixa = new Caixa();
        //Definir o tamanho de todos os elementos
        dimFrame = new Dimension(400, 400);
        dimLabel = new Dimension(40, 20);
        dimTextField = new Dimension(150,20);
        dimButton = new Dimension(95, 20);
        dimTextArea = new Dimension(300,140);
        //Definir a aparencia da janela
        this.setTitle("Controle de Caixa"); //titulo da janela
        this.setSize(dimFrame); //largura e altura da janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //x fecha a janela e o programa
        this.setResizable(false); //nao redimensionar a janela
        this.setLocationRelativeTo(null); //centralizar a janela
        this.setLayout(null);//voce ficar responsavel pela posicao dos elementos
        //Colocar os elementos na janela
        lblValor = new JLabel("Valor: ");
        lblValor.setSize(dimLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);

        lblSaldo = new JLabel("Saldo: ");
        lblSaldo.setSize(dimLabel);
        lblSaldo.setLocation(25, 80);
        this.add(lblSaldo);

        txtSaldo = new JTextField("");
        txtSaldo.setSize(dimTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);

        txtValor = new JTextField("");
        txtValor.setSize(dimTextField);
        txtValor.setLocation(75, 50);
        this.add(txtValor);

        btnDepositar = new JButton("Depositar");
        btnDepositar.setSize(dimButton);
        btnDepositar.setLocation(25, 150);
        this.add(btnDepositar);

        btnSacar = new JButton("Sacar");
        btnSacar.setSize(dimButton);
        btnSacar.setLocation(180, 150);
        this.add(btnSacar);

        btnSaldo = new JButton("Saldo");
        btnSaldo.setSize(dimButton);
        btnSaldo.setLocation(25, 185);
        this.add(btnSaldo);

        btnSair = new JButton("Sair");
        btnSair.setSize(dimButton);
        btnSair.setLocation(180, 185);
        this.add(btnSair);

        txtMsg = new JTextArea("");
        txtMsg.setSize(dimTextArea);
        txtMsg.setLocation(25,210);
        this.add(txtMsg);

    }
}
