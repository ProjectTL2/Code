import AppObj.Sale;
import AppObj.SaleError;
import AppObj.User;
import DB.EditDoc;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substring;

public class AddSale extends javax.swing.JFrame {
    
    User curUser = new User();
    Sale newSale = new Sale();
    
    public AddSale(User curUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.curUser = curUser;
    }
    
    public void addSale() {
        this.newSale = new Sale(curUser.getUsername(), prd_title_tf.getText(), prd_desc_tf.getText(),
                prd_price_tf.getText(), address_tf.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        prd_title_tf = new javax.swing.JTextField();
        prd_title_lbl = new javax.swing.JLabel();
        prd_desc_tf = new javax.swing.JTextField();
        prd_desc_lbl = new javax.swing.JLabel();
        prd_price_tf = new javax.swing.JTextField();
        prd_price_lbl = new javax.swing.JLabel();
        address_lbl = new javax.swing.JLabel();
        address_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();

        add_btn.setText("Πρόσθεσε Αγγελία");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        cancel_btn.setText("Ακύρωση");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        prd_title_lbl.setLabelFor(prd_title_lbl);
        prd_title_lbl.setText("Τίτλος:");

        prd_desc_lbl.setLabelFor(prd_desc_tf);
        prd_desc_lbl.setText("Περιγραφή:");

        prd_price_lbl.setLabelFor(prd_price_tf);
        prd_price_lbl.setText("Τιμή:");

        address_lbl.setLabelFor(address_tf);
        address_lbl.setText("Διεύθυνση:");

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Προσθήκη εικόνας:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prd_title_tf)
                    .addComponent(prd_desc_tf)
                    .addComponent(prd_price_tf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prd_title_lbl)
                            .addComponent(prd_desc_lbl)
                            .addComponent(prd_price_lbl)
                            .addComponent(address_lbl))
                        .addGap(0, 324, Short.MAX_VALUE))
                    .addComponent(address_tf)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 176, Short.MAX_VALUE)
                                .addComponent(cancel_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(add_btn))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prd_title_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_title_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_desc_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_desc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_price_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(56, 56, 56)
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(cancel_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        addSale();
        SaleError error = new SaleError(newSale);
        if (error.getErrormsg().equals("")) {
            new EditDoc().InsertSaleInDB(newSale);
            this.dispose();
        }
        else if (error.getCount() == -1){
            JOptionPane.showMessageDialog(null, substring(error.getErrormsg(), 1),
                    "Unable to create ID.", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, substring(error.getErrormsg(), 1),
                    "Error(s) found: " + error.getCount(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Label1.setIcon(new FileChooser().OpenActionPerformed(evt)); 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel address_lbl;
    private javax.swing.JTextField address_tf;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel prd_desc_lbl;
    private javax.swing.JTextField prd_desc_tf;
    private javax.swing.JLabel prd_price_lbl;
    private javax.swing.JTextField prd_price_tf;
    private javax.swing.JLabel prd_title_lbl;
    private javax.swing.JTextField prd_title_tf;
    // End of variables declaration//GEN-END:variables
}