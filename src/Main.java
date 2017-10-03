import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Haluatko pelata peliä 1, 2 vai 3?");
        Scanner lukija = new Scanner(System.in);
        int num = -1;
        try {
            num = lukija.nextInt();
        }
        catch (InputMismatchException a) {
            System.out.println("Syöte ei kelpaa, aloita alusta!");
        }

        if (num == 1) {
            System.out.println("Valitse oikea vaihtoehto isolla kirjaimella");
            Kysymyspeli kp = new Kysymyspeli();
            kp.kysyKysymys();
        } else if (num == 2) {
            System.out.println("Valitse oikea vaihtoehto a, b tai c");
            Main2 m2 = new Main2();
            m2.pelaa();
            Lisakysymykset lisa = new Lisakysymykset();
            lisa.kysyLisaa();
        } else if (num == 3) {
            Yleistieto2017 yt = new Yleistieto2017();
            yt.yleistieto();
        }
        else {
            System.out.println("Luvun tulee olla välillä 1-3, aloita alusta!");

        }

    }
}
