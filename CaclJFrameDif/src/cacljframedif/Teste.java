
package cacljframedif;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Teste extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Teste.class.getName());

    
    public Teste() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        btnSom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNum1.getText());
                int numero2 = Integer.parseInt(txtNum2.getText());
                int resultado = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da soma: " + resultado);
            }
        });
        
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNum1.getText());
                int numero2 = Integer.parseInt(txtNum2.getText());
                int resultado = numero1 - numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da subtração: " + resultado);
            }
        });
        
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNum1.getText());
                int numero2 = Integer.parseInt(txtNum2.getText());
                int resultado = numero1 * numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da multiplicação: " + resultado);
            }
        });
        
        btnRQ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNum1.getText());
                double resultado = Math.sqrt(numero1);
                exibir.setVisible(true);
                exibir.setText("Raiz quadrada de " + numero1 + ": " + resultado);
            }
        });
        
         btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(txtNum1.getText());
                int numero2 = Integer.parseInt(txtNum2.getText());
                int resultado = numero1 / numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da divisão: " + resultado);
            }
        });
         
        btnLimp.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
        txtNum1.setText("");
    }
        });

         btnLimp2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
        txtNum2.setText("");
    }
        });
        
         exibir.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnSom = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnRQ = new javax.swing.JButton();
        exibir = new javax.swing.JLabel();
        btnLimp2 = new javax.swing.JButton();
        btnLimp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setForeground(new java.awt.Color(255, 0, 0));
        lbltitulo.setText("-CALCULADORA-");

        lbl1.setText("1°Número");

        lbl2.setText("2°Número");

        txtNum1.addActionListener(this::txtNum1ActionPerformed);

        btnSom.setBackground(new java.awt.Color(204, 255, 204));
        btnSom.setText("Somar +");
        btnSom.addActionListener(this::btnSomActionPerformed);

        btnMult.setBackground(new java.awt.Color(153, 255, 255));
        btnMult.setText("Multp x");
        btnMult.addActionListener(this::btnMultActionPerformed);

        btnDiv.setBackground(new java.awt.Color(255, 204, 102));
        btnDiv.setText("Dividir /");
        btnDiv.addActionListener(this::btnDivActionPerformed);

        btnSub.setBackground(new java.awt.Color(255, 153, 153));
        btnSub.setText("Subtrair -");
        btnSub.addActionListener(this::btnSubActionPerformed);

        btnRQ.setBackground(new java.awt.Color(255, 255, 204));
        btnRQ.setText("Raiz Quad  √");

        exibir.setText("Exibir");

        btnLimp2.setText("Clear");

        btnLimp.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSom, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2)
                            .addComponent(lbl1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exibir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNum1)
                            .addComponent(txtNum2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimp2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitulo)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbltitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimp2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSom)
                    .addComponent(btnSub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMult)
                    .addComponent(btnRQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDiv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(exibir)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNum1ActionPerformed

    private void btnSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSomActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Teste().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnLimp;
    private javax.swing.JButton btnLimp2;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnRQ;
    private javax.swing.JButton btnSom;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel exibir;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
