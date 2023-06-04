/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manavkasaprogrami;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class ManavKasaProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates =  1.11 ,muz= 0.95 ,patlican = 5.00;
        int toplam=0;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Armut Kac Kilo?: ");
        toplam+=armut*inp.nextInt();
        System.out.print("Elma Kac Kilo?: ");
        toplam+=elma*inp.nextInt();
        System.out.print("Domates Kac Kilo?: ");
        toplam+=domates*inp.nextInt();
        System.out.print("Muz Kac Kilo?: ");
        toplam+=muz*inp.nextInt();
        System.out.print("Patlican Kac Kilo?: ");
        toplam+=patlican*inp.nextInt();
        System.out.print("\nToplam: "+toplam);
    }
    
}
