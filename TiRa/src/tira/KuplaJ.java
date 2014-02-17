/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tira;

/**
 *Kuplajärjestämis algoritmi tira harjoitustyöhön
 * 
 * 
 * @author Heikki Rantala
 * @version 0.8
 */
public class KuplaJ {
    
       public static void sort(int[] taulu){ 
        
        for(int i=0;i<taulu.length;i++){
                boolean testi = false;
                int muisti = 0;
                for(int j =0;j<taulu.length-i-1;j++){
                        if(taulu[j]>taulu[j+1]){
                                muisti = taulu[j];
                                taulu[j] = taulu[j+1];
                                taulu[j+1] = muisti;
                                testi = true;
                        }
                }
                
                if(testi==false) break;
        }
        
        return;
    }
}
