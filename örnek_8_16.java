/*
sondan 1 önceki satır ve sütunların toplamı 
tanımla
for for yap if(l sondan bi önceki ise ve sütun son sütun değil ise topla
if (c sondan bi önce ise ve satır son satır değilse topla 
*/
package ödev_hafta_13;

/**
 *
 * @author Lenovoc
 */
import java.util.Scanner;
public class örnek_8_16 {

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
        int t =0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if ((i==l-2)  && (j!=c-1)) {
                 t+=d[i][j];  
                         System.out.println("sonuç:"+t);

                }if ((j==c-2)&&(i!=l-2)&&(i!=l-1)) {
                    t+=d[i][j];
                    System.out.println(i+".satır"+j+".sütun");
        System.out.println("sonuç2:"+t);

                }
            }
        }
        System.out.println("sonuç:"+t);
    }
    
}
