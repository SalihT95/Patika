/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetreprogrami;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class TaksimetreProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int km;
        double tutar=10.0, tm=2.2;

        Scanner inp = new Scanner(System.in);
        System.out.print("Km :");
        km=inp.nextInt();
        tutar+=km*tm;
        if(20>tutar){
            tutar=20.0;
        }
        System.out.println("Tutar: "+tutar);
    }
    
}
