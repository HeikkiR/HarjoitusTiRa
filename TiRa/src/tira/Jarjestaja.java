/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tira;

/**
 *
 * @author Heikki Rantala
 * @version 0.2 3.2.2014
 */
public class Jarjestaja {
   
    public Jarjestaja(){}

    public static void kupla(int[] taulu){ 
        
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
    
    int jako(int[] taulu, int vasen, int oikea) {
        
      int i = vasen;
      int j = oikea;
      int apu;
      int kohta = taulu[vasen];  // Parempi olisi puoliväli tai random mutta ei ehkä niin mielenkiintoinen vertailusssa.
     
      while (i <= j) {
            while (taulu[i] < kohta)
                  i++;
            while (taulu[j] > kohta)
                  j--;
            if (i <= j) {
                  apu = taulu[i];
                  taulu[i] = taulu[j];
                  taulu[j] = apu;
                  i++;
                  j--;
            }
      };
     
      return i;
    }
 
void quick(int taulu[], int vasen, int oikea) {
    
      int index = jako(taulu, vasen, oikea);
      
      if (vasen < index - 1)
            quick(taulu, vasen, index - 1);
      if (index < oikea)
            quick(taulu, index, oikea);
    }
    
public void quickSort(int taulu[]) {
    quick(taulu,0,taulu.length - 1);
}


 static public void merge(int [] taulu, int vasen, int keski, int oikea)
      {
        int [] temp = new int[20];
        int i;
        int vasenVika;
        int alkiot;
        int apu;
    
        vasenVika = (keski - 1);
        apu = vasen;
        alkiot = (oikea - vasen + 1);
    
        while ((vasen <= vasenVika) && (keski <= oikea))
        {
            if (taulu[vasen] <= taulu[keski])
                temp[apu++] = taulu[vasen++];
            else
                temp[apu++] = taulu[keski++];
        }
    
        while (vasen <= vasenVika)
            temp[apu++] = taulu[vasen++];
 
        while (keski <= oikea)
            temp[apu++] = taulu[keski++];
 
        for (i = 0; i < alkiot; i++)
        {
            taulu[oikea] = temp[oikea];
            oikea--;
        }
    }
 
    static public void mergesortti(int [] taulu, int vasen, int oikea)
    {
      int keskiKohta;
    
      if (oikea > vasen)
      {
        keskiKohta = (oikea + vasen) / 2;
        mergesortti(taulu, vasen, keskiKohta);
        mergesortti(taulu, (keskiKohta + 1), oikea);   
        merge(taulu, vasen, (keskiKohta+1), oikea);
      }
    }
 
    public void mergesort(int [] taulu) {
        mergesortti(taulu, 0, taulu.length - 1);
    }

}
