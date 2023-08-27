/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contactSystem;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUDA
 */
public class SearchContacts extends javax.swing.JFrame {
Connection con;
AdditionalInformation m=new AdditionalInformation();
    /**
     * Creates new form SearchContacts
     */
    public SearchContacts() {
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
        jLabel2 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        anywhere = new javax.swing.JButton();
        initial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        end = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter initial");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 120, 30);
        jPanel1.add(text);
        text.setBounds(170, 30, 230, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 100, 30);

        anywhere.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        anywhere.setText("Initial anywhere");
        anywhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anywhereActionPerformed(evt);
            }
        });
        jPanel1.add(anywhere);
        anywhere.setBounds(310, 110, 140, 30);

        initial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        initial.setText("Start with initial");
        initial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialActionPerformed(evt);
            }
        });
        jPanel1.add(initial);
        initial.setBounds(10, 110, 140, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "LastName"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 350, 150);

        end.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        end.setText("End with initial");
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });
        jPanel1.add(end);
        end.setBounds(160, 110, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HUDA\\Downloads\\contact.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void getConnection()
{
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpcommingBirthday.class.getName()).log(Level.SEVERE, null, ex);
        }

}
void addRowToTable(String fname,String lname)
{
    DefaultTableModel model=(DefaultTableModel)table.getModel();
    model.addRow(new Object[]{fname,lname});
    
}
    private void initialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialActionPerformed
    try {
        // TODO add your handling code here:
        getConnection();
        Statement smt;
        ResultSet rs;
        String s=text.getText();
        String query="select FirstName,LastName from information where FirstName like '"+s+"%'";
        smt=con.createStatement();
        rs=smt.executeQuery(query);
        while(rs.next())
        {
            try {
                String fname=rs.getString("FirstName");
                String lname=rs.getString("LastName");
                addRowToTable(fname,lname);
            } catch (SQLException ex) {
                Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_initialActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        // TODO add your handling code here:
            try {
        // TODO add your handling code here:
        getConnection();
        Statement smt;
        ResultSet rs;
        String s=text.getText();
        String query="select FirstName,LastName from information where FirstName like '%"+s+"'";
        smt=con.createStatement();
        rs=smt.executeQuery(query);
        while(rs.next())
        {
            try {
                String fname=rs.getString("FirstName");
                String lname=rs.getString("LastName");
                addRowToTable(fname,lname);
            } catch (SQLException ex) {
                Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
    }

        
    }//GEN-LAST:event_endActionPerformed

    private void anywhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anywhereActionPerformed
        // TODO add your handling code here:
            try {
        // TODO add your handling code here:
        getConnection();
        Statement smt;
        ResultSet rs;
        String s=text.getText();
        String query="select FirstName,LastName from information where FirstName like '%"+s+"%'";
        smt=con.createStatement();
        rs=smt.executeQuery(query);
        while(rs.next())
        {
            try {
                String fname=rs.getString("FirstName");
                String lname=rs.getString("LastName");
                addRowToTable(fname,lname);
            } catch (SQLException ex) {
                Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(SearchContacts.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_anywhereActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         try {
        String lname = null,contact = null;
        java.util.Date dob = null;
        int index=table.getSelectedRow();
        String name=table.getModel().getValueAt(index,0).toString();
        String lastname=table.getModel().getValueAt(index,1).toString();
        Statement sm;
        sm=con.createStatement();
        String query="select contact_no,dob from information where Firstname='"+name+"' and LastName='"+lastname+"'";
        ResultSet rs=sm.executeQuery(query);
        while(rs.next())
        {
           
        
        contact=rs.getString("contact_no");
        
        dob=rs.getDate("dob");
        }
m.setFName(name);
       m.setLastName(lastname);
       m.setContact(contact);
       m.setDate(dob);
       m.setVisible(true);
      
       
    } catch (SQLException ex) {
        Logger.getLogger(ViewContact.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(SearchContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchContacts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anywhere;
    private javax.swing.JButton end;
    private javax.swing.JButton initial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}