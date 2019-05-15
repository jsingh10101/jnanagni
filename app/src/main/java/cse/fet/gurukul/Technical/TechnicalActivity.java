package cse.fet.gurukul.Technical;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

import cse.fet.gurukul.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TechnicalActivity extends AppCompatActivity {
    Window window;
    private RecyclerView TechnicalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_technical);

        if (Build.VERSION.SDK_INT >= 22) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.status_bar));
        }

        TechnicalList = findViewById(R.id.TechnicalDetail);
        TechnicalList.setHasFixedSize(true);
        TechnicalList.setLayoutManager(new LinearLayoutManager(this));
        TechnicalList.setAdapter(new TechnicalAdapter(this, TechnicalCollection.getTechnical()));
    }

}
