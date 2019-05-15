package cse.fet.gurukul.Technical;


import cse.fet.gurukul.R;

import java.util.ArrayList;

public class TechnicalCollection {

    public static ArrayList<Technical> getTechnical() {
        ArrayList<Technical> events = new ArrayList<>();

        Technical s = new Technical();
        int mx = 1;
        s.setTitle("APPDIE");
        s.setSummary("https://drive.google.com/file/d/1HGd6vw88vsOSB1QXl1BzvehosZAtElmL/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.app);
        events.add(s);


        s = new Technical();
        s.setTitle("CIPHER");
        s.setSummary("https://drive.google.com/file/d/1x9tCwvfI1pBlahYtENQBrSCmIOy9fmiT/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.decipher);
        events.add(s);


        s = new Technical();
        s.setTitle("ELECTRICIO");
        s.setSummary("https://drive.google.com/file/d/1wYXT5CGOD6c299dz52SN0NzCemlDCllZ/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.electrial);
        events.add(s);


        s = new Technical();
        s.setTitle("EXGESIS");
        s.setSummary("https://drive.google.com/file/d/1zM5iPfKeCxw6B0QrcKNB3CsehkSSidQb/view?usp=sharing");
        s.setImage(R.drawable.circuit);
        events.add(s);
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));


        s = new Technical();
        s.setTitle("HYDRORISER");
        s.setSummary("https://drive.google.com/file/d/0B8GBGD15aQovN2ZaaHZoV2xiMXlkaWREMmZxWHNoQnNiVTNZ/view?usp=sharing");
        s.setImage(R.drawable.hd);
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("LINE FOLLOWER");
        s.setSummary("https://drive.google.com/file/d/1rl5OOV3Ds18ufsyo8SIQ79TXsFPSPxE0/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.line);
        events.add(s);


        s = new Technical();
        s.setTitle("NOPC");

        s.setSummary("https://drive.google.com/file/d/1Gs5jk9zD8kqY--rdW38VOI-XXh8w6TuA/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.n1);
        events.add(s);

        s = new Technical();
        s.setTitle("ROBO SOCCER");
        s.setSummary("https://drive.google.com/file/d/12Q9f-Hwvbh0manKoUx5bD9E1a2X-MNSg/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.robo);
        events.add(s);


        s = new Technical();
        s.setTitle("ROBO RACE");
        s.setSummary("https://drive.google.com/file/d/14pA4FGCJDA1gY1IeJghzghmmEE08H_wT/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.race);
        events.add(s);

        s = new Technical();
        s.setTitle("TOWER MAKING");
        s.setSummary("https://drive.google.com/file/d/11CJOPm5GLOLAJCdBK0C_cp49UrOhO3TS/view?usp=sharing");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setImage(R.drawable.tower);
        events.add(s);


        s = new Technical();
        s.setTitle("WEB-ER");
        s.setSummary("https://drive.google.com/file/d/14RyCVkwdYHw5Z30G5V5V8Pg4YCuRSBq3/view?usp=sharing");
        s.setImage(R.drawable.web);
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        events.add(s);


        s = new Technical();
        s.setTitle("TINKERER");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/15O3q8p3D16ziUjkOhmJUSCyu2L36SDEM/view?usp=sharing");

        s.setImage(R.drawable.tinkerer);
        events.add(s);


        s = new Technical();
        s.setTitle("BRAIN BUZZERS");
        s.setCode("TEC" + (mx < 10 ? "0" + mx++ : mx++));
        s.setSummary("https://drive.google.com/file/d/1sL-taw40jrd2PkrRiZJA1xa64VuFVv5Y/view?usp=sharing");

        s.setImage(R.drawable.bs);
        events.add(s);


        return events;
    }
}
