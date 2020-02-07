
package yazılım_lab_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Hesapla {
    int toplama_sayi=0;             // Toplama ve Çıkarma sayısı
    int carpma_sayi=0;              // Çarpma ve Bölme Sayısı
    boolean det_sifir=false;        // (A^T*A) TERSİ YOKSA YANİ DETERMİNANT SIFIRSA TRUE YAPILIR BOYLECE (A*A^T) MATRİSİNİN TERSİ HESAPLANIR
    boolean diger=false;            //  SÖZDE TERS HESAPLANIRKEN SON MATRİS ÇARPIMIININ PARAMETRE AYARLAMASI İÇİN KULLANILIR
    double[][] a_matris;            //  ASIL MATRİS
   double[][] t_matris;             //  ASIL MATRİSİN TRANSPOZU
   double[][] c_matris;             //  ASIL MATRİS VE TRANSPOZ MATRİSİN ÇARPIMI DURUMA GÖRE TAM TERSİNİ TUTAR
   double[][] ters_matris;          //  C MATRİSİN TERSİNİN TUTULDUĞU MATRİS YANİ (A^T*A)^-1 VEYA (A*A^T)^-1
   double[][] sozde_matris;         //  ASIL MATRİSİN SÖZDE MATRİSİ
   double[][] carpim_temp_matris;
   final double esik_deger=0.0001;  // BİR DERĞERİN SIFIR OLUP OLMADIĞINI KONTROL EDİLMESİ İÇİN ESİK DEĞER BELİRLENMİŞTİR.
   Ayrintilar a=new Ayrintilar(); 
    
   //----------------------------------------------------------------------------------------------------------------------------------------
   //------------------------------------------------- ASIL MATRİSİN TRANSPOZUNU ALAN METOD -------------------------------------------------
   //----------------------------------------------------------------------------------------------------------------------------------------
   
public void transpoz(double[][] matris){
    String text;
    diger=false;
    a_matris=matris;
    t_matris=new double[matris[0].length][matris.length]; // Transpoze matrisin satır ve sütun sayıları değişti ve yeni matris oluşturuldu
    
    
    //----------------------------------------------------------------------------------------------------------------------------------------
    for(int i=0;i<matris.length;i++){
        for(int j=0;j<matris[0].length;j++){          // Transpoz matris oluşturuldu
            t_matris[j][i]=matris[i][j]; 
        }
    }
    
     //TRANSPOZ MATRİS KONSOLA YAZILDI
     System.out.println("Matrisin Transpozu ("+t_matris.length+" x "+t_matris[0].length+") :" ); 
      for(int i=0;i<t_matris.length;i++){
        for(int j=0;j<t_matris[0].length;j++){
            System.out.print(t_matris[i][j]);
            System.out.print(" ");
        }
          System.out.println();
    }
//----------------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------
      text="A Matrisi :";
      a.ayrinti_yaz(a_matris,ters_matris,text,false);
      text="A Matrisinin Transpozu (A*):";
      a.ayrinti_yaz(t_matris,ters_matris,text,false);                   // Matris ve transspozu ayrıntı kısmına ve tablo kısmına yazıldı
      
      a.label_ekle(" A Matrisi :");
      a.tablo_ekle(a_matris.length,a_matris[0].length, a_matris);
      a.label_ekle(" A Matrisinin Transpozu (A*):");
      a.tablo_ekle(t_matris.length,t_matris[0].length, t_matris);
//----------------------------------------------------------------------------------------------------------------------------------------
    
     //TRANSPOZ MATRİS İLE ASIL MATRİS ÇARPIM İÇİN METODA GÖNDERİLDİ EĞER ÇARPIMIN TERSİ YOKSA MATRİS İLE TRANSPOZ MATRİS YER DEĞİŞTİRİLİR
     // SÖZDE MATRİSİN HESAPLANMASI İÇİN YAPILAN ÇARPIM METODUNUN PARAMETRE SIRALAMASI İÇİN DİGER DEĞİŞKENİ TRUE YAPILDI BÖYLECE METODA
     //A^T*(A*A^T)^-1 ÇARPMA İŞLEMİ YAPTIRILDI DİGER FALSE OLSAYDI METOD (A^T*A)^-1*A^T İŞLEMİNİ YAPACAKTI
    matris_carpimi(a_matris,t_matris);
    
    if(det_sifir){
        System.out.println("(A^T*A) MATRİSİNİN TERSİ OLMADIĞI İÇİN (A*A^T) MATRİSİ HESAPLANIYOR");
        diger=true;
        toplama_sayi=0;
        carpma_sayi=0;
            a.panel_sifirla();
            
            text="A Matrisi :";
            a.ayrinti_yaz(a_matris,ters_matris,text,false);
            text="A Matrisinin Transpozu (A*):";
            a.ayrinti_yaz(t_matris,ters_matris,text,false);
            a.label_ekle(" A Matrisi :");
            a.tablo_ekle(a_matris.length,a_matris[0].length, a_matris);
            a.label_ekle(" A Matrisinin Transpozu (A*):");
            a.tablo_ekle(t_matris.length,t_matris[0].length, t_matris);
            
        matris_carpimi(t_matris,a_matris);
        
    }
}
    //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------









   //----------------------------------------------------------------------------------------------------------------------------------------
   //------------------------------------------------- MATRİS ÇARPIMI YAPAN METOD  ----------------------------------------------------------
   //----------------------------------------------------------------------------------------------------------------------------------------
public void matris_carpimi(double[][] m1,double[][] m2){
    String text;
    double temp=0;
    
    c_matris= new double[m2.length][m2.length];
    carpim_temp_matris=new double[m2.length][m2.length];
    for(int i=0;i<m2.length;i++){                  // Satır sayısı kadar döner
        for(int t=0;t<m2.length;t++){              // Sütun sayısı kadar döner   
           for(int j=0;j<m2[0].length;j++){        // oluşturulacak matrisin her bir elemanı 0 dan başlayarak döner çarpılacak matrisislerin elemanlarını sağlar
            temp=temp+m2[i][j]*m1[j][t];
            toplama_sayi++;
            carpma_sayi++;
        }
        c_matris[i][t]=temp;
        temp=0;
      }  
    }
    
    //--------------------------------------------------------------------------------------------------------
    System.out.println("Matrisin Transpozu ve kendisinin çarpımı\n");
      for(int i=0;i<c_matris.length;i++){
         for(int j=0;j<c_matris[0].length;j++){
            System.out.print(c_matris[i][j]);
            System.out.print(" ");                                           // MATRİSİN (A^T*A) MATRİSİ EKRANA YAZILIR
          }
        System.out.println();
       }   
          System.out.println("Şuana Kadarki Toplama ve Çıkarma Sayısı="+toplama_sayi);
          System.out.println("Şuana Kadar ki Çarpma ve Bölme Sayısı="+carpma_sayi);
          
     //--------------------------------------------------------------------------------------------------------     
          
          if(!diger){                                                               // Right inverse ise yazılacak text ve label
           a.label_ekle("Matrisin Transpozu ve Kendisinin Çarpımı (A* x A):");
           text="Matrisin Transpozu ve Kendisinin Çarpımı (A* x A):";
          }
          else{                                                                     // Left inverse ise yazılacak text ve label
            a.label_ekle("Matrisin Kendisinin ve Transpozunun Çarpımı (A x A*):");
            text="Matrisin Kendisinin ve Transpozunun Çarpımı (A x A*):";
          }
          
         a.ayrinti_yaz(c_matris,ters_matris,text,false);                            // Ayrıntı kısmına çarpım matrisini yazar
         a.tablo_ekle(c_matris.length,c_matris[0].length, c_matris);                // Tablo olarak yazar
         
         a.text_yaz("Şuana Kadarki Toplama ve Çıkarma Sayısı="+toplama_sayi);       // Şu ana kadarki toplama ve çarpma işlemlerini ayrıntıya yazar 
         a.text_yaz("Şuana Kadar ki Çarpma ve Bölme Sayısı="+carpma_sayi);
     //--------------------------------------------------------------------------------------------------------    
          matris_ters_al(c_matris);
}
    //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------



   //----------------------------------------------------------------------------------------------------------------------------------------
   //------------------------------------------------- MATRİS TERSİ ALAN VE SÖZDE MATRİSİ HESAPLAYAN METOD  ---------------------------------
   //----------------------------------------------------------------------------------------------------------------------------------------


public void matris_ters_al(double[][] m){
    a.text_yaz("#############----------------------ÇARPILAN MATRİSLERİN TERSİ ALINIYOR-----------------------###############");
    det_sifir=false;
    
    //------------------------------------------------------------------------------------------------------------------------
    int i=0,j=0,k=0;
    ters_matris=new double[m.length][m.length];
    for( i=0;i<m.length;i++){
        for( j=0;j<m.length;j++){
            ters_matris[i][j]=0;
            if(i==j)                                            // MATRİSİN TERSİNİN OLUŞACAĞI BİRİM MATRİS OLUŞTURULDU
                ters_matris[i][j]=1;

        }
    }
    //------------------------------------------------------------------------------------------------------------------------
    
    //------------------------------------------------ DİYAGONAL -------------------------------------------------------------
    for(i=0;i<m.length;i++){
        double c=m[i][i];  
        for(j=0;j<m.length;j++){   
           if(i==j && m[i][j]<esik_deger)                           // EĞER HERHANGİ BİR DİYAGONAL ELEMAN 0 İSE MATRİSİN TERSİ YOKTUR.
           det_sifir=true;
            ters_matris[i][j]=ters_matris[i][j]/c;                   //AYNI İŞLEM TERS MATRİSE UYGULANIR
            carpma_sayi++;
            m[i][j]=m[i][j]/c;                                       // MATRİSİN DİYAGONALİ 1 OLMASI İÇİN SATIRIN BÜTÜN SÜTUNLARI BÖLÜNÜR
            carpma_sayi++;
            
            if(i==j && m[i][j]<esik_deger)                           // EĞER HERHANGİ BİR DİYAGONAL ELEMAN 0 İSE MATRİSİN TERSİ YOKTUR.
                det_sifir=true;
        
    }
     //------------------------------------------------------------------------------------------------------------------------ 
     
     
     //------------------------------------------------------------------------------------------------------------------------ 
     String text=(i+1)+" . SATIR DİYAGONALİ 1 YAPILDI";                          // Yapılan işlem ayrıntılara yazılır
     a.ayrinti_yaz(m,ters_matris,text,true);
     
        System.out.println("\n----------------------- "+(i+1)+" . SATIR DİYAGONALİ 1 YAPILDI");  
        
    for(int x=0;x<m.length;x++){
        for(int y=0;y<m.length;y++){
            System.out.print(m[x][y]);
            System.out.print(" ");
        }                                                                        // Yapılan işlem konsola yazılır 
        System.out.print("  |  ");
                for(int y=0;y<m.length;y++){
            System.out.print(ters_matris[x][y]);
            System.out.print(" ");
        }
        System.out.println();
    }
    //------------------------------------------------------------------------------------------------------------------------ 
    
    
    if(det_sifir){
        System.out.println("Matrisin determinantı sıfır olduğundan tersi yoktur");   //DİYAGONALİ 1 YAPTIKTAN SONRA DİYAGONELLERDE 0 VARSA DET_SIFIR TRUE
        break;                                                                       // YAPILDI BURADA DÖNGÜDEN ÇIKILIR VE TRANSPOZ METODUNDAN İKİNCİ KISIM
    }                                                                                // HESAPLANMAYA GÖNDERİLİR 
    
    
        //------------------------------------------------SÜTUNLARI YOK ETME -------------------------------------------------------------   
        for(k=0;k<m.length;k++){                                             // matriste satırların tarar seçili diyagonalle eşit satırı atlar
            if(k!=i){
            double t=m[k][i];                                                 // sıfır olacak eleman, seçili diyagonalin altındaki sütunlarda bulunur
           for(j=0;j<m.length;j++){                                           // o satırdaki elemanları tarar
              ters_matris[k][j]=ters_matris[k][j]+(ters_matris[i][j]*(t*-1)); // Aynı işem ters matrise uygulanır
              toplama_sayi++;
              carpma_sayi=carpma_sayi+2;
              m[k][j]=(m[k][j]+(m[i][j]*(t*-1)));                     // t nin eksilisi ile seçili diyagonalin satırı çarpılır diğer satırlar ile toplanır                    
              toplama_sayi++;
              carpma_sayi=carpma_sayi+2;
              
              if(k==j && m[k][j]<esik_deger)                  //DİYAGONAL ELEMANIN BULUNDUĞU SÜTUNLAR TEMİZLENİRKEN EĞER HERHANGİ BİR DİYAGONAL 0 OLURSA
                  det_sifir=true;                             // MATRİSİN TERSİ YOKTUR DET_SİFİR DEĞERİ TRUE YAPILIR
    
           }
        }  
        }
        //-----------------------------------------------------------------------------------------------------------------------------------   
    
        //-----------------------------------------------------------------------------------------------------------------------------------
     text=(i+1)+" . SÜTUN TEMİZLENDİ";
     a.ayrinti_yaz(m,ters_matris,text,true);
     
     a.text_yaz("Şuana Kadarki Toplama ve Çıkarma Sayısı="+toplama_sayi);
     a.text_yaz("Şuana Kadar ki Çarpma ve Bölme Sayısı="+carpma_sayi);
        
        System.out.println("\n----------------------- "+(i+1)+" . KOLON TEMİZLENDİ");
    for(int x=0;x<m.length;x++){
        for(int y=0;y<m.length;y++){
            System.out.print(m[x][y]);
            System.out.print(" ");
        }
        System.out.print("  |  ");
                for(int y=0;y<m.length;y++){
            System.out.print(ters_matris[x][y]);
            System.out.print(" ");
        }
        System.out.println();
    
    }
    //-----------------------------------------------------------------------------------------------------------------------------------
    

     
    
        // SÜTUNLAR YOK EDİLİRKEN DİYAGONAL SIFIR OLDU BÖYLECE MATRİSİN TERSİ YOKTUR DÖNGÜDEN ÇIKILIR İKİNCİ KISIM MATRİS İÇİN TRANSPOZ METODUNA DÖNÜLÜR
        if(det_sifir){
        System.out.println("\n\n------------------------------------------------ (A^T*A) MATRİSİNİN DETERMİNANTI SIFIRDIR TERSİ YOKTUR-----------------------------------------\n\n");
        break;
       }
    }
    a.text_yaz("#########################------------------------------------------------------------------###############################");

     
     

    //DET SIFIR DEĞERİ SADECE TRANSPOZ METODUNDA DİĞER MATRİSİ GETİREBİLMEK İÇİNDİR BU METOD ÇALIŞTIĞINDA SIFIR YAPILIRKİ AKTİF MATRİSİN TERSİ HESAPLANABİLSİN
   //MATRİSİN TERSİ KONSOLA YAZDILIR VE HANGİ KISIM MATRİS İSE "DİĞER" PARAMETRESİNE BAKILARAK MATRİS SIRASI DEĞİŞTİRLİR VE SÖZDE MATRİS 
   //HESAPLAMASI İÇİN ÇARPIM METODUNA GÖNDERİLİR
   
    if(!det_sifir){

    System.out.println("\nMatrisin Tersi:\n");
    for(i=0;i<m.length;i++){
        for(j=0;j<m.length;j++){
            System.out.print(m[i][j]);
            System.out.print(" ");
        }
        System.out.print("  |  ");
            for(j=0;j<m.length;j++){
            System.out.print(ters_matris[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }
    
       System.out.println("Şuana Kadarki Toplama ve Çıkarma Sayısı= "+toplama_sayi);
       System.out.println("Şuana Kadarki Çarpma ve Bölme Sayısı= "+carpma_sayi);
      
       if(!diger){
        String text="Matrisin Transpozu ve kendisinin Çarpımının Tersi (A* x A)^-1:";
        a.ayrinti_yaz(ters_matris,m,text,false);  
        a.label_ekle("Matrisin Transpozu ve kendisinin Çarpımının Tersi (A* x A)^-1:");
        a.tablo_ekle(ters_matris.length,ters_matris[0].length, ters_matris);

           son_carpim(t_matris,ters_matris);
       }
       else if(diger){
        String text="Matrisin Kendisinin ve Transpozunun Çarpımının Tersi (A x A*)^-1:";
        a.ayrinti_yaz(ters_matris,m,text,false); 
        a.label_ekle("Matrisin Kendisinin ve Transpozunun Çarpımının Tersi (A x A*)^-1:");
        a.tablo_ekle(ters_matris.length,ters_matris[0].length, ters_matris);
           System.out.println("aaa");
           son_carpim(ters_matris,t_matris);
       }
   }  
}
   //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------------



public void son_carpim(double[][] m1,double[][] m2){
    String text;
DecimalFormat df=new DecimalFormat("#.####");
    double temp=0;
    
    sozde_matris= new double[m2.length][m1[0].length];
    for(int i=0;i<m2.length;i++){
        for(int t=0;t<m1[0].length;t++){
           for(int j=0;j<m2[0].length;j++){
            temp=temp+m2[i][j]*m1[j][t];
            toplama_sayi++;
            carpma_sayi++;
        }
        sozde_matris[i][t]=temp;
        temp=0;
      }  
    }
    
    //-------------------------------------------------------------------------------------------------------------------------------------
    System.out.println("\nMatrisin Sözde Tersi:\n");
          for(int i=0;i<sozde_matris.length;i++){
        for(int j=0;j<sozde_matris[0].length;j++){
            System.out.print(df.format(sozde_matris[i][j]));
            System.out.print("  ");                                         
        }
          System.out.println();
    }
     //--------------------------------------------------------------------------------------------------------------------------------------     
          
          System.out.println("Şuana Kadarki Toplama ve Çıkarma Sayısı="+toplama_sayi);
          System.out.println("Şuana Kadar ki Çarpma ve Bölme Sayısı="+carpma_sayi);
          if(diger){
           a.label_ekle("Matrisin Sözde Tersi (A* x (A x A*)^-1):");
           text="Matrisin Sözde Tersi (A* x (A x A*)^-1):";
          }
          else{
              a.label_ekle("Matrisin Sözde Tersi ((A* x A)^-1 x A*):");
              text="Matrisin Sözde Tersi ((A* x A)^-1 x A*):";
          }
         
         a.ayrinti_yaz(sozde_matris,ters_matris,text,false);
         a.tablo_ekle(sozde_matris.length,sozde_matris[0].length, sozde_matris);
         a.text_yaz("Şuana Kadarki Toplama ve Çıkarma Sayısı="+toplama_sayi);
         a.text_yaz("Şuana Kadar ki Çarpma ve Bölme Sayısı="+carpma_sayi);
        
  
        

   
   a.setVisible(true);
}

    public static void main(String[] args) {
 
       
    }

    



    
}


