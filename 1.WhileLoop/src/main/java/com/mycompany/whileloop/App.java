/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;

/**
 *
 * @author Sanele
 */
public class App {

    public static void main(String[] args) {
         int row = 1;
        
        while (row <= 4) {
            int col = 1;
            
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            
            System.out.println();
            row++;
        }
    }
}
