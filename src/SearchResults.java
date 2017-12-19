import AppObj.Sale;
import AppObj.User;
import DB.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class SearchResults extends javax.swing.JFrame {
    
    User curUser = new User();
    List<Sale> sales = new ArrayList<>();
    String query;
    boolean signedin = false;
    
    public SearchResults(String query) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.query = query;
        sales = new Query().SearchQuery(query);
        setValues();
    }
    
    public SearchResults(String query, User curUser) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.curUser = curUser;
        signedin = true;
        this.query = query;
        sales = new Query().SearchQuery(query);
        setValues();
    }
    
    private void setValues() {
        JLabel[] labels = new JLabel[sales.size()];
        int i = 0, j = 50;
        
        if (new Query().checkIfQueryExists(query)) {
            for (Sale x : sales) {
                System.out.println(x.getTitle()+" "+x.getDesc());
                labels[i] = new JLabel();
                labels[i].setBounds(50, j, 80, 20);
                labels[i].setText(x.getTitle());
                jPanel1.add(labels[i]);
                
                i++;
                j = j + 10;
            }
            jPanel1.repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(2560, 1440));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1520, Short.MAX_VALUE)
                        .addComponent(back_btn))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
         this.hide();
         if (signedin) {
            new MainPage(curUser).setVisible(true);
        }
        else {
            new MainPage().setVisible(true);
        }
    }//GEN-LAST:event_back_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}