/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazılım_lab_2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
        

/**
 *
 * @author erhan
 */
public class Matris extends javax.swing.JFrame {
    double[][] matris;
    double[] rastgele_sayilar;
  
    public Matris() {
        
        initComponents();
        Hesapla_Butonu.setVisible(false);                // İlk Açılan ekranda seçim yapılmadan önce bütün panel ve butonlar kapalıdır.
        Matris_Paneli.setVisible(false);
        Matris_Boyutu_Paneli.setVisible(false);
        Matris_boyut_label.setVisible(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Matris_Ekle = new javax.swing.JButton();
        Rastgele_Matris = new javax.swing.JButton();
        Matris_Boyutu_Paneli = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Matris_boyut_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Matris_Paneli = new javax.swing.JPanel();
        Hesapla_Butonu = new javax.swing.JButton();
        Arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matris Hesaplayıcı");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(600, 200));
        setMinimumSize(new java.awt.Dimension(778, 605));
        setResizable(false);
        setSize(new java.awt.Dimension(1168, 604));
        getContentPane().setLayout(null);

        Matris_Ekle.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Matris_Ekle.setForeground(new java.awt.Color(255, 255, 255));
        Matris_Ekle.setText("Matris Ekle");
        Matris_Ekle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Matris_Ekle.setContentAreaFilled(false);
        Matris_Ekle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Matris_Ekle.setFocusPainted(false);
        Matris_Ekle.setFocusable(false);
        Matris_Ekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Matris_EkleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Matris_EkleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Matris_EkleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Matris_EkleMouseReleased(evt);
            }
        });
        Matris_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Matris_EkleActionPerformed(evt);
            }
        });
        getContentPane().add(Matris_Ekle);
        Matris_Ekle.setBounds(270, 200, 220, 60);

        Rastgele_Matris.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Rastgele_Matris.setForeground(new java.awt.Color(255, 255, 255));
        Rastgele_Matris.setText("Rastgele Matris Getir");
        Rastgele_Matris.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Rastgele_Matris.setContentAreaFilled(false);
        Rastgele_Matris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rastgele_Matris.setFocusPainted(false);
        Rastgele_Matris.setFocusable(false);
        Rastgele_Matris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Rastgele_MatrisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Rastgele_MatrisMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Rastgele_MatrisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Rastgele_MatrisMouseReleased(evt);
            }
        });
        Rastgele_Matris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rastgele_MatrisActionPerformed(evt);
            }
        });
        getContentPane().add(Rastgele_Matris);
        Rastgele_Matris.setBounds(270, 310, 220, 60);

        Matris_Boyutu_Paneli.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matris Boyutu :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox1.setSelectedIndex(4);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox2.setSelectedIndex(3);

        javax.swing.GroupLayout Matris_Boyutu_PaneliLayout = new javax.swing.GroupLayout(Matris_Boyutu_Paneli);
        Matris_Boyutu_Paneli.setLayout(Matris_Boyutu_PaneliLayout);
        Matris_Boyutu_PaneliLayout.setHorizontalGroup(
            Matris_Boyutu_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matris_Boyutu_PaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        Matris_Boyutu_PaneliLayout.setVerticalGroup(
            Matris_Boyutu_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Matris_Boyutu_PaneliLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Matris_Boyutu_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Matris_Boyutu_Paneli);
        Matris_Boyutu_Paneli.setBounds(130, 420, 270, 80);

        Matris_boyut_label.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Matris_boyut_label.setForeground(new java.awt.Color(255, 255, 255));
        Matris_boyut_label.setText("A : 5 x 5 ");
        getContentPane().add(Matris_boyut_label);
        Matris_boyut_label.setBounds(30, 250, 74, 29);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seçim yapınız :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 60, 420, 50);

        Matris_Paneli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Matris_Paneli.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Matris_Paneli.setOpaque(false);

        javax.swing.GroupLayout Matris_PaneliLayout = new javax.swing.GroupLayout(Matris_Paneli);
        Matris_Paneli.setLayout(Matris_PaneliLayout);
        Matris_PaneliLayout.setHorizontalGroup(
            Matris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        Matris_PaneliLayout.setVerticalGroup(
            Matris_PaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        getContentPane().add(Matris_Paneli);
        Matris_Paneli.setBounds(130, 150, 340, 250);

        Hesapla_Butonu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Hesapla_Butonu.setForeground(new java.awt.Color(255, 255, 255));
        Hesapla_Butonu.setText("Hesapla");
        Hesapla_Butonu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Hesapla_Butonu.setContentAreaFilled(false);
        Hesapla_Butonu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hesapla_Butonu.setFocusPainted(false);
        Hesapla_Butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Hesapla_ButonuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Hesapla_ButonuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Hesapla_ButonuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Hesapla_ButonuMouseReleased(evt);
            }
        });
        Hesapla_Butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hesapla_ButonuActionPerformed(evt);
            }
        });
        getContentPane().add(Hesapla_Butonu);
        Hesapla_Butonu.setBounds(420, 450, 120, 40);

        Arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg.jpeg"))); // NOI18N
        getContentPane().add(Arkaplan);
        Arkaplan.setBounds(0, 0, 780, 606);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Matris_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Matris_EkleActionPerformed
        System.out.println("########### ----------------------------------------------------------- ############\n");
        
        int x,y;
        Rastgele_Matris.setLocation(510,310);      // Rastgele matris butonu yana kaydırılır
        Matris_Ekle.setLocation(510,230);          // Matris ekle butonu yana kaydırılır.
        jLabel1.setText("Lütfen Matrisi ve Değerlerini Giriniz");      // Başlık yazısı ayarlanır
        jLabel1.setLocation(180,60);                                   // Başlık yeri ayarlanır
        
        //------------------------------------------------------------------------------------------------------------------------------
        Matris_Paneli.removeAll();                 // Matrisin butona basıldığında sıfırdan ayarlanmasını sağlar (bütün fieldları siler)
        Matris_Paneli.revalidate();                // Paneli Günceller
        Matris_Paneli.repaint();                   // Paneli tekrar yazar
        //-------------------------------------------------------------------------------------------------------------------------------
        
        Matris_Boyutu_Paneli.setVisible(true);      // Matrisin boyutunun ayarlanacağı panel açılır
        Matris_boyut_label.setVisible(true);        // Matrisin boyutunu gösteren label açılır 
        Matris_Paneli.setVisible(true);             // Matris paneli Açılır
        Hesapla_Butonu.setVisible(true);            // Hesaplamak için basılacak buton
        
        x=Integer.parseInt(jComboBox1.getSelectedItem().toString());  // Matrisin satır sayısını alır
        y=Integer.parseInt(jComboBox2.getSelectedItem().toString());  // Matrisin sütun sayısını alır
        System.out.println("Girilen Matris Boyutu = "+x+"x"+y);
        
        
        Matris_boyut_label.setText("A : "+x+" x "+y);                 // Matrisin boyutunu başlığa yazar
        Matris_olustur(x,y,true);                                     // Matrisi oluşturmak için metod çağırır

    }//GEN-LAST:event_Matris_EkleActionPerformed

    
    // Matrisi oluşturmak için componentleri oluşturur panele yerleştirir. 
    
    public void Matris_olustur(int x,int y,boolean giris_yapilabilir){
        matris=new double[x][y];
    
        for(int i=0;i<x;i++){                    //matrisin satır ve sütun sayısında for döngüsü ile textfieldlar oluşturulur böylece matris oluşur
           for(int j=0;j<y;j++){
                JTextField f=new javax.swing.JTextField();            //textfield oluşturuldu
                f.setFont(new Font("Century Gothic",Font.BOLD,17)); //--------------------------------------------------------
                f.setHorizontalAlignment(SwingConstants.CENTER);       // textfieldın içindeki yazıların ortalanması
                f.setSize(42,30);                                      // textfieldın boyutu
                f.setLocation(50+j*49,35+i*37);                        // textfieldın panelin içindeki yeri (matrise göre ayarlandı)  
              if(!giris_yapilabilir)
                 f.setEditable(false);                                 // textfieldlara giriş yapılamaz.
                 f.setVisible(true);                                   // textfield görünür
                                                                    //---------------------------------------------------------
 
                Matris_Paneli.add(f);                                 // textfield ı panele ekle
                f.requestFocus();                                     // textfield a giriş yap ki panelde gözüksün yoksa settext yapmak zorunda kalınır.
        }
        
    }
}
    // Oluşturulan matrisi rastgele sayılar oluşturarar doldurur 
    
    public void Matris_Doldur(int x,int y){
        int k=0,j=0,t=0;
        Random r = new Random();                      // rastgele sayı üretiminde kullanılacak nesne
        DecimalFormat d=new DecimalFormat("#.#");     // sayının noktadan sonra tek digit olmasını sağlayan mask
        rastgele_sayilar=new double[x*y];             // matrisin boyutunda bir dizi tanımlandı
        
        //Rastgele sayılar oluşturur
        
        for(int i=0;i<x*y;i++){
        String sayi=d.format(1+((r.nextDouble())*8.0));                               // rastgele sayı 1-9 arası oluşturuldu
        double matris_random_sayi=Double.parseDouble(sayi.replace(',','.'));    // sayı double a çevrildi
        rastgele_sayilar[i]=matris_random_sayi;                                 // sayı diziye atıldı.
        }
        
        //Rastgele sayıları texfieldlara ve matrise yazar  
           for(int i=0;i<x;i++){
                for(j=0;j<y;j++){
                     ((JTextField)(Matris_Paneli.getComponentAt(50+j*49,35+i*37))).setText(Double.toString(rastgele_sayilar[t])); // sayılar text field a atıldı
                     matris[i][j]=rastgele_sayilar[t];
                     System.out.print(matris[i][j]);
                     System.out.print(" ");
                     t++;   
                }
                System.out.println();
           }
   
    }
    
    
    
    
    private void Rastgele_MatrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rastgele_MatrisActionPerformed
        System.out.println("########### ----------------------------------------------------------- ############\n");
        Rastgele_Matris.setLocation(510,310);
        Matris_Ekle.setLocation(510,230);
        jLabel1.setText("Rastgele Matris Oluşturuluyor ...");
        jLabel1.setLocation(200,60);
        
        //------------------------------------------------------------------------------------------------------------------------------
        Matris_Paneli.removeAll();                     // Matrisin butona basıldığında sıfırdan ayarlanmasını sağlar (bütün fieldları siler)
        Matris_Paneli.revalidate();                    // Paneli Günceller
        Matris_Paneli.repaint();                       // Paneli tekrar yazar
        //------------------------------------------------------------------------------------------------------------------------------
       
        Matris_boyut_label.setVisible(true);     // Matrisin boyutunu gösteren label
        Matris_Boyutu_Paneli.setVisible(false);  // Matris boyutu otomatik ayarlanacağından boyut paneli kapatılır
        Matris_Paneli.setVisible(true);          // Matris paneli açılır
        Hesapla_Butonu.setVisible(true);         // Hesaplamak için basılacak buton
        
       //------------------------------------------------------------------------------------------------------------------------------
        //Rastgele 1 5 arası birbirinden farklı sayılar oluşturup matris boyutunu belirler
        Random r= new Random();          // Rastgele için nesne oluşturulur.
        int x=r.nextInt(5)+1;            // Matrisin satır sayısı [1 5]
        int y=r.nextInt(5)+1;            // Matrisin sütun sayısı [1 5]
        while(y==x)                      // Matrisin satır ve sütun sayısı aynı olmaması için aynı olmayana kadar sütuna değer verilir
        y=r.nextInt(5)+1;
        //------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("Rastgele Matrsi Boyutu = "+x+"x"+y);
        Matris_boyut_label.setText("A : "+x+" x "+y);
        
        Matris_olustur(x,y,false);
        Matris_Doldur(x,y);
    }//GEN-LAST:event_Rastgele_MatrisActionPerformed

    

//----------------------------------------------------------------------------------------------------------------------------------------------    
//---------------------------------------------  RASTGELE MATRİS ve MATRİS EKLE  BUTONU STİL METODLARI -----------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------       
    private void Rastgele_MatrisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rastgele_MatrisMouseEntered
        Rastgele_Matris.setForeground(Color.black);
    }//GEN-LAST:event_Rastgele_MatrisMouseEntered

    private void Rastgele_MatrisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rastgele_MatrisMouseExited
        Rastgele_Matris.setForeground(Color.white);
    }//GEN-LAST:event_Rastgele_MatrisMouseExited

    private void Rastgele_MatrisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rastgele_MatrisMousePressed
        Rastgele_Matris.setBorder(BorderFactory.createLineBorder(Color.GREEN,2,true));
    }//GEN-LAST:event_Rastgele_MatrisMousePressed

    private void Rastgele_MatrisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rastgele_MatrisMouseReleased
       Rastgele_Matris.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    }//GEN-LAST:event_Rastgele_MatrisMouseReleased

    private void Matris_EkleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Matris_EkleMouseEntered
       Matris_Ekle.setForeground(Color.BLACK);
    }//GEN-LAST:event_Matris_EkleMouseEntered

    private void Matris_EkleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Matris_EkleMouseExited
       Matris_Ekle.setForeground(Color.WHITE);
    }//GEN-LAST:event_Matris_EkleMouseExited

    private void Matris_EkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Matris_EkleMousePressed
       Matris_Ekle.setBorder(BorderFactory.createLineBorder(Color.GREEN,2,true));
    }//GEN-LAST:event_Matris_EkleMousePressed

    private void Matris_EkleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Matris_EkleMouseReleased
       Matris_Ekle.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    }//GEN-LAST:event_Matris_EkleMouseReleased

//----------------------------------------------------------------------------------------------------------------------------------------------   
//----------------------------------------------------------------------------------------------------------------------------------------------   
//----------------------------------------------------------------------------------------------------------------------------------------------   
 
    
    
    
    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        int x= Integer.parseInt(jComboBox1.getSelectedItem().toString());
        jComboBox2.removeAllItems();
        for(int i=1;i<6;i++){
            if(i==x)
                continue;
            jComboBox2.addItem(Integer.toString(i));
        }
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void Hesapla_ButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hesapla_ButonuActionPerformed

        try{
        if(Matris_Boyutu_Paneli.isShowing()){                      // Eğer Matris rastgele gelmiyorsa önce girilen değerleri fieldlardan al ve diziye at
            for(int i=0;i<matris.length;i++){
                for(int j=0;j<matris[0].length;j++){                   
                    matris[i][j]=Double.parseDouble(((JTextField)(Matris_Paneli.getComponentAt(50+j*49,35+i*37))).getText()); //girilen değerleri al diziye at
                    System.out.print(matris[i][j]);                // matrisi yaz
                    System.out.print(" ");
                }
                System.out.println();
            }
            new Hesapla().transpoz(matris);
        }
        
        else{
            
            new Hesapla().transpoz(matris);
            
        }
        }
        catch(NumberFormatException e){
            new ayrinti().setVisible(true);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Hesapla_ButonuActionPerformed

    
    private void Hesapla_ButonuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hesapla_ButonuMouseEntered
       Hesapla_Butonu.setForeground(Color.BLACK);
    }//GEN-LAST:event_Hesapla_ButonuMouseEntered

    private void Hesapla_ButonuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hesapla_ButonuMouseExited
        Hesapla_Butonu.setForeground(Color.WHITE);
    }//GEN-LAST:event_Hesapla_ButonuMouseExited

    private void Hesapla_ButonuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hesapla_ButonuMousePressed
       Hesapla_Butonu.setBorder(BorderFactory.createLineBorder(Color.GREEN,2,true));
    }//GEN-LAST:event_Hesapla_ButonuMousePressed

    private void Hesapla_ButonuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hesapla_ButonuMouseReleased
        Hesapla_Butonu.setBorder(BorderFactory.createLineBorder(Color.BLACK,2,true));
    }//GEN-LAST:event_Hesapla_ButonuMouseReleased

    
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
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arkaplan;
    private javax.swing.JButton Hesapla_Butonu;
    private javax.swing.JPanel Matris_Boyutu_Paneli;
    private javax.swing.JButton Matris_Ekle;
    private javax.swing.JPanel Matris_Paneli;
    private javax.swing.JLabel Matris_boyut_label;
    private javax.swing.JButton Rastgele_Matris;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
