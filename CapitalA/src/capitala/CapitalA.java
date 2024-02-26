/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitala;

/**
 *
 * @author Administrator
 */
public class CapitalA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int row = 1; row <= 2; row++)
        {
            for(int col = 1; col <= 6; col++)
            {
                System.out.printf("*", + row + col);
            }
            System.out.println();
        }
        for(int row = 1; row <= 1; row ++)
        {
            for(int col = 1; col <= 2; col++)
            {
                System.out.printf("*");
            }
            for(int col = 3; col <= 4; col++)
            {
                System.out.printf(" ");
            }
            for(int col = 5; col <= 6; col++)
            {
                System.out.printf("*", + row + col);
            }
            System.out.println();
        }
        for(int row = 1; row <= 1; row++)
        {
            for(int col = 1; col <= 6; col++)
            {
                System.out.printf("*", + row + col);
            }
            System.out.println();
        }
        for(int row = 5; row <= 6; row ++)
        {
            for(int col = 1; col <= 2; col++)
            {
                System.out.printf("*");
            }
            for(int col = 3; col <= 4; col++)
            {
                System.out.printf(" ");
            }
            for(int col = 5; col <= 6; col++)
            {
                System.out.printf("*", + row + col);
            }
            System.out.println();
        }    
    }
}
