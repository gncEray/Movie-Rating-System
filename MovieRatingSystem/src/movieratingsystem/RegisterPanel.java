package movieratingsystem;

import userAndEditor.Editor;
import userAndEditor.Member;
import userAndEditor.MemberManager;
import userAndEditor.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eray
 */
public class RegisterPanel extends javax.swing.JFrame {

    public RegisterPanel() throws IOException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfEditorCode = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 550));
        setMinimumSize(new java.awt.Dimension(420, 550));
        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(420, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter SemiBold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Editor Code:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Click here if you have an account.");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, 20));
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, 30));

        tfEditorCode.setToolTipText("Skip here if you are not editor!");
        tfEditorCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfEditorCodeMouseClicked(evt);
            }
        });
        jPanel1.add(tfEditorCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 210, 30));
        jPanel1.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, 30));

        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RegisterPanelItems/registerPanelBaackground.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        try {
            EnteranceScreen es = new EnteranceScreen();
            es.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel6MouseClicked

    private void tfEditorCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfEditorCodeMouseClicked
        // TODO add your handling code here:
        tfEditorCode.setText("");
    }//GEN-LAST:event_tfEditorCodeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (tfUsername.getText().equals("") || tfPassword.getText().equals("")) {
            if (tfUsername.getText().equals("") && tfPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Something");
            } else if (tfUsername.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Username");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter Password");
            }
        } //posssible errors while entering username and password
        else if (tfEditorCode.getText().equals("")) {
            //user
            User user = new User(tfUsername.getText(), tfPassword.getText());
            try {
                boolean added = MemberManager.createAccount(user);
                //System.out.println(added);
                if (!added) {
                    JOptionPane.showMessageDialog(rootPane, "username has already been used!");
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "Welcome " + tfUsername.getText());                                      
                    EnteranceScreen es = new EnteranceScreen();
                    es.setVisible(true);
                    setVisible(false);
                    System.out.println("done");  
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "error IOException");
                Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

             

        } else {
            //editor          
            if (tfEditorCode.getText().equals("w")) {
                Editor editor = new Editor(tfUsername.getText(), tfPassword.getText());
                try {
                    boolean added = MemberManager.createAccount(editor);
                    if (!added) {
                        JOptionPane.showMessageDialog(rootPane, "username has already been used!");
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Welcome " + tfUsername.getText());
                        EnteranceScreen es = new EnteranceScreen();
                        es.setVisible(true);
                        setVisible(false);
                        System.out.println("done");
                    }
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "error");
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "EDITOR CODE IS WRONG!");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegisterPanel().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RegisterPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfEditorCode;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
