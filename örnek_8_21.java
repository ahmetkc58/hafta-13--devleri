/*
tanımla 
dışarıda while ile yap 
for for yap eğer sütun x ise çarp 
yazdır 
 */
package ödev_hafta_13;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_8_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını giriniz:");
        int l = input.nextInt();

        System.out.println("sütun sayısını giriniz:");
        int c = input.nextInt();
        int[][] d = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(i + ".satır" + j + ".stun değerini giriniz:");
                d[i][j] = input.nextInt();

            }
        }
        int sayaç=0;
        while (sayaç<c) {  
            int ç =1;
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    if (j==sayaç) {
                     ç*=d[i][j];   
                    }
                }
            }
                System.out.println(sayaç+".sütun çarpımı "+ç);
                sayaç++;
        }

    }

}
