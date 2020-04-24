package com.example.rbg;

public class RgbPresenter implements HexObserver {
    Rgb rgb;
    RgbView view;

    public RgbPresenter(RgbView view) {
        rgb = new Rgb();
        this.view = view;
        rgb.addObserver(this);
    }
    public void SetR(int progress) {
        rgb.setR(progress);
    }
    public void SetG(int progress) {
        rgb.setG(progress);
    }
    public void SetB(int progress) {
        rgb.setB(progress);
    }
    @Override
    public void onchange(String hex) {
        view.changeRgbBoxColor(hex);
    }
}
