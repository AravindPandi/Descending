/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Descendig {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How many no.s u want to check:");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("Enter the no.s:");
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = s1.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
