package com.raj1.edit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox read, dance, sleep;
    TextView txt;
    String BOX = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read = findViewById(R.id.read);
        dance = findViewById(R.id.dance);
        sleep = findViewById(R.id.sleep);
        txt = findViewById(R.id.txt);

        if (read.isChecked()) {

            BOX += "reading";
            txt.setText("" + BOX);

        }

        if (dance.isChecked()) {

            BOX += "dance";
            txt.setText("" + BOX);

        }

        if (sleep.isChecked()) {

            BOX += "sleep";
            txt.setText("" + BOX);
        }

        Toast.makeText(this, ""+BOX, Toast.LENGTH_SHORT).show();
    }
}