
package proyecto;

/**
 *
 * @author Yanet abigail
 */
public class Leccion extends javax.swing.JFrame {

  
    /**
     * Creates new form Leccion
     */
    public Leccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSierra = new javax.swing.JButton();
        btnMaceta = new javax.swing.JButton();
        btnValle = new javax.swing.JButton();
        btnColina = new javax.swing.JButton();
        btDepresion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relievet.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 69));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Terrestre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        btnSierra.setText("Sierra");
        btnSierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSierraActionPerformed(evt);
            }
        });
        jPanel2.add(btnSierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, -1));

        btnMaceta.setText("Maceta");
        jPanel2.add(btnMaceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, -1));

        btnValle.setText("Valle");
        jPanel2.add(btnValle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));

        btnColina.setText("Colina");
        jPanel2.add(btnColina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 70, -1));

        btDepresion.setText("Depresión");
        jPanel2.add(btDepresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel3.setText("Da clic sobre el botón y observaras la caracteristica de cada una de los tipo de relieve Terrestre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        btnRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha.PNG"))); // NOI18N
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 90, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSierraActionPerformed
        //Sierra s= new Sierra(this,false);
        new Sierra().setVisible(true);
    }//GEN-LAST:event_btnSierraActionPerformed

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        //Regresa al menu Principal
        Menu m= new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepresion;
    private javax.swing.JButton btnColina;
    private javax.swing.JButton btnMaceta;
    private javax.swing.JButton btnRegresa;
    private javax.swing.JButton btnSierra;
    private javax.swing.JButton btnValle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}