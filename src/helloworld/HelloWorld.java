/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Random;
public class HelloWorld {

    public static void main(String[] args) {
        Random generator = new Random();
        int tab[] = new int[100];
        for(int i = 0;i<100;i++){
            tab[i] = generator.nextInt(1000);
        }
        int bufor;
        for(int i = 0;i<100;i++){
            for(int j = 1;j<(100-i);j++){
                if(tab[j-1]>tab[j]){
                    bufor = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = bufor;
                }
            }
        }
    

        System.out.print("Najmniejsza liczba to "+tab[0]+" a najwieksza to "+tab[99]);
    }
    
}
