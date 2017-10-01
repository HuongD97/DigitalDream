package me.huongdang.digitaldream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_goals_next extends AppCompatActivity {

    private Button goBackHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_next);

        goBackHome = (Button) findViewById(R.id.button5);

        goBackHome.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick (View view) {
               finish();
           }
        });
    }
}
