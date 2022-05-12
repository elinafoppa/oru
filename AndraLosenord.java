/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author elina
 */
public class AndraLosenord extends javax.swing.JFrame {
 private InfDB idb;
    /**
     * Creates new form AndraLosenord
     */
    public AndraLosenord() {
        initComponents();
        try{
            idb =  new InfDB("mibdb", "3306", "mibdba", "mibkey" ); 
            

        }
      catch(InfException e){
           JOptionPane.showMessageDialog(null, "Något gick fel");
           System.out.println("Internet felmeddelande"+ e.getMessage());
      }
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namnTxt = new javax.swing.JTextField();
        nyttLosenordTxt = new javax.swing.JTextField();
        losenordTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ändra Lösenord");

        jLabel2.setText("Namn");

        jLabel3.setText("Lösenord");

        jLabel4.setText("Nytt lösenord");

        namnTxt.setText("Agent O");
        namnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnTxtActionPerformed(evt);
            }
        });

        nyttLosenordTxt.setText("123456");
        nyttLosenordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttLosenordTxtActionPerformed(evt);
            }
        });

        losenordTxt.setText("planka");
        losenordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenordTxtActionPerformed(evt);
            }
        });

        jButton1.setText("Bekräfta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nyttLosenordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(losenordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nyttLosenordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnTxtActionPerformed

    private void nyttLosenordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttLosenordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttLosenordTxtActionPerformed

    private void losenordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_losenordTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
         //Get metoder
         String user = namnTxt.getText(); //En get metod för att ta emot texten som skrivs in i textfältet
         String password = losenordTxt.getText();//En get metod för att ta emot texten som skrivs in i textfältet
         String newpassword = nyttLosenordTxt.getText();//En get metod för att ta emot texten som skrivs in i textfältet
         
         //SQL frågor
         String namnfraga = "SELECT NAMN from AGENT where NAMN like '" + user + "'"; //En sql fråga som hämtar namnet på agenten som har namnet vi skickar in
         String losenfraga = "SELECT LOSENORD from AGENT where NAMN like '" + user + "'";//En sql fråga som hämtar Lösenordet på agenten som har namnet vi skickar in
         String nyttLosenordfraga = "UPDATE AGENT SET LOSENORD = '"+ newpassword + "'" +" where NAMN like '" + user + "'";//En sql fråga som ändrar föregående lösnordet till det nya om rätt agent namn inskrivet
       
         //Frågorna körs
         String hamtadeNamnet = idb.fetchSingle(namnfraga);
         String hamtadeLosen = idb.fetchSingle(losenfraga);
       
        if (user.isBlank() ) 
               { //denna kollar om textrutan är tom
                JOptionPane.showMessageDialog(null, "alla fällt måste vara ifyllda"); 
            }

            if (user.isBlank() ) { //denna kollar om textrutan är tom
                JOptionPane.showMessageDialog(null, "alla fällt måste vara ifyllda");
            }




            if(user.equals(hamtadeNamnet))//kollar om namnet vi skriver in i textfältet existerar i databasen
            {
            if (hamtadeLosen.equals(password))//kollar så att lösenordet som vi skriver in är samma som i databasen
            {
                System.out.println("det funkade");
                String utforNyttLosen= idb.fetchSingle(nyttLosenordfraga);
            } 
            else //check vid fealktigt lösenord av användaren
            {
                System.out.println(password+ " " + hamtadeLosen);
                System.out.println("felaktigt lösenord och användarnamn");
           }
            }
            else//vid felaktigt namn
            {
                System.out.println("felaktigt lösenord och användarnamn");
            }

 }
 catch(InfException e){
           JOptionPane.showMessageDialog(null, "Något gick fel");
           System.out.println("Internet felmeddelande"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField losenordTxt;
    private javax.swing.JTextField namnTxt;
    private javax.swing.JTextField nyttLosenordTxt;
    // End of variables declaration//GEN-END:variables
}