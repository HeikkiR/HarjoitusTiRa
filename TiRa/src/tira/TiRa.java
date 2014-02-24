/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tira;



import java.util.Scanner;
import java.util.Random;

/**
 *Pääohjelma jolla voi vertailla järjestysalgoritmien käyttämää aikaa.
 * 
 * @author Heikki Rentala
 * @Version 1
 */

public class TiRa {

    private static Scanner lukija = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Random sattuma = new Random();
           String luettu;
           int koko;
           KuplaJ buble = new KuplaJ();
           MergeSort merg = new MergeSort();
           PikaJ pika = new PikaJ();
           int[] taulu;
           long aloitusAika;
           long lopetusAika;
           long kokonaisAika;
           
           System.out.println("Anna parametrit muodossa 'x numero', jossa x on algoritmin koodi:");
           System.out.println("q = quicksort, m = mergesort, b = bubblesort");
           System.out.println("ja numero on järjestettävän taulukon koko.");
           System.out.println("Esimerkiksi: q 100000 ja enter");
           System.out.println("Lopeta kirjoittamalla 'end' ja enter. Väärän muotoinen syöte kaataa ohjelman herkästi.");
           System.out.println();
           
           while(true) {
           
            System.out.println("Anna algoritmin koodi ja taulukon koko:");
           
            luettu = lukija.next();
           
            if (luettu.equals("end")) {
               break;
            }

            koko = lukija.nextInt();
            
            taulu = new int[koko];
            
            for (int i = 0; i < taulu.length; i++) {
                taulu[i] = sattuma.nextInt(60000);
            }
           
            aloitusAika = System.currentTimeMillis();
            
            if (luettu.equals("q")) {
               pika.sort(taulu);
            }
            else {
                if (luettu.equals("b")) {
                buble.sort(taulu);
                }
                else {
                    if (luettu.equals("m")) {
                    merg.sort(taulu);
                    }
                    else {
                        System.out.println("Virhe syötteessä, ohjelma keskeytetään.");
                        break;
                    }
                 }
             }
           
            
            lopetusAika = System.currentTimeMillis();
            kokonaisAika = lopetusAika - aloitusAika;
            
            System.out.println("Taulukko järjestettiin ajassa " + kokonaisAika + "ms");
            
           }

    }
    
}