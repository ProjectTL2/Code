import AppObj.Error;
import AppObj.User;
import DB.EditDoc;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class SignUp extends javax.swing.JFrame {
    
    User curUser = new User();
    
    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
        name_ep_lbl.setVisible(false);
        name_ep_tf.setVisible(false);
        afm_ep_lbl.setVisible(false);
        afm_ep_tf.setVisible(false);
    }
    
    public void SignUserUp() {
        this.curUser = new User(usrnm_tf.getText(), psswrd_tf.getText(), name_tf.getText(),
                surname_tf.getText(), email_tf.getText(), bus_cb.isSelected(),
                afm_ep_tf.getText(), name_ep_tf.getText(), bday_tf.getText(),
                ph_num_tf.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usrnm_tf = new javax.swing.JTextField();
        signup_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        usrnm_lbl = new javax.swing.JLabel();
        psswrd_lbl = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        surname_tf = new javax.swing.JTextField();
        name_lbl = new javax.swing.JLabel();
        surname_lbl = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        email_lbl = new javax.swing.JLabel();
        bday_tf = new javax.swing.JTextField();
        bday_lbl = new javax.swing.JLabel();
        ph_num_lbl = new javax.swing.JLabel();
        bus_cb = new javax.swing.JCheckBox();
        psswrd_tf = new javax.swing.JPasswordField();
        psswrd_tf2 = new javax.swing.JPasswordField();
        ph_num_tf = new javax.swing.JTextField();
        name_ep_tf = new javax.swing.JTextField();
        afm_ep_tf = new javax.swing.JTextField();
        name_ep_lbl = new javax.swing.JLabel();
        afm_ep_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        usrnm_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        signup_btn.setText("Εγγραφή");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Ακύρωση");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        usrnm_lbl.setLabelFor(usrnm_tf);
        usrnm_lbl.setText("Username:");

        psswrd_lbl.setLabelFor(psswrd_tf);
        psswrd_lbl.setText("Password και επιβεβαίωση:");

        name_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        surname_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        name_lbl.setLabelFor(name_tf);
        name_lbl.setText("Όνομα:");

        surname_lbl.setLabelFor(surname_tf);
        surname_lbl.setText("Επόνυμο:");

        email_tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        email_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        email_lbl.setLabelFor(email_tf);
        email_lbl.setText("e-m@il:");

        bday_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bday_lbl.setLabelFor(bday_tf);
        bday_lbl.setText("Χρονιά Γέννησης:");

        ph_num_lbl.setLabelFor(ph_num_tf);
        ph_num_lbl.setText("Τηλέφωνο:");

        bus_cb.setText("Είστε Επιχείρηση;");
        bus_cb.setToolTipText("");
        bus_cb.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bus_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus_cbActionPerformed(evt);
            }
        });

        psswrd_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        psswrd_tf2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ph_num_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        name_ep_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        afm_ep_tf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        name_ep_lbl.setLabelFor(name_ep_tf);
        name_ep_lbl.setText("Όνομα Επιχείρησης:");

        afm_ep_lbl.setLabelFor(afm_ep_tf);
        afm_ep_lbl.setText("ΑΦΜ Επιχείρησης:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bday_tf)
                    .addComponent(usrnm_tf)
                    .addComponent(psswrd_tf)
                    .addComponent(psswrd_tf2)
                    .addComponent(name_tf)
                    .addComponent(surname_tf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_ep_lbl)
                            .addComponent(afm_ep_lbl)
                            .addComponent(email_lbl)
                            .addComponent(bday_lbl)
                            .addComponent(ph_num_lbl)
                            .addComponent(name_lbl)
                            .addComponent(surname_lbl)
                            .addComponent(usrnm_lbl)
                            .addComponent(psswrd_lbl)
                            .addComponent(bus_cb))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 220, Short.MAX_VALUE)
                        .addComponent(cancel_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signup_btn))
                    .addComponent(ph_num_tf)
                    .addComponent(name_ep_tf)
                    .addComponent(afm_ep_tf)
                    .addComponent(email_tf))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usrnm_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrnm_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrd_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrd_tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surname_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bday_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bday_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ph_num_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ph_num_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bus_cb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_ep_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_ep_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afm_ep_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afm_ep_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_btn)
                    .addComponent(cancel_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        SignUserUp();
        Error error = new Error(curUser, psswrd_tf2.getText());
        if (error.getErrormsg().equals("")) {
            new EditDoc().InsertUserInDB(curUser);
            this.dispose();
            new MainPage().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, substring(error.getErrormsg(), 1),
                    "Error(s) found: " + error.getCount(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_signup_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();
        new MainPage().setVisible(true);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void bus_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus_cbActionPerformed
        name_ep_tf.setVisible(!name_ep_tf.isVisible());
        name_ep_lbl.setVisible(!name_ep_lbl.isVisible());
        afm_ep_tf.setVisible(!afm_ep_tf.isVisible());
        afm_ep_lbl.setVisible(!afm_ep_lbl.isVisible());
    }//GEN-LAST:event_bus_cbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afm_ep_lbl;
    private javax.swing.JTextField afm_ep_tf;
    private javax.swing.JLabel bday_lbl;
    private javax.swing.JTextField bday_tf;
    private javax.swing.JCheckBox bus_cb;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel name_ep_lbl;
    private javax.swing.JTextField name_ep_tf;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_tf;
    private javax.swing.JLabel ph_num_lbl;
    private javax.swing.JTextField ph_num_tf;
    private javax.swing.JLabel psswrd_lbl;
    private javax.swing.JPasswordField psswrd_tf;
    private javax.swing.JPasswordField psswrd_tf2;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel surname_lbl;
    private javax.swing.JTextField surname_tf;
    private javax.swing.JLabel usrnm_lbl;
    private javax.swing.JTextField usrnm_tf;
    // End of variables declaration//GEN-END:variables
}