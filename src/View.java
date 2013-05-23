
import calculator.control.AksiCalculator;
import calculator.control.Control;
import calculator.model.Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Calculator.java
 *
 * Created on Oct 28, 2011, 5:41:52 PM
 */
/**
 *
 * @author Misty
 */
public class View extends javax.swing.JFrame {

    private Model model;
    private AksiCalculator aksi;

    /** Creates new form Calculator */
    public View() {
        initComponents();
        preferences();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFBilangan1 = new javax.swing.JTextField();
        TFBilangan2 = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BKurang = new javax.swing.JButton();
        BKali = new javax.swing.JButton();
        BBagi = new javax.swing.JButton();
        TFHasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bilangan 1");

        jLabel2.setText("Bilangan 2");

        BTambah.setText("+");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BKurang.setText("-");
        BKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKurangActionPerformed(evt);
            }
        });

        BKali.setText("*");
        BKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKaliActionPerformed(evt);
            }
        });

        BBagi.setText("/");
        BBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBagiActionPerformed(evt);
            }
        });

        TFHasil.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBilangan2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BKurang)
                        .addGap(14, 14, 14)
                        .addComponent(BKali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BBagi))
                    .addComponent(TFHasil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFBilangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFBilangan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTambah)
                    .addComponent(BKurang)
                    .addComponent(BBagi)
                    .addComponent(BKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
    // TODO add your handling code here: 
    kirimBilangan();
    aksi.tambah(model);
    TFHasil.setText(String.valueOf(model.getHasil()).toString());
}//GEN-LAST:event_BTambahActionPerformed

private void BKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKurangActionPerformed
    // TODO add your handling code here:
    kirimBilangan();
    aksi.kurang(model);
    TFHasil.setText(String.valueOf(model.getHasil()).toString());
}//GEN-LAST:event_BKurangActionPerformed

private void BKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKaliActionPerformed
    // TODO add your handling code here:
    kirimBilangan();
    aksi.kali(model);
    TFHasil.setText(String.valueOf(model.getHasil()).toString());
}//GEN-LAST:event_BKaliActionPerformed

private void BBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBagiActionPerformed
    // TODO add your handling code here:
    kirimBilangan();
    aksi.bagi(model);
    TFHasil.setText(String.valueOf(model.getHasil()).toString());
}//GEN-LAST:event_BBagiActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBagi;
    private javax.swing.JButton BKali;
    private javax.swing.JButton BKurang;
    private javax.swing.JButton BTambah;
    private javax.swing.JTextField TFBilangan1;
    private javax.swing.JTextField TFBilangan2;
    private javax.swing.JTextField TFHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void kirimBilangan() {


        model.setBilangan1(Integer.parseInt(TFBilangan1.getText()));
        model.setBilangan2(Integer.parseInt(TFBilangan2.getText()));
    }

    private void preferences() {
        model = new Model();
        aksi = new Control();
    }
}