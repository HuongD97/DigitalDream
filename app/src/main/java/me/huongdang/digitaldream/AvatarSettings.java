package me.huongdang.digitaldream;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class AvatarSettings extends AppCompatActivity {
    private Button saveAvatar;
    private Button playGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_settings);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        saveAvatar = (Button) findViewById(R.id.button5);
        playGame = (Button) findViewById(R.id.button10);


        saveAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnHome();
            }
        });

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchGame();
            }
        });

    }

    private void returnHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void launchGame() {
        Intent intentGame = new Intent(this, avatarGameScreen.class);
        startActivity(intentGame);
        finish();
    }
}
