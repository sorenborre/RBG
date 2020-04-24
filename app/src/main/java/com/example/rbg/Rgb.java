package com.example.rbg;

import java.util.ArrayList;
import java.util.List;

public class Rgb implements HexObservable {

    String hex;
    private int r = 0;
    private int g = 0;
    private int b = 0;
    private List<HexObserver> hexObservers;

    public Rgb() {
        hexObservers = new ArrayList<>();
    }

    public void setR(int value) {
        r = value;
        setHexColor();
    }

    public void setG(int value) {
        g = value;
        setHexColor();
    }

    public void setB(int value) {
        b = value;
        setHexColor();
    }

    public void setHexColor() {
        hex = String.format("#%02x%02x%02x", r, g, b);
        notifyObservers();
    }

    @Override
    public void addObserver(HexObserver observer) {
        hexObservers.add(observer);
    }

    @Override
    public void removeObserver(HexObserver observer) {
        if (hexObservers.contains(observer))
            hexObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (HexObserver o : hexObservers) {
            o.onchange(hex);
        }
    }
}
