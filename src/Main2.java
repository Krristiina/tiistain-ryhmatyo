import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main2 {

    static List<Kysymys2> lista = new ArrayList<>();
    private static final String polku = "src/Kysymykset2.txt";

    public static void main(String[] args) {
        lueTiedosto();

        Collections.shuffle(lista);

        int pisteet = 0;
        int kysytty = 0;
        for (Kysymys2 k : lista) {
            if (k.kysy()) {
                pisteet++;
            }
            kysytty++;
            if (kysytty == 10) {
                System.out.println("Pisteesi: " + pisteet);
                break;
            }

        }


    }


    static public void lueTiedosto() {
        try (BufferedReader lukija = new BufferedReader(new FileReader(polku))) {
            // lue kaikki Kysymykset (rivit)
            for (String rivi = lukija.readLine(); rivi != null; rivi = lukija.readLine()) {
                // String array eri elementeistä riviltä
                String[] sanat = rivi.split(",");

                // oikea vastaus int
                int oikea = Integer.parseInt(sanat[4]);
                // lisää uusi Kysymys2
                lista.add(new Kysymys2(
                        sanat[0], sanat[1], sanat[2], sanat[3], oikea
                ));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found. Quitting.");
        } catch (IOException e) {
            System.out.println("File was not found. Quitting.");
        }
    }
}
