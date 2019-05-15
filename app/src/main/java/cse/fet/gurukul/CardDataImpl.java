package cse.fet.gurukul;

import android.util.Log;

import cse.fet.gurukul.R;

import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;

public class CardDataImpl implements ECCardData<String> {

    private String cardTitle;
    private Integer mainBackgroundResource;
    private Integer headBackgroundResource;
    private ArrayList<String> listItems;
    //private static SharedPreferences sp;

    public CardDataImpl(String cardTitle, Integer mainBackgroundResource, Integer headBackgroundResource) {
        this.mainBackgroundResource = mainBackgroundResource;
        this.headBackgroundResource = headBackgroundResource;

        this.cardTitle = cardTitle;
    }

   /* public static void setSp(SharedPreferences sp) {
        CardDataImpl.sp = sp;
    }*/

    public static ArrayList<ECCardData> generateExampleData(int m) {
        ArrayList<ECCardData> list = new ArrayList<>();
        //sp= PreferenceManager.getDefaultSharedPreferences(MainActivity.getC());
        Log.v("code", "" + m);
        String s;
        if (m == -1)
            s = "You are just one click away to REGISTER the greatest moment";
        else
            s = "You have already registered. Just go on and view your profile";

        list.add(new CardDataImpl(" Win a game without ever hurting another player", R.drawable.vkg4, R.drawable.ep));
        list.add(new CardDataImpl(s, R.drawable.vkg, R.drawable.rp));

        list.add(new CardDataImpl("Everything is real... It is good to love many things", R.drawable.gal, R.drawable.gala));
        list.add(new CardDataImpl("The Flare Gun’s currently only available to use", R.drawable.flare, R.drawable.spon));
        list.add(new CardDataImpl("I believe that prayer is our powerful contact", R.drawable.contactus1, R.drawable.contactus));
        list.add(new CardDataImpl("When you start the game, you will find the map", R.drawable.drop, R.drawable.at));


        return list;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }

    @Override
    public ArrayList<String> getListItems() {
        return listItems;
    }

    public String getCardTitle() {
        return cardTitle;
    }


}