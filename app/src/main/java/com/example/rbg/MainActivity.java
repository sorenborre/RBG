package com.example.rbg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RgbView, SeekBar.OnSeekBarChangeListener {

    TextView RValue;
    TextView RgbBox;
    RgbPresenter Presenter;
    SeekBar r_bar;
    SeekBar g_bar;
    SeekBar b_bar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RgbBox = findViewById(R.id.textView6);
        changeRgbBoxColor(0xffffffff);
        Presenter = new RgbPresenter(this);
        RValue = findViewById(R.id.r_value);
        r_bar = findViewById(R.id.r_seekbar);
        g_bar = findViewById(R.id.g_seekbar);
        b_bar = findViewById(R.id.b_seekbar);

    }

    public void changeRgbBoxColor(int colourInHex) {
        RgbBox.setBackgroundColor(colourInHex);
    }
    public void RChanged(int val){

    }
    public void onClick(View v) {

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        switch (seekBar){
            case R.id.r_seekbar:
                RgbPresenter.SetR(progress);
            case R.id.g_seekbar:
                RgbPresenter.SetG(progress);
            case R.id.b_seekbar:
                RgbPresenter.SetB(progress);
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}


