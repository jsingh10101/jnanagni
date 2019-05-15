package cse.fet.gurukul.Game;

import cse.fet.gurukul.R;
import cse.fet.gurukul.Technical.Technical;

import java.util.ArrayList;

public class GameCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();
        int mx = 1;
        s = new Technical();
        s.setTitle("COUNTER STRIKE");
        s.setSummary("https://drive.google.com/file/d/1F0iz3PpiKhQ_9GOGc3-u4EMUlXTitIdW/view?usp=sharing");
        s.setImage(R.drawable.counter);
        s.setCode("LGE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("NFS");
        s.setCode("LGE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1XIVTBgr0DjT-sN9W7uuGV7dg1zjXPvlk/view?usp=sharing");
        s.setImage(R.drawable.nfs);
        events.add(s);


        return events;
    }
}
