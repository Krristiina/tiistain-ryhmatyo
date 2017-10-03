import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Haluatko pelata peliä 1, 2 vai 3?");
        Scanner lukija = new Scanner(System.in);
        int num = lukija.nextInt();

        if (num == 1) {
            // pelaa peliä 1
        } else if (num == 2) {
            Main2 m2 = new Main2();
            m2.pelaa();
        } else if (num == 3) {
            // pelaa peliä 3
        }
        else {
            System.out.println("Syöte ei kelpaa!");

        }
    }
}
