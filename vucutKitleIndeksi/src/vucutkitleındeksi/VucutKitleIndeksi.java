/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vucutkitleındeksi;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class VucutKitleIndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double boy,index;
        int kilo;
        Scanner inp = new Scanner(System.in);
        System.out.print("Boy(m) : ");
        boy=inp.nextDouble();
        System.out.print("Kilo(kg) : ");
        kilo=inp.nextInt();
        
        System.out.println("Index : "+ (kilo/(boy*boy)));
        
    
    
    }
    
}
