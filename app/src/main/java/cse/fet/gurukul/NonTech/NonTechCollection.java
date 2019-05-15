package cse.fet.gurukul.NonTech;

import cse.fet.gurukul.R;
import cse.fet.gurukul.Technical.Technical;

import java.util.ArrayList;

public class NonTechCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();
        int mx = 1;


        //s = new Technical();
        s.setTitle("LIGHT CAMERA ACTION");
        s.setSummary("https://drive.google.com/file/d/1vqPaN-Du7Fjzhc_cs4m4fJk1pmGY3Kgi/view?usp=sharing");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.light);
        events.add(s);


        s = new Technical();
        s.setTitle("FREEDOSCRAWL");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1fJjUG1kPwK_8x4HEmNpqa4ru1yCcw8nr/view?usp=sharing");
        s.setImage(R.drawable.frido);
        events.add(s);


        s = new Technical();
        s.setTitle("KALAKRITI");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1UEOopR3SweUA20orErFhRhSyFaUZGXMA/view?usp=sharing");
        s.setImage(R.drawable.kalakriti);
        events.add(s);


        s = new Technical();
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setTitle("Q-COGNITO");
        s.setSummary("https://drive.google.com/file/d/10_XIu41ApYYfQ_MJ3ih_XIgMIZSpj6UA/view?usp=sharing");
        s.setImage(R.drawable.cognito);
        events.add(s);


        s = new Technical();
        s.setTitle("CRICKET KEEDA");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1ZuLBn-_GHs4SJl1Gwvn1xnDuOhUJ3chC/view?usp=sharing");
        s.setImage(R.drawable.keeda);
        events.add(s);


        s = new Technical();
        s.setTitle("RANGOLI MAKING");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1nUwOuqsL5CCg5cD1ebB00JnXKt47iE3f/view?usp=sharing");
        s.setImage(R.drawable.rangoli);
        events.add(s);


        s = new Technical();
        s.setTitle("TREASURE HUNT");
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1vr5Km4p7M_-0Q5LDk2niQwRwXZ2WLeOZ/view?usp=sharing");
        s.setImage(R.drawable.treasure);
        events.add(s);

        s = new Technical();
        s.setTitle("THIRD-VISION");
        s.setSummary("https://drive.google.com/file/d/1RQ9OQhTERbwPHl_ITC87tV_EPPS2Q1yV/view?usp=sharing");
        s.setImage(R.drawable.third);
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);

        s = new Technical();
        s.setTitle("ABHIVYAKTI");
        s.setSummary("https://drive.google.com/file/d/196hZzxHEl8FWQfCOQmfkSmUGkxT8JDA6/view?usp=sharing");
        s.setImage(R.drawable.abhii);
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("COLLEGE DRISHYANSH");
        s.setSummary("https://drive.google.com/file/d/1pE7_ZCdEUJI01MGQqnVaCtPr0nGPqSnP/view?usp=sharing");
        s.setImage(R.drawable.college);
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("TECHNOSLIDE");
        s.setSummary("https://drive.google.com/file/d/1Q-KAsPPBvOh2ef7JZYQTlES9I69LrE8P/view?usp=sharing");
        s.setImage(R.drawable.slide);
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("THE YOUNG JOURNO COMPETION");
        s.setSummary("https://drive.google.com/file/d/1MVPYmP7ETdW1Q8r49JrC8TG-jBYF8DOY/view?usp=sharing");
        s.setImage(R.drawable.young);
        s.setCode("NTE" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        return events;
    }
}

