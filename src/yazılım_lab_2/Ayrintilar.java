/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazılım_lab_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author erhan
 */
public class Ayrintilar extends javax.swing.JFrame {
   int sonlocationx=68;//148
   int sonlocationy=100;//131
  //Hesapla hesaplanan=new Hesapla()
   DecimalFormat df=new DecimalFormat("#.####");;
    public Ayrintilar() {
        initComponents();
        AnaPanel1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.setVisible(false);
        more.setFont(new Font("Century Gothic",Font.BOLD,17));


        
        
    }


public void tablo_ekle(int x,int y,double[][] matris){

int a=sonlocationx;
int b=sonlocationy;
int enb=0;
int temp=0;
 for(int i=0;i<matris.length;i++){                    //matrisin satır ve sütun sayısında for döngüsü ile textfieldlar oluşturulur böylece matris oluşur
     
    for(int j=0;j<matris[0].length;j++){  
 JTextField f=new javax.swing.JTextField();            //textfield oluşturuldu
 f.setFont(new Font("Century Gothic",Font.BOLD,15));  //--------------------------------------------------------
 f.setHorizontalAlignment(SwingConstants.CENTER);       // textfieldın içindeki yazıların ortalanması

 f.setSize(72,30);                                      // textfieldın boyutu
 f.setLocation(a+j*(f.getSize().width+7),b+i*37);            // textfieldın panelin içindeki yeri (matrise göre ayarlandı)  
 
 f.setEditable(false);                                  // textfieldlara giriş yapılamaz.
 f.setText(df.format(matris[i][j]));
 f.setVisible(true);                                    // textfield görünür
 sonlocationx=68;                                                     //---------------------------------------------------------
 sonlocationy=f.getLocation().y+150;
 
 AnaPanel.add(f);                                       // textfield ı panele ekle
 f.requestFocus();                                     // textfield a giriş yap ki panelde gözüksün yoksa settext yapmak zorunda kalınır.
 enb=0;
        }
    }
            if(sonlocationy>700)
            AnaPanel.setPreferredSize(new Dimension(AnaPanel.getWidth(),AnaPanel.getHeight()+700));


    
}
void panel_sifirla(){
    AnaPanel.removeAll();
    AnaPanel.revalidate();
    AnaPanel.repaint();
    AnaPanel.setPreferredSize(new Dimension(554, 736));
    sonlocationx=68;
    sonlocationy=100;
    yontem.setText("Double Inverse : Left Inverse (A x A^+ = I)");
    more.setText("");
}

void label_ekle(String text){
    JLabel label=new javax.swing.JLabel();
    label.setText(text);
    label.setFont(new Font("Century Gothic",Font.BOLD,17));
    System.out.println(text);
    label.setSize(530,39);
    label.setLocation(34,sonlocationy-70);
    AnaPanel.add(label);
    AnaPanel.validate();
    label.setVisible(true);
    
    
}
void text_yaz(String text){
    more.append(text);
    more.append("\n\n");
} 
        
        
        
        
public void ayrinti_yaz(double[][] matris,double[][] matris2,String text,boolean yaz){
    DecimalFormat df=new DecimalFormat("#.####");
    more.append(text+"\n\n");
    for(int i=0;i<matris.length;i++){
        for(int j=0;j<matris[0].length;j++){
            more.append(String.format("%25.15f",matris[i][j])); 
        }
        if(yaz){
        more.append("   |   ");
        
        for(int j=0;j<matris2[0].length;j++){
            more.append(String.format("%25.15f",matris2[i][j]));
   
        }
        }
        more.append("\n");
    }
    more.append("\n\n");

    jScrollPane1.setVisible(true);
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yontem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        more = new javax.swing.JTextArea();
        AnaPanel1 = new javax.swing.JScrollPane();
        AnaPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayrıntılar");
        setLocation(new java.awt.Point(200, 75));
        setMinimumSize(new java.awt.Dimension(1500, 800));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Kullanılan Yöntem : Moore Penrose Pseudo Inverse");

        yontem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        yontem.setText("Double Inverse : Right Inverse (A^+ x A = I)");

        more.setColumns(20);
        more.setRows(5);
        jScrollPane1.setViewportView(more);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yontem)
                            .addComponent(jLabel1))
                        .addGap(0, 610, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yontem)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        AnaPanel1.setAutoscrolls(true);

        AnaPanel.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout AnaPanelLayout = new javax.swing.GroupLayout(AnaPanel);
        AnaPanel.setLayout(AnaPanelLayout);
        AnaPanelLayout.setHorizontalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        AnaPanelLayout.setVerticalGroup(
            AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        AnaPanel1.setViewportView(AnaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AnaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AnaPanel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ayrintilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ayrintilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ayrintilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ayrintilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Ayrintilar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnaPanel;
    private javax.swing.JScrollPane AnaPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea more;
    private javax.swing.JLabel yontem;
    // End of variables declaration//GEN-END:variables
}
