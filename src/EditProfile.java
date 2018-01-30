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

        frame_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frame_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame_lbl.setText("Επεξεργασία Προφίλ");
        frame_lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        name_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_lbl.setLabelFor(name_tf);
        name_lbl.setText("Όνομα:");

        surname_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surname_lbl.setLabelFor(surname_tf);
        surname_lbl.setText("Επύθετο:");

        bday_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bday_lbl.setLabelFor(bday_tf);
        bday_lbl.setText("Ημ/Γέννησης:");

        email_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_lbl.setLabelFor(email_tf);
        email_lbl.setText("E-mail:");

        phone_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone_lbl.setLabelFor(phone_tf);
        phone_lbl.setText("Τηλέφωνο:");

        username_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_lbl.setLabelFor(username_tf);
        username_lbl.setText("Username:");

        psswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        psswrd_lbl.setText("Password:");

        oldpsswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oldpsswrd_lbl.setLabelFor(oldpsswrd_tf);
        oldpsswrd_lbl.setText("Old:");

        newpsswrd_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newpsswrd_lbl.setLabelFor(newpsswrd_tf);
        newpsswrd_lbl.setText("New:");

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        oldpsswrd_tf.setEnabled(false);

        newpsswrd_tf.setEnabled(false);

        afm_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        afm_lbl.setLabelFor(afm_tf);
        afm_lbl.setText("ΑΦΜ:");

        name_ep_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_ep_lbl.setLabelFor(name_ep_tf);
        name_ep_lbl.setText("Όνομα Επ.:");

        change_pass_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pass_cbActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(frame_lbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(submit_btn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(cancel_btn))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(surname_lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(name_lbl))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(surname_tf)
                            .add(name_tf)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(bday_lbl)
                            .add(email_lbl)
                            .add(username_lbl)
                            .add(phone_lbl))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(bday_tf)
                            .add(email_tf)
                            .add(phone_tf)
                            .add(username_tf)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(afm_lbl)
                            .add(name_ep_lbl)
                            .add(oldpsswrd_lbl)
                            .add(newpsswrd_lbl)
                            .add(psswrd_lbl))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(change_pass_cb)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(oldpsswrd_tf)
                            .add(newpsswrd_tf)
                            .add(afm_tf)
                            .add(name_ep_tf))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(frame_lbl)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(name_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(name_lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(surname_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(surname_lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bday_lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bday_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(email_lbl)
                    .add(email_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(phone_lbl)
                    .add(phone_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(username_lbl)
                    .add(username_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(afm_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(afm_lbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(name_ep_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(name_ep_lbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(psswrd_lbl)
                    .add(change_pass_cb))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(oldpsswrd_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(oldpsswrd_lbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(newpsswrd_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(newpsswrd_lbl))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 137, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(submit_btn)
                    .add(cancel_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();
        new UserProfile(curUser, true).setVisible(true);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        initnewUser();
        UserError error = new UserError(newUser, curUser, oldpsswrd_tf.getText());
        Object[] jOptions = {"YES", "NO"};
        int choice = JOptionPane.showOptionDialog(null, "By Updating your profile the programm will shut itself down.\nContinue?",
                "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, jOptions, jOptions[1]);
        
        if (error.getErrormsg().equals("") && choice == 0) {
            new EditDoc().updateUser(curUser.getUsername(), newUser);
            System.exit(0);
        }
        else if(!error.getErrormsg().equals("")) {
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