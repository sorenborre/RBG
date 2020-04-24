package com.example.rbg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RgbView {


    TextView RgbBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RgbBox = findViewById(R.id.textView6);
        changeRgbBoxColor(0xffffffff);
    }

    public void changeRgbBoxColor(int color) {
        RgbBox.setBackgroundColor(color);

    }

    public void onClick(View v) {
        if (r.isPlaying()){
            r.stop();

        }

        if (v.getId() == R.id.soft_boiled) {
            presenter.timerSetup("soft");
        }
        else if (v.getId() == R.id.medium_boiled){
            presenter.timerSetup("medium");
        }
        else if (v.getId() == R.id.hard_boiled){
            presenter.timerSetup("hard");
        }
        else if (v.getId() == R.id.start_timer) {
            presenter.start();
        }
        else if (v.getId() == R.id.stop) {
            presenter.stop();
        }
    }

}
