/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frotter;

/**
 *
 * @author ANDRÉ
 */
public class Gestor_2 extends javax.swing.JFrame {

    /**
     * Creates new form Gestor_2
     */
    public Gestor_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 541));
        setSize(new java.awt.Dimension(770, 541));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(22, 23, 28));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/9025316_car_icon (2).png"))); // NOI18N
        jLabel2.setText("FROTTER");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 0, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 50);

        jPanel2.setBackground(new java.awt.Color(22, 23, 28));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("   Monitorar estado de frota");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton1);
        jButton1.setBounds(0, 120, 350, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("   Visualizar veiculos disponiveis");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton2);
        jButton2.setBounds(0, 0, 350, 40);

        jButton3.setBackground(new java.awt.Color(255, 40, 40));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("   Definir rotas");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton3);
        jButton3.setBounds(0, 40, 350, 40);

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("   Calcular rotas");
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton4);
        jButton4.setBounds(0, 80, 350, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 350, 490);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imgs/Rectangle 8 (2) (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(-1, -6, 420, 230);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(-3, 0, 430, 220);

        jLabel9.setText("SELECIONAR VEICULO");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(110, 240, 140, 10);

        jTextField6.setBackground(new java.awt.Color(190, 193, 255));
        jTextField6.setText("Kilamba");
        jPanel3.add(jTextField6);
        jTextField6.setBounds(110, 380, 190, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORIGEM");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(110, 300, 140, 10);

        jTextField3.setBackground(new java.awt.Color(190, 193, 255));
        jTextField3.setText("Viana");
        jPanel3.add(jTextField3);
        jTextField3.setBounds(110, 320, 190, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESTINO");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(110, 360, 120, 10);

        jComboBox1.setBackground(new java.awt.Color(190, 193, 255));
        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FERRARI - LD - 34 - 06 (Carro)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(110, 260, 190, 30);

        jButton5.setBackground(new java.awt.Color(255, 40, 40));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SUBMETER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5bnt_Enter(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(110, 430, 190, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(350, 50, 420, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5bnt_Enter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5bnt_Enter
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5bnt_Enter

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestor_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestor_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
