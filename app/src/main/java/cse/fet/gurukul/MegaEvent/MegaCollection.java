package cse.fet.gurukul.MegaEvent;

import cse.fet.gurukul.R;
import cse.fet.gurukul.Technical.Technical;

import java.util.ArrayList;

public class MegaCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();
        int mx = 1;
        s.setTitle("PUBG");
        s.setSummary("https://drive.google.com/file/d/1oAHJbseJ8izulzMvA6W6H7J96GLmrxAP/view?usp=sharing");
        s.setCode("MGE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.pubg);
        events.add(s);
        s = new Technical();


        s.setTitle("EX-POSE");
        s.setSummary("https://drive.google.com/file/d/19BNrntat8_zlY2D3bjgCUc4ufnMjEAu_/view?usp=sharing");
        s.setImage(R.drawable.startup);
        s.setCode("MGE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("Rock Syndrome");
        s.setSummary("https://drive.google.com/file/d/19wHx6ea6OzRzS5KQuYWeNHTXnbEw3VPm/view?usp=sharing");
        s.setCode("MGE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.rock);
        events.add(s);


        s = new Technical();
        s.setTitle("MONEY BALL");
        s.setSummary("https://drive.google.com/file/d/1KAOGUS9KSxXZOb-gslDAQKqIYTis-qqh/view?usp=sharing");
        s.setCode("MGE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.money);
        events.add(s);


        s = new Technical();
        s.setTitle("YOURQUOTE OPEN MIC 2.0");
        s.setSummary("https://drive.google.com/file/d/18WQVQUcmk4YZ46KUU0aovfN7aJ3p8SQj/view?usp=sharing");
        s.setCode("MGE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.mic);
        events.add(s);


        return events;
    }
}
