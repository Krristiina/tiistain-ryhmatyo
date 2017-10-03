import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Kysymyspeli {

    List<String> kysymykset;
    List<String> oikeatVastaukset;

    public Kysymyspeli() {  //konstruktori
        this.kysymykset = new ArrayList<>();
        kysymykset.add("Mikä viikonpäivä aloittaa viikon?(A: Maanantai B: Tiistai C: Keskiviikko)");
        kysymykset.add("Kuka kirjoitti romaanin Vuonna 1984?(A: Huxley B: Orwell C:Shakespeare)");
        kysymykset.add("Mikä on Espanjan pääkaupunki? (A: Barcelona B: Lissabon C: Madrid)");
        kysymykset.add("Mikä on Suomen pääkaupunki? (A: Helsinki B: Turku C: Rovaniemi");
        kysymykset.add ("Kuinka paljon on 2+2? (A: 4 B: 5 C: 2");
        kysymykset.add("Mikä on maaiman suurin kaupunki? (A: Sao Paulo B: New York C: Tokio");
        kysymykset.add ("Kuka maalasi Guernican? (A: Dalí B: Picasso C: Van Gogh)");
        kysymykset.add ("Kenen kuuluisa lausahdus on 'Ajattelen siis olen' A: Socrates B: Descartes C: Nero");
        kysymykset.add ("Kuinka monta Oscaria Hitchcock voitti? A: 4 B: 1 C: 0");
        kysymykset.add ("Beatlesin rumpali oli: A: Ringo Starr B: Charlie Watts  C: Lars Ulrich");



        this.oikeatVastaukset = new ArrayList<>();
        oikeatVastaukset.add("A");
        oikeatVastaukset.add("B");
        oikeatVastaukset.add("C");
        oikeatVastaukset.add("A");
        oikeatVastaukset.add("A");
        oikeatVastaukset.add("C");
        oikeatVastaukset.add("B");
        oikeatVastaukset.add("B");
        oikeatVastaukset.add("C");
        oikeatVastaukset.add("A");

    }

    public void kysyKysymys() {
        int pistelaskuri = 0;

        for (int indeksi=0; indeksi< kysymykset.size(); indeksi++) {

            int randomindeksi= (int) (Math.random() * 10+1);
            //oltava (int) edessä koska Math.random antaa doublen


            System.out.println(kysymykset.get(randomindeksi));
            Scanner lukija = new Scanner(System.in);
            String vastaus = lukija.nextLine();


            if (vastaus.equals(oikeatVastaukset.get(randomindeksi))) {
                pistelaskuri++;
                System.out.println("Oikein! Pisteitä kasassa: " + pistelaskuri);
            } else {
                System.out.println("Väärin!Pisteitä kasassa: " + pistelaskuri);
            }

        }


    }
}

