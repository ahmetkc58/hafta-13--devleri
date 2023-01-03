/*
yedek köşegen bulma 
matrisi tanımla 
for for(c kadar ) yap 1. forun içine c-- yaz
topla
*/
package ödev_hafta_13;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_8_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
        System.out.println("satır sayısını giriniz:");
        int l=input.nextInt();
        
        System.out.println("sütun sayısını giriniz:");
        int c=input.nextInt();
        int [][] d =new int [l][c];
        for (int i = 0; i <l; i++) {
            for (int j = 0; j <c; j++) {
                System.out.println(i+".satır"+j+".stun değerini giriniz:");
                d[i][j]=input.nextInt();
                
            }
        }
        int t=0;
        for (int i = 0; i < l; i++) {
               c--;
            for (int j = 0; j <c; j++) {
            t+=d[i][j];    
            }
         
        }
        System.out.println("sonuç:"+t);
    }
    
}
