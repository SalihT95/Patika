/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdvtutarıhesaplama;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class KdvTutarıHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fiyat, kdv = 0.18;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Kdv hesaplanacak Tutari  giriniz : ");
        fiyat = inp.nextDouble();

        if (fiyat>1000) {
            kdv=0.08;
        }
        
        double kdvTutari= kdv * fiyat;
        double kdvliTutar= fiyat+kdvTutari;

        System.out.println("KDV'siz Fiyat = " + fiyat);
        System.out.println("KDV Orani = " + kdv);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
        System.out.println("KDV tutari = " + kdvTutari);
    }
    
}
