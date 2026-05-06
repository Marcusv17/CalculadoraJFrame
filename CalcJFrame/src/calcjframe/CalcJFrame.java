package calcjframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class CalcJFrame extends JFrame {

    JLabel rotulo1, rotulo2, exibir, titulo;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, raiz, dividir;

    public CalcJFrame() {
        super("Calculadora Básica");
        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("-CALCULADORA-");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(120, 10, 200, 30);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar +");
        subtrair = new JButton("Subtrair -");
        multiplicar = new JButton("Multip x");
        raiz = new JButton("Raiz Quad √");
        dividir = new JButton("Dividir /");

        titulo.setBounds(130, 10, 300, 30);

        rotulo1.setBounds(50, 60, 100, 20);
        texto1.setBounds(150, 60, 180, 20);

        rotulo2.setBounds(50, 90, 100, 20);
        texto2.setBounds(150, 90, 180, 20);

        somar.setBounds(50, 130, 100, 25);
        subtrair.setBounds(230, 130, 100, 25);
        multiplicar.setBounds(50, 170, 100, 25);
        raiz.setBounds(225, 170, 105, 25);
        dividir.setBounds(50, 210, 100, 25);

        exibir.setBounds(50, 250, 300, 20);

        somar.setForeground(Color.BLACK);
        subtrair.setForeground(Color.BLACK);
        multiplicar.setForeground(Color.BLACK);
        raiz.setForeground(Color.BLACK);
        dividir.setForeground(Color.BLACK);

        somar.setBackground(new Color(144, 238, 144));
        somar.setOpaque(true);
        somar.setBorderPainted(false);

        subtrair.setBackground(new Color(255, 160, 160)); 
        subtrair.setOpaque(true);
        subtrair.setBorderPainted(false);

        multiplicar.setBackground(new Color(173, 216, 230));
        multiplicar.setOpaque(true);
        multiplicar.setBorderPainted(false);

        raiz.setBackground(new Color(255, 255, 153)); 
        raiz.setOpaque(true);
        raiz.setBorderPainted(false);

        dividir.setBackground(new Color(255, 200, 120));
        dividir.setOpaque(true);
        dividir.setBorderPainted(false);

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da soma: " + resultado);
            }
        });

        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 - numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da subtração: " + resultado);
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 * numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da multiplicação: " + resultado);
            }
        });

        raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                double resultado = Math.sqrt(numero1);
                exibir.setVisible(true);
                exibir.setText("Raiz quadrada de " + numero1 + ": " + resultado);
            }
        });

        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 / numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da divisão: " + resultado);
            }
        });

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(raiz);
        tela.add(dividir);
        tela.add(exibir);
        tela.add(titulo);

        setSize(420, 480);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
