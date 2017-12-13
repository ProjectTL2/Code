import AppObj.Sale;
import AppObj.User;
import DB.Query;
import java.util.ArrayList;
import java.util.List;

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
        if (new Query().checkIfQueryExists(query)) {
            for (Sale x : sales) {
                System.out.println(x.getTitle()+" "+x.getDesc());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2560, 1440));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));

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
                .addContainerGap(1530, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(791, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}