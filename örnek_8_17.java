/*
eğer satır sütundan büyükse diziyi 0 a tanımla değilse a dizisine eşitle 
*/
package ödev_hafta_13;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class örnek_8_17 {

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
        int [][]d2=new int [l][c] ;
        for (int i = 0;i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (i>j) {
                    d2[i][j]=0;
                }else{
                   d2[i][j]=d[i][j]; 
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d2[i][j]);
                
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d[i][j]);
                
            }
            System.out.println();
        }
    
    
    }
    
    
    
}
