/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package huvudsidaA;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author elina
 */
public class AndraInfo extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form AndraInfo
     */
    public AndraInfo() {
        initComponents();
         try{
            idb =  new InfDB("mibdb", "3306", "mibdba", "mibkey" ); 
            

        }
      catch(InfException e){
           JOptionPane.showMessageDialog(null, "Något gick fel");
           System.out.println("Internet felmeddelande"+ e.getMessage());
      }

      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        andraTxt = new javax.swing.JTextField();
        confirmbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namnTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        andraInfoCombo = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ändra Info");

        confirmbtn.setText("Bekräfta");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Välj vad du vill ändra");

        jLabel4.setText("Skriv in det du vill ändra till");

        namnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Namn på Alien");

        andraInfoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                andraInfoComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(andraTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namnTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(andraInfoCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andraInfoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmbtn)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
String namn = namnTxt.getText();
  
   String alienNamnfraga = "SELECT * from ALIEN where NAMN like '" + namn + "'";
   String nyttDatumfraga = "UPDATE ALIEN SET REGISTRERINGSDATUM = '"+ andraTxt + "'" +" where NAMN like '" + namn + "'";
   String nyttLosenfraga = "UPDATE ALIEN SET LOSENORD = '"+ andraTxt + "'" +" where NAMN like '" + namn + "'";
   String nyttNamnfraga = "UPDATE ALIEN SET NAMN = '"+ andraTxt + "'" +" where NAMN like '" + namn + "'";
   String nyttTelefonfraga = "UPDATE ALIEN SET TELEFON = '"+ andraTxt + "'" +" where NAMN like '" + namn + "'";
   String nyttPlatsfraga =  "UPDATE  alien,plats SET Plats = Plats_ID where Alien.Namn like '" + namn + "'"+ " and plats.Benamning like '"+ andraTxt +"'";//
   String nyttAgentfraga =  "UPDATE  alien,agent SET Ansvarig_Agent = Agent_ID where Alien.Namn like '" + namn + "'"+ " and Agent.Namn like '"+ andraTxt +"'";
  // String nyttRasfraga = "UPDATE ALIEN SET ALIENID = '"+ andraTxt + "'" +" where NAMN like '" + namn + "'";//

        try {
            String hamtadeAllt = idb.fetchSingle(alienNamnfraga);

            if (namn.equals(hamtadeAllt))//dubellkolla denna varför dem fungerar om den är !
            {
                //   if (andraInfoCombobox.getModel().setSelectedItem())

            } else {
                System.out.println("Felaktigt namn");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internet felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void namnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnTxtActionPerformed

    private void andraInfoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_andraInfoComboItemStateChanged
     
      String rasitem = "Ras" ;
     String regitem = "Registreringsdatum" ;
     String namnitem = "namn" ;
     String telitem = "telefonnummer" ;
     String platsitem = "plats" ;
     String ansvaritem = "Ansvarig agent" ;
    
andraInfoCombo.add(rasitem);
andraInfoCombo.add(regitem);
andraInfoCombo.add(namnitem);
andraInfoCombo.add(telitem);
andraInfoCombo.add(platsitem);
andraInfoCombo.add(ansvaritem);
    }//GEN-LAST:event_andraInfoComboItemStateChanged

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
            java.util.logging.Logger.getLogger(AndraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice andraInfoCombo;
    private javax.swing.JTextField andraTxt;
    private java.awt.Choice choice1;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namnTxt;
    // End of variables declaration//GEN-END:variables
}
