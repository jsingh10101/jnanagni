package cse.fet.gurukul.Sport;

import cse.fet.gurukul.R;
import cse.fet.gurukul.Technical.Technical;

import java.util.ArrayList;

public class SportCollection {


    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();
        int mx = 1;

        s.setTitle("BADMINTON");
        s.setSummary("https://drive.google.com/file/d/1PanCLAubri5yIc6SM2HyVqtWkdhbU60M/view?usp=sharing");
        s.setCode("SPE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.badmintan);
        events.add(s);


        s = new Technical();
        s.setTitle("CHESS");
        s.setSummary("https://drive.google.com/file/d/1e0vWN3HqHll_3_Q-TWj3I8WyI5Qbqf8g/view?usp=sharing");
        s.setCode("SPE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.chess);
        events.add(s);

        s = new Technical();
        s.setTitle("VOLLEYBALL");
        s.setSummary("https://drive.google.com/file/d/1x7ccu_HEH9HDzG8oEOJJbxzxDHlo11jQ/view?usp=sharing");
        s.setCode("SPE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.volly);
        events.add(s);

        s = new Technical();
        s.setTitle("CARROM");
        s.setCode("SPE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1Ff_z_4cIyKsW63jp5qghjawXFr3mtHY2/view?usp=sharing");
        s.setImage(R.drawable.carrom);
        events.add(s);

        s = new Technical();
        s.setTitle("TABLE TENNIS");
        s.setCode("SPE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1VA1T3xKeDjGvje3AayKpu5z2bR5xUjmF/view?usp=sharing");
        s.setImage(R.drawable.table);
        events.add(s);


        return events;
    }
}
