/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev_hafta_13;

/**
 *
 * @author Lenovo
 */
public class örnek_8_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
java.util.Scanner input=new java.util.Scanner (System.in);

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
                if (i<j) {
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
