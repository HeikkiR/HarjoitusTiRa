
package tira;

/**
 *Kuplajärjestämis algoritmi tira harjoitustyöhön
 * 
 * 
 * @author Heikki Rantala
 * @version 1
 */
public class KuplaJ {
    
    /**
     * 
     * @param taulu int taulukko
     */
    
       public static void sort(int[] taulu){ 
        
        for(int i=0; i<taulu.length; i++){
                boolean testi = false;
                int muisti = 0;
                for(int j =0; j<taulu.length-i-1; j++){
                        if(taulu[j]>taulu[j+1]){
                                muisti = taulu[j];
                                taulu[j] = taulu[j+1];
                                taulu[j+1] = muisti;
                                testi = true;
                        }
                }
                
                if(testi==false) break;       // tarkastaa onko taulukko jo järjestyksessä
        }
        
        return;
    }
}
