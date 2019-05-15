package cse.fet.gurukul;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import cse.fet.gurukul.About.AboutActivity;
import cse.fet.gurukul.Contact.ContactActivity;
import cse.fet.gurukul.EventDetail1.EventActivity;
import cse.fet.gurukul.Gallery.GalleryActivity;

import cse.fet.gurukul.R;

import cse.fet.gurukul.Register.LoginActivity;
import cse.fet.gurukul.Register.ProfileActivity;

import com.ramotion.expandingcollection.ECBackgroundSwitcherView;
import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class FrontActivity extends AppCompatActivity {
    SharedPreferences sp;
    private ECPagerView ecPagerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_front);
        showDialogImageCenter();

        // Get pager from layout
        ecPagerView = findViewById(R.id.ec_pager_element);
        sp = getSharedPreferences("app", MODE_PRIVATE);
        final int m = sp.getInt("id", -1);

        // Generate example dataset
        ArrayList<ECCardData> dataset = CardDataImpl.generateExampleData(m);

        // Implement pager adapter and attach it to pager view
        ECPagerViewAdapter ecPagerViewAdapter = new ECPagerViewAdapter(getApplicationContext(), dataset) {
            @Override
            public void instantiateCard(LayoutInflater inflaterService, ViewGroup head, final ListView list, ECCardData data) {
                // Data object for current card
                final CardDataImpl cardData = (CardDataImpl) data;

                // Set adapter and items to current card content list
                final List<String> listItems = cardData.getListItems();
                final CardListItemAdapter listItemAdapter = new CardListItemAdapter(getApplicationContext(), listItems);
                list.setAdapter(listItemAdapter);
                // Also some visual tuning can be done here
                list.setBackgroundColor(Color.WHITE);
                View gradient = new View(getApplicationContext());
                gradient.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));

                head.addView(gradient);

                // Inflate main header layout and attach it to header root view
                inflaterService.inflate(R.layout.list_item, head);

                TextView title = head.findViewById(R.id.list_item_text);
                title.setText(cardData.getCardTitle());


                // Card toggling by click on head element
                head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        Class z;
                        String s;
                        if (m == -1)
                            z = LoginActivity.class;
                        else
                            z = ProfileActivity.class;
                        if (m == -1)
                            s = "You are just one click away to REGISTER the greatest moment";
                        else
                            s = "You have already registered. Just go on and view your profile";
                        if (cardData.getCardTitle().equals(" Win a game without ever hurting another player")) {
                            Intent i = new Intent(FrontActivity.this, EventActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals(s)) {

                            Intent i = new Intent(FrontActivity.this, z);
                            startActivity(i);
                        }

                        if (cardData.getCardTitle().equals("Everything is real... It is good to love many things")) {
                            Intent i = new Intent(FrontActivity.this, GalleryActivity.class);
                            startActivity(i);

                        }

                        if (cardData.getCardTitle().equals("The Flare Gun’s currently only available to use")) {
                            Intent i = new Intent(FrontActivity.this, SponsorsActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("I believe that prayer is our powerful contact")) {
                            Intent i = new Intent(FrontActivity.this, ContactActivity.class);
                            startActivity(i);

                        }
                        if (cardData.getCardTitle().equals("When you start the game, you will find the map")) {
                            Intent i = new Intent(FrontActivity.this, AboutActivity.class);
                            startActivity(i);

                        }

                    }
                });
            }
        };
        ecPagerView.setPagerViewAdapter(ecPagerViewAdapter);

        // Add background switcher to pager view
        ecPagerView.setBackgroundSwitcherView((ECBackgroundSwitcherView) findViewById(R.id.ec_bg_switcher_element));

        // Directly modifying dataset
        // dataset.remove(0);
        ecPagerViewAdapter.notifyDataSetChanged();

    }

    private void showDialogImageCenter() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(true);
        ((ImageButton) dialog.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    // Card collapse on back pressed
    @Override
    public void onBackPressed() {
        if (!ecPagerView.collapse())
            super.onBackPressed();
    }
}