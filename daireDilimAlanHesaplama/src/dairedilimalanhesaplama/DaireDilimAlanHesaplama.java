/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dairedilimalanhesaplama;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class DaireDilimAlanHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r,a;
        double pi =3.14,alan,cevre,dilimAlan;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Yari Cap: ");
        r=inp.nextInt();
        System.out.print("Aci Giriniz: ");
        a=inp.nextInt();
        
        cevre=pi*r*2;
        alan=pi*r*r;
        dilimAlan=(a*alan)/360;
 
        
        System.out.println("Alan: "+alan+"\nCevre: "+cevre+"\nDilimin Alani: "+dilimAlan);
    }
    
}
