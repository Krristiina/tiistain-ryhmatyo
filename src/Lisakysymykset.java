import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lisakysymykset {
    private int counter;
    private int pisteet;
    List<Kysymys> kysymykset = new ArrayList<>();


    public void kysyLisaa() {
        Kysymys k1 = new Kysymys();
        k1.setKysymys("Mikä Euroviisubiisi voitti Eurovision-laulukisat vuonna 1975?");
        ArrayList<String> vastausvaihtoehdot1 = new ArrayList<>();
        vastausvaihtoehdot1.add("Waterloo");
        vastausvaihtoehdot1.add("Ding a Dong");
        vastausvaihtoehdot1.add("Hallelujah");
        k1.setVastausVaihtoehdot(vastausvaihtoehdot1);
        k1.setOikeaVastaus(1);
        kysymykset.add(k1);

        Kysymys k2 = new Kysymys();
        k2.setKysymys("Minä vuonna alkoi ranskan vallankumous?");
        ArrayList<String> vastausvaihtoehdot2 = new ArrayList<>();
        vastausvaihtoehdot2.add("1798");
        vastausvaihtoehdot2.add("1897");
        vastausvaihtoehdot2.add("1978");
        k2.setVastausVaihtoehdot(vastausvaihtoehdot2);
        k2.setOikeaVastaus(0);
        kysymykset.add(k2);

        Kysymys k3 = new Kysymys();
        k3.setKysymys("Onko Suomen koripallomaajoukkueen lempinimi?");
        ArrayList<String> vastausvaihtoehdot3 = new ArrayList<>();
        vastausvaihtoehdot3.add("Kettuposse");
        vastausvaihtoehdot3.add("Susijengi");
        vastausvaihtoehdot3.add("Karhuryhmä");
        k3.setVastausVaihtoehdot(vastausvaihtoehdot3);
        k3.setOikeaVastaus(1);
        kysymykset.add(k3);

        Collections.shuffle(kysymykset);

        this.counter = 0;
        this.pisteet = 0;
    }
}
