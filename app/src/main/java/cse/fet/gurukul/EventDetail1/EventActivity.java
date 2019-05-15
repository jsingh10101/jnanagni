package cse.fet.gurukul.EventDetail1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;
import cse.fet.gurukul.Common.Common;
import cse.fet.gurukul.Cultural.CulturalActivity;
import cse.fet.gurukul.Game.GameActivity;
import cse.fet.gurukul.MegaEvent.MegaActivity;
import cse.fet.gurukul.Model.GameEntity;
import cse.fet.gurukul.NonTech.NonTechActivity;
import cse.fet.gurukul.R;
import cse.fet.gurukul.Sport.SportActivity;
import cse.fet.gurukul.Technical.TechnicalActivity;
import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class EventActivity extends AppCompatActivity {


    private FeatureCoverFlow mCoverFlow;
    private CoverFlowAdapter mAdapter;

    private TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR); //will hide the title

        getSupportActionBar().hide(); // hide the title bar


        setContentView(R.layout.activity_event);
        if (Common.mData.size() == 0)
            initData();


        mTitle = findViewById(R.id.title);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(EventActivity.this);
                TextView textView = (TextView) inflater.inflate(R.layout.item_title, null);
                return textView;
            }
        });


        mAdapter = new CoverFlowAdapter(Common.mData, this);

        mCoverFlow = (findViewById(R.id.coverflow));
        mCoverFlow.setAdapter(mAdapter);
        mCoverFlow.fling(-4, 0);


        mCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (id == 0) {

                    Intent intent = new Intent(EventActivity.this, SportActivity.class);

                    startActivity(intent);

                }


                if (id == 1) {
                    Intent intent = new Intent(EventActivity.this, GameActivity.class);

                    startActivity(intent);
                }
                if (id == 2) {
                    Intent intent = new Intent(EventActivity.this, MegaActivity.class);

                    startActivity(intent);
                }

                if (id == 3) {
                    Intent intent = new Intent(EventActivity.this, TechnicalActivity.class);

                    startActivity(intent);
                }


                if (id == 4) {
                    Intent intent = new Intent(EventActivity.this, NonTechActivity.class);

                    startActivity(intent);
                }


                if (id == 5) {
                    Intent intent = new Intent(EventActivity.this, CulturalActivity.class);

                    startActivity(intent);
                }

            }
        });

        mCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(Common.mData.get(position).getTitle());
            }

            @Override
            public void onScrolling() {
                mTitle.setText("");
            }
        });

    }

    private void initData() {
        try {


            Common.mData.add(new GameEntity(R.drawable.p4, "SPORTS", "SPORTS"));
            Common.mData.add(new GameEntity(R.drawable.vkg5, "GAMES", "GAMES"));
            Common.mData.add(new GameEntity(R.drawable.gal, "MEGA-EVENTS", "MEGA-EVENTS"));


            Common.mData.add(new GameEntity(R.drawable.vkg4, "TECHNICAL", "TECHNICAL"));
            Common.mData.add(new GameEntity(R.drawable.vkg, "NON-TECH", "NON-TECH"));
            Common.mData.add(new GameEntity(R.drawable.p1, "CULTURAL", "CULTURAL"));
        } catch (Exception e) {

        }
    }


}

