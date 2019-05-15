package cse.fet.gurukul.Cultural;

import cse.fet.gurukul.R;
import cse.fet.gurukul.Technical.Technical;

import java.util.ArrayList;

public class CulturalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();
        Technical s = new Technical();
        int mx = 1;
        s.setTitle("ABHINAYA");
        s.setSummary("https://drive.google.com/file/d/1Hrgpp-9ZITnDZphvDbLwVvAxV7_tW2V0/view?usp=sharing");
        s.setImage(R.drawable.nautanki);
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();

        s.setTitle("FANCY FOOTWORKS");
        s.setSummary("https://drive.google.com/file/d/1Gfy34JezfXsIe81NIkgx14PgvK6_7v5x/view?usp=sharing");
        s.setImage(R.drawable.dance);
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);

        s = new Technical();
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setTitle("KRITIKA");
        s.setSummary("https://drive.google.com/file/d/1TcJC7S2pb8wjXeSPnxALwmOG5o-Xxfgh/view?usp=sharing");
        s.setImage(R.drawable.kritika);
        events.add(s);


        s = new Technical();
        s.setTitle("LOL-STANDUP COMEDY");
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/18TnBIIqt1bbTV6vc12xcAHublOlOc8uQ/view?usp=sharing");
        s.setImage(R.drawable.comedy);
        events.add(s);


        s = new Technical();
        s.setTitle("SARGAM");
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/13CQY6b8BiU2W5IkT5WSMp3j5SvTnEl4-/view?usp=sharing");
        s.setImage(R.drawable.singing);
        events.add(s);


        s = new Technical();
        s.setTitle("FASHIONISTA");
        s.setSummary("https://drive.google.com/file/d/19OJPCyg4WzKP79gh6Cu7I3lzf7QQ_DVF/view?usp=sharing");
        s.setImage(R.drawable.fasion);
        s.setCode("CTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        return events;
    }
}
