package me.huongdang.digitaldream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button launchBudgetsActivity;
    private Button launchGoalsActivity;
    private Button launchAvatarActivity;
    // private Button launchGameActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchBudgetsActivity = (Button) findViewById(R.id.button5);
        launchGoalsActivity = (Button) findViewById(R.id.button9);
        launchAvatarActivity = (Button) findViewById(R.id.button8);

        launchBudgetsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchBudgetsActivity();
            }
        });

        launchGoalsActivity.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                launchGoalsActivity();
            }

        });

        launchAvatarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchAvatarActivity();
            }
        });
    }

    private void launchBudgetsActivity() {
        Intent intent = new Intent(this, SetBudgets.class);
        startActivity(intent);
    }

    private void launchGoalsActivity() {
        Intent intent = new Intent(this, activity_goals_first.class);
        startActivity(intent);
    }

    private void launchAvatarActivity() {
        Intent intent = new Intent(this, AvatarSettings.class);
        startActivity(intent);
    }
}
