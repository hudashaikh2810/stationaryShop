/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contactSystem;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HUDA
 */
public class AdditionalInformation extends javax.swing.JFrame {
String lastname,contact;
java.util.Date date;
Connection con;
String fname;
int id;
    /**
     * Creates new form AdditionalInformation
     */
    public AdditionalInformation() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        dobField = new com.toedter.calendar.JDateChooser();
        deletBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        call = new javax.swing.JButton();
        nameField1 = new javax.swing.JTextField();
        viewRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 20, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dob");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 180, 50, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LastName");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 80, 70, 20);
        jPanel1.add(contactField);
        contactField.setBounds(160, 120, 120, 30);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(160, 70, 120, 30);
        jPanel1.add(dobField);
        dobField.setBounds(160, 170, 130, 40);

        deletBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletBtn.setText("Delete");
        deletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletBtn);
        deletBtn.setBounds(250, 240, 100, 30);

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn);
        updateBtn.setBounds(30, 240, 100, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 130, 70, 20);

        call.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        call.setText("Call");
        call.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });
        jPanel1.add(call);
        call.setBounds(140, 240, 100, 30);

        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nameField1);
        nameField1.setBounds(160, 20, 120, 30);

        viewRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewRecord.setText("View Record");
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        jPanel1.add(viewRecord);
        viewRecord.setBounds(130, 280, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HUDA\\Downloads\\contact.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void deletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletBtnActionPerformed
    try {
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(rootPane,"Are you sure you want to delete");
        String cont=contactField.getText();
        getConnection();
        Statement sm;
        sm=con.createStatement(); 
        String query="delete from information where contact_no='"+cont+"'";
        JOptionPane.showMessageDialog(rootPane,"Updated Succesfully");
        sm.executeUpdate(query);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane,ex);
    }
       
    }//GEN-LAST:event_deletBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
    try {
        // TODO add your handling code here:
          JOptionPane.showConfirmDialog(rootPane,"Do you really want to update");
        java.sql.Date sqlDate;
        java.util.Date date1;
        date1=dobField.getDate();
        sqlDate=new java.sql.Date(date1.getTime());
        
        getConnection();
        Statement sm;
        sm=con.createStatement();
       String query="update information set Firstname='"+nameField1.getText()+"',Lastname='"+nameField.getText()+"',dob='"+sqlDate+"',contact_no='"+contactField.getText()+"' where contact_no='"+contactField.getText()+"'";
       sm.executeUpdate(query);
       JOptionPane.showMessageDialog(rootPane,"Updated Succesfully");
    } catch (SQLException ex) {
               JOptionPane.showMessageDialog(rootPane,ex);
    }
        
    }//GEN-LAST:event_updateBtnActionPerformed
void updateTableInfo(int count)
{
    try {
        Statement sm;
                sm=con.createStatement();

        String query1="update information set count="+count+" where contact_no='"+contactField.getText()+"'";
        sm.executeUpdate(query1);
    } catch (SQLException ex) {
        Logger.getLogger(AdditionalInformation.class.getName()).log(Level.SEVERE, null, ex);
    }

}
    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed
void updateTable()
{
    int count=0;
    try {
        String contac=contactField.getText();
        Statement sm;
        String query="select count from information where contact_no='"+contac+"'";
        sm=con.createStatement();
        ResultSet rs;
        rs=sm.executeQuery(query);
        while(rs.next())
        {
             count=rs.getInt("count");
            
        }
        count=count+1;
                
        updateTableInfo(count);
    } catch (SQLException ex) {
        Logger.getLogger(AdditionalInformation.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
    try {
        // TODO add your handling code here:
        
       
        getConnection();
        String contac=contactField.getText();
        java.util.Date date=new java.util.Date();
java.sql.Date sqlDate=new java.sql.Date(date.getTime());
java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
System.out.println(sqlDate);
System.out.println(sqlTime);
        Statement sm;
       
        String query="insert into recent(contact_no,calldate,calltime) values('"+contac+"','"+sqlDate+"','"+sqlTime+"')";
        sm=con.createStatement();
        sm.executeUpdate(query);
         JOptionPane.showMessageDialog(rootPane,"Called Succesfully");
    } catch (SQLException ex) {
        Logger.getLogger(AdditionalInformation.class.getName()).log(Level.SEVERE, null, ex);
    }
    updateTable();

        
    }//GEN-LAST:event_callActionPerformed

    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        // TODO add your handling code here:
        String contacts=contactField.getText();
        ShowRecords s=new ShowRecords();
        s.setVisible(true);
        s.findData(contacts);
    }//GEN-LAST:event_viewRecordActionPerformed
public void setLastName(String lastname)
{
    this.lastname=lastname;
    
}
public void setContact(String contact)
{
    this.contact=contact;
}
public void setDate(Date dob)
{
    date=dob;
    insert();
}
public String getLastName()
{
    return lastname;
}
public String getContact()
{
    return contact;
}
public Date getDate()
{
    return date;
}
public void setFName(String s)
{
    fname=s;
}
public String getFName()
{
    return fname;
}
private void insert()
{
    lastname=this.getLastName();
fname=this.getFName();
    contact=this.getContact();
    date=this.getDate();
    nameField1.setText(fname);
    nameField.setText(lastname);
    contactField.setText(contact);
    dobField.setDate(date);
    
   
    
    
    
    
    
}
void getConnection()
{
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(AdditionalInformation.class.getName()).log(Level.SEVERE, null, ex);
    }
}
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
            java.util.logging.Logger.getLogger(AdditionalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdditionalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdditionalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdditionalInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdditionalInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton call;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deletBtn;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewRecord;
    // End of variables declaration//GEN-END:variables
}
