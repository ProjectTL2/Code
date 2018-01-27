import AppObj.User;
import DB.EditDoc;

public class UserProfile extends javax.swing.JFrame {
    
    User user = new User();
    
    public UserProfile(User user, boolean isCurUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = user;
        
        edit_btn.setVisible(isCurUser);
        wish_btn.setVisible(isCurUser);
        sales_btn.setVisible(isCurUser);
        back_btn.setVisible(isCurUser);
        delete_acc_btn.setVisible(isCurUser);
        
        if (user.getIs_ep()) {
            username_lbl.setVisible(false);
            name_lbl.setText(user.getName_ep());
        }
        else {
            username_lbl.setText(user.getUsername());
            name_lbl.setText(user.getName() + " " + user.getSurname());
        }
        
        ph_num_lbl.setText(user.getPh_num());
        email_lbl.setText(user.getEmail());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username_lbl = new javax.swing.JLabel();
        edit_btn = new javax.swing.JButton();
        wish_btn = new javax.swing.JButton();
        sales_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ph_num_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        delete_acc_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        username_lbl.setText("Username");

        edit_btn.setText("Επεξεργασία Προφιλ");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        wish_btn.setText("Wishlist");

        sales_btn.setText("Αγγελίες Μου");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Στοιχεία:");

        ph_num_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ph_num_lbl.setText("Τηλέφωνο");

        email_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_lbl.setText("E-mail");

        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_lbl.setText("Name");

        delete_acc_btn.setText("Delete Account");
        delete_acc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_acc_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ph_num_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(username_lbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wish_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sales_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delete_acc_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(username_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit_btn)
                            .addComponent(wish_btn)
                            .addComponent(sales_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ph_num_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_acc_btn)
                    .addComponent(back_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        this.dispose();
        new EditProfile(user).setVisible(true);
    }//GEN-LAST:event_edit_btnActionPerformed

    private void delete_acc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_acc_btnActionPerformed
        this.dispose();
        new EditDoc().deleteUser(user.getUsername());
        new MainPage().setVisible(true);
    }//GEN-LAST:event_delete_acc_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        new MainPage(user).setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_acc_btn;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JLabel ph_num_lbl;
    private javax.swing.JButton sales_btn;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JButton wish_btn;
    // End of variables declaration//GEN-END:variables
}
