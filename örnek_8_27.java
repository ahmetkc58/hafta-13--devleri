/*
dizi tanımlattır daha sonra for //satırı kontrol et 
for // terim sayısına kadar tekrar et 
for //sütunu kontrol eder 
yan yana olanları kıyasla eğer 2. daha küçükse yer değiştir  
*/
package ödev_hafta_13;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_8_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner (System.in);
int l =3,c=3,n=3;
int [][]d =new int [3][3] ;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(i+".satırdaki  "+j+". sütunda ki elemanı giriniz   :       ");
                d[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i <l; i++) {
            for (int j = 0; j <n; j++) {
                for (int k = 0; k < c-1; k++) {
                    if (d[i][k]>d[i][k+1]) {
                        int hide =d[i][k+1];
                        d[i][k+1]=d[i][k];
                        d[i][k]=hide ;
                    }
                }
            }
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }


    }
    
}
