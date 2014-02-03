package tira;

/**
 * Luokka sisältää kolme erilaista järjestämismetodia: mergesort, quiksort ja bublesort.
 * 
 * Tällä hetkellä mergesort ilmeisesti bugaa, ja vaatii hiomista. 
 * 
 * Sisältää Javan taulukko tietorakenteen käyttöä joka ilmeisesti korvattava.
 * Muuten en heti keksi mitä tietorakenteita tässä pitäisi korvata.
 * 
 * @author Heikki Rantala
 * @version 0.2 3.2.2014
 */
public class Jarjestaja {
   
/**
 * Buble sort
 * 
 * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
 */
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
    
    /**
     * Quicksortin apumetodi, mahdollisesti muokkausta vaativa
     * 
     * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
     * @param vasen
     * @param oikea
     * @return 
     */
    
    private int jako(int[] taulu, int vasen, int oikea) {
        
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
 
/**
 * Quicksortin apumetodi
 * 
 * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
 * @param vasen
 * @param oikea 
 */
    
     private void quick(int taulu[], int vasen, int oikea) {
    
        int index = jako(taulu, vasen, oikea);
      
        if (vasen < index - 1)
            quick(taulu, vasen, index - 1);
        if (index < oikea)
            quick(taulu, index, oikea);
    }
    
/**
 * Quicksort-toteutuksen varsinainen kutsuttava metodi.
 * 
 * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
 */ 
     
    public void quickSort(int taulu[]) {
        quick(taulu,0,taulu.length - 1);
    }

/**
 * Mergesortin apumetodi, vaatinee vielä hiomista
 * 
 * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
 * @param vasen
 * @param keski
 * @param oikea 
 */
    
    private void merge(int [] taulu, int vasen, int keski, int oikea)
      {
        int [] temp = new int[taulu.length];  // bugi lienee täällä, palataan asiaan
        int vasenVika;
        int kohta;
        int apu;
    
        vasenVika = (keski - 1);
        apu = vasen;
        kohta = (oikea - vasen + 1);
    
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
 
        for (int i = 0; i < kohta; i++)
        {
            taulu[oikea] = temp[oikea];
            oikea--;
        }
    }
 /**
  * Mergesorin apumetodi 
  * 
  * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
  * @param vasen
  * @param oikea 
  */
    private void mergesortti(int [] taulu, int vasen, int oikea)
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
 /**
  * Mergesotin varsinainen kutsuttava metodi
  * 
  * @param taulu Javan taulukko, joka ilmeisesti korvattava omalla tietorakenteella lopulliseen
  */
    public void mergesort(int [] taulu) {
        mergesortti(taulu, 0, taulu.length - 1);
    }

}
