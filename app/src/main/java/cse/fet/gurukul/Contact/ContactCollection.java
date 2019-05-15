package cse.fet.gurukul.Contact;

import cse.fet.gurukul.R;

import java.util.ArrayList;


public class ContactCollection {

    public static ArrayList<Contact> getContact() {
        ArrayList<Contact> events = new ArrayList<>();

        Contact s = new Contact();

        s.setName("SHIVENDRA SINGH");
        s.setGmail("shivendrasrinatesingh@gmail.com");
        s.setImage(R.drawable.pic5);
        s.setCall("7355309658");
        events.add(s);

        s = new Contact();
        s.setName("SUMAN KUMAR");
        s.setGmail("77spartann@gmail.com");
        s.setImage(R.drawable.pic3);
        s.setCall("8877093019");
        events.add(s);


        s = new Contact();
        s.setName("ASHUTOSH SAHU");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.shau);
        s.setCall("8960580317");
        events.add(s);

        s = new Contact();

        s.setName("VIKAS GUPTA");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.vikas);
        s.setCall("9575614238");
        events.add(s);

        s = new Contact();

        s.setName("KISHAN KESHARI");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.krishan);
        s.setCall("9580710912");
        events.add(s);

        s = new Contact();

        s.setName("ANIMESH SINHA");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.animesh);
        events.add(s);


        s = new Contact();

        s.setName("SHUBHAM KUMAR");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.s);
        s.setCall("8544212156");
        events.add(s);

        s = new Contact();

        s.setName("SHUBHAM RAJ");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.raj);
        s.setCall("7906935360");
        events.add(s);
        s = new Contact();

        s.setName("RAHUL KATIYAR");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.pic4);
        s.setCall("9149240708");
        events.add(s);


        s = new Contact();

        s.setName("DEVANSHU MISHRA");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.mishra);
        s.setCall("9650866635");
        events.add(s);

        s = new Contact();

        s.setName("KRISHNA");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.mast);
        s.setCall("7060178208");
        events.add(s);

        s = new Contact();

        s.setName("HIMANSHU RANJAN");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.ranjan);
        s.setCall("7261027422");
        events.add(s);

        s = new Contact();

        s.setName("SAURABH SINGH");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.saurabh);
        s.setCall("8923023223");
        events.add(s);

        s = new Contact();

        s.setName("ABHIRAJ SRIVASTAVA");
        s.setGmail("jnanagni@gkv.ac.in");
        s.setImage(R.drawable.abhi);
        s.setCall("8650398208");
        events.add(s);


        return events;
    }
}
