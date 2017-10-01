package me.huongdang.digitaldream;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
// import android.widget.EditText;
// import android.widget.TextView;


public class SetBudgets extends AppCompatActivity /*extends ActionBarActivity implements View.OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_budgets);

        Button more = (Button) findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent myIntent = new Intent(view.getContext(), agones.class);
                //startActivityForResult(myIntent, 0);


                AlertDialog alertDialog = new AlertDialog.Builder(SetBudgets.this).create(); //Read Update
                alertDialog.setTitle("Set Monthly Budget");
                alertDialog.setMessage("$ $ $");

                /*
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // here you can add functions
                    }
                });
                */
                alertDialog.show();  //<-- See This!
            }

        });
    }
}
