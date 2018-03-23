package UI;

import AppObj.User;
import AppObj.UserError;
import DB.EditDoc;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class EditProfile extends javax.swing.JFrame {
    
    User curUser = new User();
    User newUser = new User();
    
    public EditProfile(User curUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.curUser = curUser;
        
        name_ep_lbl.setVisible(curUser.getIs_ep());
        name_ep_tf.setVisible(curUser.getIs_ep());
        afm_lbl.setVisible(curUser.getIs_ep());
        afm_tf.setVisible(curUser.getIs_ep());
        
        initValues();
    }
    
    private void initValues() {
        name_tf.setText(curUser.getName());
        surname_tf.setText(curUser.getSurname());
        bday_tf.setText(curUser.getBday());
        email_tf.setText(curUser.getEmail());
        phone_tf.setText(curUser.getPh_num());
        username_tf.setText(curUser.getUsername());
        
        if (curUser.getIs_ep()) {
            afm_tf.setText(curUser.getAfm_ep());
            name_ep_tf.setText(curUser.getName_ep());
        }
    }
    
    private void initnewUser() {
        newUser.setName(name_tf.getText());
        newUser.setSurname(surname_tf.getText());
        newUser.setBday(bday_tf.getText());
        newUser.setEmail(email_tf.getText());
        newUser.setPh_num(phone_tf.getText());
        newUser.setUsername(username_tf.getText());
        
        if (change_pass_cb.isSelected()) newUser.setPassword(newpsswrd_tf.getText());
        else newUser.setPassword(curUser.getPassword());
        
        newUser.setIs_ep(curUser.getIs_ep());
        if (curUser.getIs_ep()) {
            newUser.setAfm_ep(afm_tf.getText());
            newUser.setName_ep(name_ep_tf.getText());
        } else {
            newUser.setAfm_ep(curUser.getAfm_ep());
            newUser.setName_ep(curUser.getName_ep());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        surname_lbl = new javax.swing.JLabel();
        bday_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        phone_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        psswrd_lbl = new javax.swing.JLabel();
        oldpsswrd_lbl = new javax.swing.JLabel();
        newpsswrd_lbl = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        name_tf = new javax.swing.JTextField();
        surname_tf = new javax.swing.JTextField();
        bday_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        phone_tf = new javax.swing.JTextField();
        username_tf = new javax.swing.JTextField();
        oldpsswrd_tf = new javax.swing.JTextField();
        newpsswrd_tf = new javax.swing.JTextField();
        afm_lbl = new javax.swing.JLabel();
        afm_tf = new javax.swing.JTextField();
        name_ep_lbl = new javax.swing.JLabel();
        name_ep_tf = new javax.swing.JTextField();
        change_pass_cb = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frame_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frame_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame_lbl.setText("Επεξεργασία Προφίλ");
        frame_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(frame_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 480, -1));

        name_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_lbl.setLabelFor(name_tf);
        name_lbl.setText("Όνομα:");
        getContentPane().add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, -1, 20));

        surname_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surname_lbl.setLabelFor(surname_tf);
        surname_lbl.setText("Επύθετο:");
        getContentPane().add(surname_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, 20));

        bday_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bday_lbl.setLabelFor(bday_tf);
        bday_lbl.setText("Ημ/Γέννησης:");
        getContentPane().add(bday_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, 24));

        email_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_lbl.setLabelFor(email_tf);
        email_lbl.setText("E-mail:");
        getContentPane().add(email_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        phone_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone_lbl.setLabelFor(phone_tf);
        phone_lbl.setText("Τηλέφωνο:");
        getContentPane().add(phone_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        username_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_lbl.setLabelFor(username_tf);
        username_lbl.setText("Username:");
        getContentPane().add(username_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 177, -1, -1));

        psswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        psswrd_lbl.setText("Password:");
        getContentPane().add(psswrd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, -1, -1));

        oldpsswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oldpsswrd_lbl.setLabelFor(oldpsswrd_tf);
        oldpsswrd_lbl.setText("Old:");
        getContentPane().add(oldpsswrd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, -1, -1));

        newpsswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newpsswrd_lbl.setLabelFor(newpsswrd_tf);
        newpsswrd_lbl.setText("New:");
        getContentPane().add(newpsswrd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 309, -1, -1));

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 466, -1, -1));

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 466, -1, -1));
        getContentPane().add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 41, 418, -1));
        getContentPane().add(surname_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 69, 418, -1));
        getContentPane().add(bday_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 99, 390, -1));
        getContentPane().add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 125, 390, -1));
        getContentPane().add(phone_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 151, 390, -1));
        getContentPane().add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 177, 390, -1));

        oldpsswrd_tf.setEnabled(false);
        getContentPane().add(oldpsswrd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 283, 390, -1));

        newpsswrd_tf.setEnabled(false);
        getContentPane().add(newpsswrd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 309, 390, -1));

        afm_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        afm_lbl.setLabelFor(afm_tf);
        afm_lbl.setText("ΑΦΜ:");
        getContentPane().add(afm_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));
        getContentPane().add(afm_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 203, 390, -1));

        name_ep_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_ep_lbl.setLabelFor(name_ep_tf);
        name_ep_lbl.setText("Όνομα Επ.:");
        getContentPane().add(name_ep_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 229, -1, -1));
        getContentPane().add(name_ep_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 229, 390, -1));

        change_pass_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pass_cbActionPerformed(evt);
            }
        });
        getContentPane().add(change_pass_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 255, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();
        new UserProfile(curUser, true).setVisible(true);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        initnewUser();
        UserError error = new UserError(newUser, curUser, oldpsswrd_tf.getText());
        
        if (error.getErrormsg().equals("")) {
            new EditDoc().updateUser(curUser.getUsername(), newUser);
            new MainPage(newUser).setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, substring(error.getErrormsg(), 1),
                    "Error(s) found: " + error.getCount(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void change_pass_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pass_cbActionPerformed
        oldpsswrd_tf.setEnabled(!oldpsswrd_tf.isEnabled());
        newpsswrd_tf.setEnabled(!newpsswrd_tf.isEnabled());
        oldpsswrd_tf.setText("");
        newpsswrd_tf.setText("");
    }//GEN-LAST:event_change_pass_cbActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afm_lbl;
    private javax.swing.JTextField afm_tf;
    private javax.swing.JLabel bday_lbl;
    private javax.swing.JTextField bday_tf;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JCheckBox change_pass_cb;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel frame_lbl;
    private javax.swing.JLabel name_ep_lbl;
    private javax.swing.JTextField name_ep_tf;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_tf;
    private javax.swing.JLabel newpsswrd_lbl;
    private javax.swing.JTextField newpsswrd_tf;
    private javax.swing.JLabel oldpsswrd_lbl;
    private javax.swing.JTextField oldpsswrd_tf;
    private javax.swing.JLabel phone_lbl;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JLabel psswrd_lbl;
    private javax.swing.JButton submit_btn;
    private javax.swing.JLabel surname_lbl;
    private javax.swing.JTextField surname_tf;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}