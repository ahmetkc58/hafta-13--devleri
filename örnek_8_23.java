/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_hafta_13;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class örnek_8_23 {

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
        int s = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {

                if (d[i][j] != d[j][i]) {

                    s++;
                }
                
                

            }
        }
        if (s == 0) {
            System.out.println("simetrik bi matrisdir");
        }else {
            System.out.println("simetrik değildir");
        }
    }

}
