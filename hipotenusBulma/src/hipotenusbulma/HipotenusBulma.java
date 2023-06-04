/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusbulma;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class HipotenusBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("3 adet Kenar Giriniz");
        int a , b ; 
        double c ,u , alan ;
        Scanner inp = new Scanner(System.in);
        
        a=inp.nextInt();
        b=inp.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus: "+c);
        u = (a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan : "+alan);
    }
    
}
