import DB.Images;
import AppObj.Sale;
import AppObj.User;
import GeoLoc.Geocode;
import com.lynden.gmapsfx.javascript.object.LatLong;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddSale extends javax.swing.JFrame {
    
    User curUser = new User();
    
    public AddSale(User curUser) {
        initComponents();
        this.curUser = curUser;
    }
    
    public void addSale() {
        Sale newsale = new Sale(curUser, prd_name_tf.getText(), prd_title_tf.getText(),
                prd_desc_tf.getText(), Double.parseDouble(prd_price_tf.getText()),
                address_tf.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prd_name_tf = new javax.swing.JTextField();
        prd_name_lbl = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prd_name_lbl.setLabelFor(prd_name_tf);
        prd_name_lbl.setText("Όνομα Προϊόντος:");

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
                    .addComponent(prd_name_tf)
                    .addComponent(prd_title_tf)
                    .addComponent(prd_desc_tf)
                    .addComponent(prd_price_tf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prd_name_lbl)
                            .addComponent(prd_title_lbl)
                            .addComponent(prd_desc_lbl)
                            .addComponent(prd_price_lbl)
                            .addComponent(address_lbl))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(add_btn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(prd_name_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prd_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(cancel_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        this.dispose();
        new MainPage(curUser).setVisible(true);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        new Geocode().getLatLong(address_tf.getText(), prd_name_tf.getText());
        addSale();
        JOptionPane.showMessageDialog(null, "Η αγγελία σας προστέθηκε με επιτυχία.", "", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        new MainPage(curUser).setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FileChooser().OpenActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel address_lbl;
    private javax.swing.JTextField address_tf;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel prd_desc_lbl;
    private javax.swing.JTextField prd_desc_tf;
    private javax.swing.JLabel prd_name_lbl;
    private javax.swing.JTextField prd_name_tf;
    private javax.swing.JLabel prd_price_lbl;
    private javax.swing.JTextField prd_price_tf;
    private javax.swing.JLabel prd_title_lbl;
    private javax.swing.JTextField prd_title_tf;
    // End of variables declaration//GEN-END:variables
}