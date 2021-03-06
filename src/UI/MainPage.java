package UI;

import AppObj.User;
import DB.Query;
import GeoLoc.Geocode;
import javax.swing.JFrame;
import javafx.embed.swing.JFXPanel;
import javax.swing.JOptionPane;

public class MainPage extends JFrame {
    
    User curUser = new User();
    JFXPanel mapPanel;
    
    public MainPage()  {
        initComponents();
        this.setLocationRelativeTo(null);
        user_btn.setText(this.curUser.getUsername());
        add_btn.setVisible(false);
        
        //Display Maps.
        mapPanel = new Geocode().mapDisp();
        this.getContentPane().add(mapPanel); 
        this.pack();
    }
    
    public MainPage(User curUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.curUser = curUser;
        user_btn.setText(this.curUser.getUsername());
        signin_btn.setText("Αποσύνδεση");
        signup_btn.setVisible(false);
        add_btn.setVisible(true);
        
        //Display Maps.
        mapPanel = new Geocode().mapDisp();
        this.getContentPane().add(mapPanel);
        this.pack();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        user_btn = new javax.swing.JButton();
        signin_btn = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        search_tf = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(240, 240, 240));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        user_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_btnActionPerformed(evt);
            }
        });

        signin_btn.setText("Σύνδεση");
        signin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_btnActionPerformed(evt);
            }
        });

        signup_btn.setText("Εγγραφή");
        signup_btn.setMaximumSize(new java.awt.Dimension(77, 24));
        signup_btn.setMinimumSize(new java.awt.Dimension(77, 24));
        signup_btn.setPreferredSize(new java.awt.Dimension(77, 24));
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        add_btn.setText("Προσθήκη Αγγελίας");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        search_tf.setText("Αναζήτηση...");
        search_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_tfMouseClicked(evt);
            }
        });

        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        refresh_btn.setText("Refresh Map");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(signup_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(signin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(search_tf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refresh_btn)
                            .addComponent(add_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signin_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(655, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void signin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_btnActionPerformed
        if (signin_btn.getText().equals("Σύνδεση")) {
            this.hide();
            new SignIn().setVisible(true);
        }
        else {
            this.hide();
            new MainPage().setVisible(true);
        }
    }//GEN-LAST:event_signin_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        this.hide();
        new SignUp().setVisible(true);
    }//GEN-LAST:event_signup_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        if (!curUser.getUsername().equals("Guest")) {
            new AddSale(curUser).setVisible(true);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void search_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_tfMouseClicked
        if (search_tf.getText().equals("Αναζήτηση...")) search_tf.setText("");
    }//GEN-LAST:event_search_tfMouseClicked

    private void user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_btnActionPerformed
        if (!curUser.getUsername().equals("Guest")) new UserProfile(curUser, true).setVisible(true);
        else new UserProfile(curUser, false).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_user_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        if (new Query().checkIfQueryExists(search_tf.getText())) {
            if (signin_btn.getText().equals("Σύνδεση")) {
                new SearchResults(search_tf.getText()).setVisible(true);
            }
            else {
                new SearchResults(search_tf.getText(), curUser).setVisible(true);
            }
            this.dispose();
        }
        else JOptionPane.showMessageDialog(null, "No matching sale was found.", "Not Found!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_search_btnActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        this.getContentPane().remove(mapPanel);
        mapPanel = new Geocode().mapDisp();
        this.getContentPane().add(mapPanel); 
        this.pack();
    }//GEN-LAST:event_refresh_btnActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton signin_btn;
    private javax.swing.JButton signup_btn;
    private javax.swing.JButton user_btn;
    // End of variables declaration//GEN-END:variables
}