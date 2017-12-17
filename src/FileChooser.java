import DB.Images;
import java.awt.Image;
import javax.swing.ImageIcon;

public class FileChooser extends javax.swing.JFrame {
    public FileChooser() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ImageIcon OpenActionPerformed(java.awt.event.ActionEvent evt) {
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            this.dispose();
            new Images().UploadImg(jFileChooser1.getSelectedFile().getAbsolutePath(),jFileChooser1.getSelectedFile().getName());  
            ImageIcon icon = new Images().ShowImg(jFileChooser1.getSelectedFile().getAbsolutePath());
            return icon;
        }
        else {
            System.out.println("File access cancelled by user.");
        }
        return null;
    }
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
