/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectPackage;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import jaco.mp3.player.MP3Player;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JOptionPane;


/**
 *
 * @author HUDA
 */
public class Bill extends javax.swing.JFrame {
Connection con;
   Statement smt;
   ResultSet rs;
   String ide;
   java.util.Date date;
 java.sql.Date sqlDate;
 int q;
 int i;
    String song="C:\\Users\\HUDA\\Downloads\\Cash Register ! sound.mp3";
   MP3Player player=new MP3Player(new File(song));
 String id;
    /**
     * Creates new form Bill
     */
    public Bill()  {
        initComponents();
        getConnection();
        showDataOnTable();
        showBillData();
        calculateBillId();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        discountField = new javax.swing.JTextField();
        billId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billArea = new javax.swing.JTextArea();
        addItem = new javax.swing.JButton();
        calculateBill = new javax.swing.JButton();
        printBill1 = new javax.swing.JButton();
        printBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemId", "ItemName", "ItemPrice", "Quantity Left"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 280, 110);

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemId", "ItemName", "ItemPrice", "Quantity"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(itemTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 10, 310, 110);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ItemName");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 160, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ItemPrice");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 190, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 220, 70, 20);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(80, 160, 170, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Bill id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 220, 100, 20);

        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        jPanel1.add(priceField);
        priceField.setBounds(80, 190, 170, 22);

        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(quantityField);
        quantityField.setBounds(80, 220, 170, 22);

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField);
        idField.setBounds(80, 130, 170, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 140, 110, 30);
        jPanel1.add(discountField);
        discountField.setBounds(440, 130, 150, 30);
        jPanel1.add(billId);
        billId.setBounds(440, 210, 150, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ItemId");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 130, 70, 20);

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BillId", "BillAmount", "BillDate"
            }
        ));
        jScrollPane4.setViewportView(billTable);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(170, 260, 250, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectPackage/stationary.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        billArea.setColumns(20);
        billArea.setRows(5);
        jScrollPane3.setViewportView(billArea);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(600, 0, 270, 400);

        addItem.setText("Add to item Tables");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });
        jPanel1.add(addItem);
        addItem.setBounds(0, 400, 140, 30);

        calculateBill.setText("Calculate Bill");
        calculateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBillActionPerformed(evt);
            }
        });
        jPanel1.add(calculateBill);
        calculateBill.setBounds(190, 400, 140, 30);

        printBill1.setText("Logout");
        printBill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBill1ActionPerformed(evt);
            }
        });
        jPanel1.add(printBill1);
        printBill1.setBounds(630, 400, 140, 30);

        printBill.setText("PrintBill");
        printBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillActionPerformed(evt);
            }
        });
        jPanel1.add(printBill);
        printBill.setBounds(430, 400, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void getConnection()
{
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stationaryandgiftshop?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }
            
}
private void showBillData()
{
    try {
        String bid;
        int amt;
        java.sql.Date s;
        String query="select * from bill";
        smt=con.createStatement();
        rs=smt.executeQuery(query);
        while(rs.next())
        {
            bid=rs.getString("BillId");
            amt=rs.getInt("BillAmount");
            s=rs.getDate("BillDate");
            addRowToTable(bid,amt,s);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }
}
private void showDataOnTable()
{
    DefaultTableModel model=(DefaultTableModel)productTable.getModel();
   
   String id;
   String name;
   int price=0;
   int quantity=0;
  
  
   try
   {
            String query="Select * from items";
            smt=con.createStatement();
            rs=smt.executeQuery(query);
            while(rs.next())
            {
                 id=rs.getString("ItemId");
                 name=rs.getString("ItemName");
                 price=rs.getInt("ItemPrize");
                 quantity=rs.getInt("Quantity");
               
               model.addRow(new Object[]{id,name,price,quantity});
            }
            
   }    catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
          int index=productTable.getSelectedRow();
          setIndex(index);
         id= productTable.getModel().getValueAt(index,0).toString();
        String name=productTable.getModel().getValueAt(index,1).toString();
        String price=productTable.getModel().getValueAt(index,2).toString();
         String quantity=productTable.getModel().getValueAt(index, 3).toString();
          int quan=Integer.parseInt(quantity);
          setQuan(quan);
        idField.setText(id);
        nameField.setText(name);
        priceField.setText(price);
         
    }//GEN-LAST:event_productTableMouseClicked
private void setQuan(int quan)
{
    
    q=quan;
}
private int qetQua()
{
    return q;
}
private void setIndex(int index)
{
    i=index;
}
private int getIndex()
{
    return i;
}
    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        // TODO add your handling code here:
      int quan=qetQua();
        if(quantityField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter quantity");
            
        }
        else
        {
          if(Integer.parseInt(quantityField.getText())>quan)
          {
              JOptionPane.showMessageDialog(rootPane,"Quantity is less contact supplier");
              quantityField.setText(((Integer)quan).toString());
              
          }
          quan=quan-Integer.parseInt(quantityField.getText());
          int index=getIndex();
        updateTable(quan,index);  
        DefaultTableModel m=(DefaultTableModel)itemTable.getModel();
        m.addRow(new Object[]{idField.getText(),nameField.getText(),priceField.getText(),quantityField.getText()});
        
        }   
    }//GEN-LAST:event_addItemActionPerformed
private void updateTable(int quan,int index)
{
    DefaultTableModel model=(DefaultTableModel)productTable.getModel();
    model.setValueAt(quan,index,3);
    
}
private void updateInSQL()
{
    
    try {
        smt=con.createStatement();
int ik;
for(ik=0;ik<productTable.getRowCount();ik++)
{
    int quantity=Integer.parseInt(productTable.getModel().getValueAt(ik,3).toString());
    String iden=productTable.getModel().getValueAt(ik,0).toString();
    String query="update items set Quantity="+quantity+" where ItemId='"+iden+"'";
            smt.executeUpdate(query);
}

        JOptionPane.showMessageDialog(rootPane,"Update Successfully");
    } catch (SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    private void calculateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBillActionPerformed
        // TODO add your handling code here:
        int sum=0;
        int row=itemTable.getRowCount();
        for(int ik=0;ik<row;ik++)
        {
          String price= itemTable.getValueAt(ik,2).toString();
          String quan=itemTable.getValueAt(ik,3).toString();
          int p=Integer.parseInt(price);
          int quantity=Integer.parseInt(quan);
          sum=sum+(p*quantity);
            
        }
        
        discountField.setText(Integer.toString(sum));
        int amt=Integer.parseInt(discountField.getText());

        
        
    }//GEN-LAST:event_calculateBillActionPerformed
private void textArea()
{
    Date d=new Date();
        billArea.append("                                   Bill Area                   ");
        billArea.append("\nHello Customer your bill details are as follow \nwe hope yu had a good time here:\n");
        billArea.append("BillID:"+billId.getText()+"\nBillAmount="+discountField.getText()+"\nBillDate:"+d);
        billArea.append("\nItemId  ItemName  ItemPrize ItemQuantity");
        int index=itemTable.getRowCount();
        billArea.append("\n");
        for(int in=0;in<index;in++)
        {
           
           billArea.append(itemTable.getModel().getValueAt(in,0).toString()); 
           billArea.append("             ");
           billArea.append(itemTable.getModel().getValueAt(in,1).toString()); 
            billArea.append("            ");
           billArea.append(itemTable.getModel().getValueAt(in,2).toString()); 
            billArea.append("             ");
           billArea.append(itemTable.getModel().getValueAt(in,3).toString()); 
            billArea.append("               ");
           billArea.append("\n");
           
        }
}
public void checkQuantity()
{
    int x=0;
    try {
        smt=con.createStatement();
        String query="select count(ItemId) from items where Quantity=0";
        rs=smt.executeQuery(query);
        while(rs.next())
        {
         x=rs.getInt("count(ItemId)");
        }
        if(x>0)
        {
            JOptionPane.showMessageDialog(rootPane,"It seem you need to contact the supplier as items quantity is declining");
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }

}
private void addbillItem()
{
    try {
         smt=con.createStatement();
        DefaultTableModel model=(DefaultTableModel)itemTable.getModel();
        for(int ine=0;ine<itemTable.getRowCount();ine++)
        {
            try {
                String idee=model.getValueAt(ine,0).toString();
                int quantity=Integer.parseInt(model.getValueAt(ine,3).toString());
                java.util.Date d=new java.util.Date();
                java.sql.Date sql=new java.sql.Date(d.getTime());
                String query="insert into billItem values('"+idee+"','"+sql+"',"+quantity+")";
                smt.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }} catch (SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    private void printBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillActionPerformed
        // TODO add your handling code here:
         
        callBill();
        textArea();
        addbillItem();
        /*
        The PrinterJob class is the principal class that controls printing. An application calls methods in this class to set up a job, optionally to invoke a print dialog with the user, and then to print the pages of the job.
        */
         String printdata=billArea.getText();
        PrinterJob job=PrinterJob.getPrinterJob();
        boolean doPrint=job.printDialog();
        /*
        Presents a dialog to the user for changing the properties of the print job.*/
        if(doPrint)
        {
            try {
                job.print();
                /*
                abstaract print Prints a set of pages
                */
            } catch (PrinterException ex) {
                Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        makeEmpty();
         checkQuantity();
       
    }//GEN-LAST:event_printBillActionPerformed
public void addRowToTable(String b,int a,java.sql.Date s)
{
    DefaultTableModel model=(DefaultTableModel)billTable.getModel();
   model.addRow(new Object[]{b,a,s});
   
   
   
}
private void makeEmpty()
{
    
    billArea.setText("");
    discountField.setText("");
    idField.setText("");
    nameField.setText("");
    priceField.setText("");
    quantityField.setText("");
    clearTable();
}
private void clearTable()
{
    DefaultTableModel model=(DefaultTableModel)itemTable.getModel();
    for(int in=model.getRowCount()-1;in>=0;in--)
    {
        model.removeRow(in);
    }
    player.stop();
    calculateBillId();
}

private void calculateBillId()
{
    try {
        String bid="b99";
        smt=con.createStatement();
        String query="select BillId from bill";
        try {
            rs=smt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(rs.next())
        {
            bid=rs.getString("BillId");
        }
        
        setBid(bid);
        generateId();
    } catch (SQLException ex) {
        Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}
private void playMusic()
{

   player.play();
}
private void setBid(String s)
{
    ide=s;
    
}
private String getBid()
{
    return ide;
}
private void generateId()
{
  String x=this.getBid();
  String s=x.substring(1);
int y=Integer.parseInt(s);
y=y+1;
Integer z=y;
x="b"+z.toString();
setBid(x);
billId.setText(x);


}
private int getIn(String index)
{
    int ik;
    DefaultTableModel model=(DefaultTableModel)productTable.getModel();
    System.out.println(model.getRowCount());
  for( ik=0;ik<model.getRowCount();ik++)
  {
      String in=model.getValueAt(ik,0).toString();
      if(in.equals(index))
      {
          return ik; 
      }
  }
  return ik;
}
    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)itemTable.getModel();
        int x=itemTable.getSelectedRow();
        int itemQuantity=Integer.parseInt(model.getValueAt(itemTable.getSelectedRow(),3).toString());
     String index=model.getValueAt(itemTable.getSelectedRow(),0).toString();
     int y=getIn(index);
     int itemQuan=Integer.parseInt(productTable.getModel().getValueAt(y,3).toString());
        int quan=itemQuantity+itemQuan;
        updateTable(quan,y);
        model.removeRow(x);
        
    }//GEN-LAST:event_itemTableMouseClicked

    private void printBill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBill1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainPage p=new MainPage();
        p.setVisible(true);
    }//GEN-LAST:event_printBill1ActionPerformed
private void callBill()
{
     playMusic();
        java.util.Date d=new Date();
        java.sql.Date s=new java.sql.Date(d.getTime());

        String billI=billId.getText();
        int price=Integer.parseInt(discountField.getText());
        try {

            smt=con.createStatement();
            String query="insert into bill(BillId,BillAmount,BillDate) values('"+billI+"',"+price+",'"+s+"')";

            smt.executeUpdate(query);
            addRowToTable(billI,price,s);
            updateInSQL();
                       speak();


        }
        catch(SQLException cnfe)
        {
            JOptionPane.showMessageDialog(null,cnfe);
        }
}
private void speak()
{
     System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice("kevin16");
         voice.setRate(120);// Setting the rate of the voice
            voice.setPitch(150);// Setting the Pitch of the voice
            voice.setVolume(3);// Setting the volume of the voice
        voice.allocate();
        String spe="You received an amount of"+discountField.getText()+" via cash\nHere is a bill of your purchase";
        voice.speak(spe);
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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JTextArea billArea;
    private javax.swing.JTextField billId;
    private javax.swing.JTable billTable;
    private javax.swing.JButton calculateBill;
    private javax.swing.JTextField discountField;
    private javax.swing.JTextField idField;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton printBill;
    private javax.swing.JButton printBill1;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantityField;
    // End of variables declaration//GEN-END:variables
}
