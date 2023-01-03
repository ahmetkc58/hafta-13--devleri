/*
nxn lik matrisin köşegenin altında kalanların toplamını bul 

matrisi tanımla 
for for yap içine if yaz satır sütüundan büyük olacak 
t değişkeninde topla

1 başla 
2 satır sayısını al
3 sütun sayısını al 
4 for (satırı tanımlattır)
5 for(sütun u tanımlattır
6 matris değerlerini kulanıcıdan al
7 for satır sayısını al
8 for sütun al
9 if satır sütundan büyükse t de topla 
*/
package ödev_hafta_13;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_8_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    
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
        int t =0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (i>j) {
                 t+=d[i][j];   
                    
                }
            }
        }
                    System.out.println("sonuç:"+t);

    }
    
}
