/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package huvudsidaA;

/**
 *
 * @author elina
 */
public class HuvudSidaForm extends javax.swing.JFrame {

    /**
     * Creates new form HuvudSidaForm
     */
    public HuvudSidaForm() {
        initComponents();
    }
RegistreraAlien viewRegistreringAlien = new RegistreraAlien();

RegistreraUtrustning viewRegistreringUtrustning = new RegistreraUtrustning();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sokRutaTxt = new javax.swing.JTextField();
        sokbtn = new javax.swing.JButton();
        scrollPanelTxtSok = new javax.swing.JScrollPane();
        textAreaSok = new javax.swing.JTextArea();
        menubar = new javax.swing.JMenuBar();
        registreraMenu = new javax.swing.JMenu();
        alienMenu = new javax.swing.JMenuItem();
        utrustningMenu = new javax.swing.JMenuItem();
        andraInfoMenu = new javax.swing.JMenu();
        blank = new javax.swing.JMenu();
        adminMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 189, 219));

        jPanel1.setBackground(new java.awt.Color(171, 189, 219));
        jPanel1.setForeground(new java.awt.Color(171, 189, 219));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(32760, 32760));

        sokRutaTxt.setText("sök");

        sokbtn.setText("Sök");
        sokbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokbtnActionPerformed(evt);
            }
        });

        textAreaSok.setColumns(20);
        textAreaSok.setRows(5);
        textAreaSok.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scrollPanelTxtSok.setViewportView(textAreaSok);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollPanelTxtSok, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sokRutaTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sokbtn)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sokRutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sokbtn))
                .addGap(18, 18, 18)
                .addComponent(scrollPanelTxtSok, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        menubar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menubar.setMinimumSize(new java.awt.Dimension(632, 13));

        registreraMenu.setText("Registrera             ");
        registreraMenu.setMaximumSize(new java.awt.Dimension(80, 80));
        registreraMenu.setPreferredSize(new java.awt.Dimension(80, 22));

        alienMenu.setText("Alien");
        alienMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienMenuActionPerformed(evt);
            }
        });
        registreraMenu.add(alienMenu);

        utrustningMenu.setText("Utrustning");
        utrustningMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningMenuActionPerformed(evt);
            }
        });
        registreraMenu.add(utrustningMenu);

        menubar.add(registreraMenu);

        andraInfoMenu.setText("Ändra Info");
        andraInfoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraInfoMenuActionPerformed(evt);
            }
        });
        menubar.add(andraInfoMenu);

        blank.setText("                                                                                                                   ");
        menubar.add(blank);

        adminMenu.setText("Adminstratör Login");
        adminMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminMenu.setName(""); // NOI18N
        menubar.add(adminMenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienMenuActionPerformed
viewRegistreringAlien.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_alienMenuActionPerformed

    private void utrustningMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningMenuActionPerformed
        viewRegistreringUtrustning.setVisible(true);
    }//GEN-LAST:event_utrustningMenuActionPerformed

    private void sokbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sokbtnActionPerformed

    private void andraInfoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraInfoMenuActionPerformed
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_andraInfoMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HuvudSidaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuvudSidaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuvudSidaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuvudSidaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuvudSidaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenuItem alienMenu;
    private javax.swing.JMenu andraInfoMenu;
    private javax.swing.JMenu blank;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu registreraMenu;
    private javax.swing.JScrollPane scrollPanelTxtSok;
    private javax.swing.JTextField sokRutaTxt;
    private javax.swing.JButton sokbtn;
    private javax.swing.JTextArea textAreaSok;
    private javax.swing.JMenuItem utrustningMenu;
    // End of variables declaration//GEN-END:variables
}
