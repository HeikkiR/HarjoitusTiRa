/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TiRa;

/**
 *
 * @author Veikko
 */
public class Jarjestaja {
    
    public static int[] kupla(int[] taulu){ 
        
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
        
        return taulu;
    }
}
