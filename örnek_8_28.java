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
public class örnek_8_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("şirket satısını giriniz:");
        int n = input.nextInt();
        int[] ort = new int[n];
        int[] max = new int[n];
        int[] maxf = new int[n];
        int[] min = new int[n];
        int[] minf = new int[n];
        int[] maxş = new int[n];
        int[] minş = new int[n];

        int[][] d = new int[n][12];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.println("lütfen" + i + ".şirketin" + j + ". aydaki karını giriniz");
                d[i][j] = input.nextInt();
            }
        }
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                t += d[i][j];
            }
            ort[i] = t / 12;
        }

        int M = 0;
        int s = 0;
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 12; j++) {
                if (d[i][j] > M) {
                    M = d[i][j];
                    s = j;
                }
                maxf[i] = s;
            }
            max[i] = M;
            maxş[i]=i;

        }
        int k = 0;
        int Min = 0;
        
        
        for (int i = 0; i < n; i++) {
            Min = d[i][0];
            for (int j = 0; j < 12; j++) {

                if (d[i][j] < Min) {
                    k = j;
                    Min = d[i][j];

                }
                minf[i] = k;
            }
            min[i] = Min;
            minş[i]=i;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + ".şirketin ortalaması:" + ort[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + ".şirketin en yüksek kar şu sayılı ayda " + maxf[i]);
            System.out.println("miktarı" + max[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + ".şirketin en düşük kar  şu sayılı ayda " + minf[i]);
            System.out.println("miktarı" + min[i]);

        }
    }

}
