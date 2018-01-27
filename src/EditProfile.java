import AppObj.User;
import DB.EditDoc;

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
        afm_tf.setText(curUser.getAfm_ep());
        name_ep_tf.setText(curUser.getName_ep());
    }
    
    private void initnewUser() {
        newUser.setName(name_tf.getText());
        newUser.setSurname(surname_tf.getText());
        newUser.setBday(bday_tf.getText());
        newUser.setEmail(email_tf.getText());
        newUser.setPh_num(phone_tf.getText());
        newUser.setUsername(username_tf.getText());
        newUser.setPassword(newpsswrd_tf.getText());
        newUser.setIs_ep(curUser.getIs_ep());
        newUser.setAfm_ep(afm_tf.getText());
        newUser.setName_ep(name_ep_tf.getText());
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

        afm_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        afm_lbl.setLabelFor(afm_tf);
        afm_lbl.setText("ΑΦΜ:");

        name_ep_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_ep_lbl.setLabelFor(name_ep_tf);
        name_ep_lbl.setText("Όνομα Επ.:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(frame_lbl, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(psswrd_lbl)
                            .add(oldpsswrd_lbl)
                            .add(newpsswrd_lbl))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(newpsswrd_tf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .add(oldpsswrd_tf)))
                    .add(submit_btn)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(bday_lbl)
                                .add(email_lbl)
                                .add(username_lbl)
                                .add(phone_lbl))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(username_tf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .add(phone_tf)
                                    .add(email_tf)
                                    .add(bday_tf))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, cancel_btn)))
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(surname_lbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(name_lbl))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(name_tf)
                                .add(surname_tf))))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(afm_lbl)
                            .add(name_ep_lbl))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
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
                .add(psswrd_lbl)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(oldpsswrd_lbl)
                    .add(oldpsswrd_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(newpsswrd_lbl)
                    .add(newpsswrd_tf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
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
        new EditDoc().updateUser(curUser, newUser);
        this.dispose();
        new UserProfile(newUser, true).setVisible(true);
    }//GEN-LAST:event_submit_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afm_lbl;
    private javax.swing.JTextField afm_tf;
    private javax.swing.JLabel bday_lbl;
    private javax.swing.JTextField bday_tf;
    private javax.swing.JButton cancel_btn;
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