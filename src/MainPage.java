import AppObj.User;
import DB.Images;
import GeoLoc.Map;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javafx.embed.swing.JFXPanel;

public class MainPage extends JFrame {
    
    User curUser = new User();
    JFXPanel jfxPanel;
    
    
   

    
    public MainPage()  {
        initComponents();
        add_btn.setVisible(false);
        
        //Display Maps.
        jfxPanel = new Map().mapDisp();
        this.getContentPane().add(jfxPanel); 
        this.pack();
    }
    
    public MainPage(User curUser) {
        initComponents();
        this.curUser = curUser;
        user_btn.setText(this.curUser.getUsername());
        signin_btn.setText("Αποσύνδεση");
        signup_btn.setVisible(false);
        add_btn.setVisible(true);
        
        //Display Maps.
        jfxPanel = new Map().mapDisp();
        this.getContentPane().add(jfxPanel);
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
        filters_btn = new javax.swing.JButton();
        popular_rbtn = new javax.swing.JRadioButton();
        recent_rbtn = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(240, 240, 240));
        setSize(new java.awt.Dimension(400, 500));

        user_btn.setText("Επισκέπτης");
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

        filters_btn.setText("Φίλτρα");

        popular_rbtn.setSelected(true);
        popular_rbtn.setText("Δημοφιλής");
        popular_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popular_rbtnActionPerformed(evt);
            }
        });

        recent_rbtn.setText("Πρόσφατες");
        recent_rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recent_rbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_btn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(user_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filters_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signup_btn)
                            .addComponent(signin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(popular_rbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recent_rbtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signin_btn)
                        .addComponent(user_btn)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signup_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filters_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popular_rbtn)
                    .addComponent(recent_rbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );

        pack();
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
        if (!user_btn.getText().equals("Επισκέπτης")) {
            this.hide();
            new AddSale(curUser).setVisible(true);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void popular_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popular_rbtnActionPerformed
        recent_rbtn.setSelected(false);
    }//GEN-LAST:event_popular_rbtnActionPerformed

    private void recent_rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recent_rbtnActionPerformed
        popular_rbtn.setSelected(false);
    }//GEN-LAST:event_recent_rbtnActionPerformed

    private void search_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_tfMouseClicked
        if (search_tf.getText().equals("Αναζήτηση...")) search_tf.setText("");
    }//GEN-LAST:event_search_tfMouseClicked

    private void user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_btnActionPerformed
        if (!user_btn.getText().equals("Guest")) {
            this.hide();
            new Options(curUser).setVisible(true);
        }
    }//GEN-LAST:event_user_btnActionPerformed
    
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
    private javax.swing.JButton filters_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton popular_rbtn;
    private javax.swing.JRadioButton recent_rbtn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_tf;
    private javax.swing.JButton signin_btn;
    private javax.swing.JButton signup_btn;
    private javax.swing.JButton user_btn;
    // End of variables declaration//GEN-END:variables
}