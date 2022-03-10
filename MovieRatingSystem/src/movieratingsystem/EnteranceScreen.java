
package movieratingsystem;

import userAndEditor.Editor;
import userAndEditor.Member;
import userAndEditor.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EnteranceScreen extends javax.swing.JFrame {

    
    public EnteranceScreen() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        editorSignIn = new javax.swing.JButton();
        editorPassword = new javax.swing.JPasswordField();
        userSignIn = new javax.swing.JButton();
        userPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editorname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CINELAND");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editorSignIn.setText("Sign in");
        editorSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorSignInActionPerformed(evt);
            }
        });
        getContentPane().add(editorSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        getContentPane().add(editorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, -1));

        userSignIn.setText("Sign in");
        userSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSignInActionPerformed(evt);
            }
        });
        getContentPane().add(userSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 170, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 110, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 170, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));

        editorname.setSelectedTextColor(new java.awt.Color(204, 255, 0));
        getContentPane().add(editorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, -1));

        jLabel4.setBackground(new java.awt.Color(0, 255, 204));
        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 110, 30));

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 80, 45));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, 45));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Inter SemiBold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CINELAND");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, 69));

        jLabel9.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Create an account.");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditorPanelItems/Genesis-Add-on-for-XBMC-and-Kodi-background_1.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabel8.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel8.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void userSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSignInActionPerformed
        // user panel
        boolean flag = false;
        boolean flagForEmpty = false;
        
        if (username.getText().equals("") || userPassword.getText().equals("")) {
            flagForEmpty = true;
            if (username.getText().equals("") && userPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Something");
            } else if (username.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Username");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter Password");
            }
        }
        else {
        
            try {
                User user = null;
            File file = new File("UserList.bin");
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                ArrayList<User> users = (ArrayList) reader.readObject();
                
                for(int i=0; i<users.size(); i++) {
                    if(username.getText().equals(users.get(i).getName()) && userPassword.getText().equals(users.get(i).getPassword())) {
                        flag = true;
                        user = users.get(i);
                    }
                }
            }
            else {
                System.out.println("There is no user registered yet");
            }
            
           if(!flagForEmpty) {
               if(flag) {
                    UserPanel up = new UserPanel(user);
                    up.setVisible(true);
                
                    this.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "WRONG PASSWORD OR USERNAME");
                }
           }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        }
        
        
        
        
        
    }//GEN-LAST:event_userSignInActionPerformed

    private void editorSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorSignInActionPerformed
        
        boolean flag = false;
        boolean flagForEmpty = false;
        
        if (editorname.getText().equals("") || editorPassword.getText().equals("")) {
            flagForEmpty = true;
            if (editorname.getText().equals("") && editorPassword.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Something");
            } else if (editorname.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter Username");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter Password");
            }
        }
        else {
        
            try {
            File file = new File("EditorList.bin");
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                ArrayList<Editor> editors = (ArrayList) reader.readObject();
                
                for(int i=0; i<editors.size(); i++) {
                    if(editorname.getText().equals(editors.get(i).getName()) && editorPassword.getText().equals(editors.get(i).getPassword())) {
                        flag = true;
                    }
                }
       
            }
            else {
                System.out.println("There is no user registered yet");
            }
            
          
            if(!flagForEmpty) {
                if(flag) {
                    EditorPanel ep = new EditorPanel();
                    ep.setVisible(true);
        
                    this.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(rootPane, "WRONG PASSWORD OR USERNAME");
                }
            }
            
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        }
        
        
        
        
        
        
    }//GEN-LAST:event_editorSignInActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        RegisterPanel rp;
        try {
            rp = new RegisterPanel();
            rp.setVisible(true);
            setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(EnteranceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnteranceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnteranceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnteranceScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EnteranceScreen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EnteranceScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField editorPassword;
    private javax.swing.JButton editorSignIn;
    private javax.swing.JTextField editorname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JButton userSignIn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
