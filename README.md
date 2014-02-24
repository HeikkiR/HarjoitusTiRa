HarjoitusTiRa
=============

README

Ohjelma on toteutettu Java-kielellä, käyttäen NetBeans 7.4 kehitysympäristöä ja löytyy netbeans projekti muodossa. Itse ajoin koodia vain NetBeansissa, mutta tuskin tulee ongelmia. Java luokkien lähdekoodit ovat polussa: harjoitustira/tira/src/tira. Pitäisi olla helppo löytää. Luokkia on neljä: KuplaJ.java, MergeSort.java, PikaJ.java ja TiRa.java. Kaikki nämä on luonnollisesti käännettävä samaan kansioon. TiRa.java on ajettava pääohjelma, joka ajetaan ilman mitään lisäkäskyjä.

Pääohjelman avulla voi vertailla quicksort, mergesort ja bubble sort algoritmien järjestämiseen käyttämää aikaa. Syöte on muotoa algoritmin ensimmäinen kirjain + välilyönti + taulukon koko + enter. Esimerkiksi syöte 'm 100000' antaisi ajan joka mergesort algoritmilla kesti järjestää 100000 alkionen taulukko. 'b 1000' antaisi puolestaan bubble sortin käyttämän ajan 1000 alkioiselle taulukolle. Yli 10 000 000 kooltaan olevat pyynnöt saattavat kaataa ohjelman. Ohjelma kaatuu helposti myös virheellisestä syötteestä. Ohjelmasta voi poistua kirjoittamalla käsky 'end'.

Algoritmeilla on omat luokkansa ja niille kaikille löytyy junit testit.
