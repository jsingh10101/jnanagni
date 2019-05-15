package cse.fet.gurukul.Contact;

import cse.fet.gurukul.R;

import java.util.ArrayList;


public class Contactcollection2 {

    public static ArrayList<Contact> getContact() {
        ArrayList<Contact> events = new ArrayList<>();

        Contact s = new Contact();

        s.setName("VIKASH KUMAR GUPTA");
        s.setGmail("vikashkumar220698@gmail.com");
        s.setDevelop("HEAD APP DEVELOPER");
        s.setImage(R.drawable.v2);
        s.setCall("8709124929");
        events.add(s);


        s = new Contact();
        s.setName("JAPNEET SINGH");
        s.setGmail("japneet.theultimateenlightment@gmail.com");
        s.setDevelop("LEAD APP DEVELOPER");
        s.setImage(R.drawable.paaji);
        s.setCall("7317587827");
        events.add(s);

        s = new Contact();
        s.setName("RAMAKANT SHAKYA");
        s.setGmail("ramakant0722@gmail.com");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.r);
        s.setCall("8630500420");
        events.add(s);


        s = new Contact();

        s.setName("VIKAS YADAV");
        s.setGmail("vikas090497@gmail.com");
        s.setDevelop("APP DEVELOPER");
        s.setImage(R.drawable.vikasyadav);
        s.setCall("8233081931");
        events.add(s);


        s = new Contact();

        s.setName("GYAN PRAKASH");
        s.setGmail("gyanprakash.gp98010@gmail.com");
        s.setDevelop("PHOTOSHOP EDITOR");
        s.setImage(R.drawable.gp);
        s.setCall("6202384840");
        events.add(s);


        return events;
    }
}
