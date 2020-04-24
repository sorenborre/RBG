package com.example.rbg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RgbView, SeekBar.OnSeekBarChangeListener {

    TextView RValue;
    TextView GValue;
    TextView BValue;
    TextView RgbBox;
    RgbPresenter Presenter;
    SeekBar r_bar;
    SeekBar g_bar;
    SeekBar b_bar;
    TextView HexValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RgbBox = findViewById(R.id.textView6);
        Presenter = new RgbPresenter(this);
        RValue = findViewById(R.id.r_value);
        GValue = findViewById(R.id.g_value);
        BValue = findViewById(R.id.b_value);
        HexValue = findViewById(R.id.hex_value);

        r_bar = findViewById(R.id.r_seekbar);
        g_bar = findViewById(R.id.g_seekbar);
        b_bar = findViewById(R.id.b_seekbar);
        r_bar.setOnSeekBarChangeListener(this);
        g_bar.setOnSeekBarChangeListener(this);
        b_bar.setOnSeekBarChangeListener(this);

        RValue.setText("0");
        GValue.setText("0");
        BValue.setText("0");
        HexValue.setText("#000000");
        RgbBox.setBackgroundColor(Color.parseColor("#000000"));
    }

    public void changeRgbBoxColor(String colourInHex) {
        RgbBox.setBackgroundColor(Color.parseColor(colourInHex));
        HexValue.setText(colourInHex);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        if (seekBar.getId() == R.id.r_seekbar) {
            Presenter.SetR(progress);
            RValue.setText(String.valueOf(progress));
        }
        if (seekBar.getId() == R.id.g_seekbar) {
            Presenter.SetG(progress);
            GValue.setText(String.valueOf(progress));
        }
        if (seekBar.getId() == R.id.b_seekbar) {
            Presenter.SetB(progress);
            BValue.setText(String.valueOf(progress));
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}


