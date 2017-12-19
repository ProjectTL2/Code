import AppObj.Sale;
import AppObj.User;
import DB.Query;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
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
        JLabel[] titles = new JLabel[sales.size()];
        JLabel[] descs = new JLabel[sales.size()];
        
        int i = 0, j = 25;
        
        for (Sale x : sales) {
            titles[i] = new JLabel();
            titles[i].setBounds(100, j, 80, 20);
            titles[i].setText(x.getTitle());
            results_p.add(titles[i]);
            
            descs[i] = new JLabel();
            descs[i].setBounds(150, j, 80, 20);
            descs[i].setText(x.getDesc());
            results_p.add(descs[i]);
            
            JButton b = new JButton();
            b.setText("+");
            b.setBounds(50, j, 40, 20);
            b.addActionListener((ActionEvent evt) -> {
                new SaleItem(x).setVisible(true);
            });
            results_p.add(b);
            
            i++;
            j = j + 25;
        }
        results_p.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        results_p = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        javax.swing.GroupLayout results_pLayout = new javax.swing.GroupLayout(results_p);
        results_p.setLayout(results_pLayout);
        results_pLayout.setHorizontalGroup(
            results_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        results_pLayout.setVerticalGroup(
            results_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1530, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addContainerGap())
            .addComponent(results_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(results_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_btn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
         this.dispose();
         if (signedin) {
            new MainPage(curUser).setVisible(true);
        }
        else {
            new MainPage().setVisible(true);
        }
    }//GEN-LAST:event_back_btnActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JPanel results_p;
    // End of variables declaration//GEN-END:variables
}