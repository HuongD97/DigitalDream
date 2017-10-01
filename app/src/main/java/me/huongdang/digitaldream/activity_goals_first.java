package me.huongdang.digitaldream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class activity_goals_first extends AppCompatActivity {

    private Button goToNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_first);

        goToNext = (Button) findViewById(R.id.button7);

        goToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchGoalsPage();
            }
        });
    }

    private void launchGoalsPage() {
        Intent intent = new Intent(this, activity_goals_next.class);
        startActivity(intent);
        finish();
    }
}
