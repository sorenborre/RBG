package com.example.rbg;

import java.util.List;

public interface HexObservable {
    void addObserver(HexObserver hexObserver);
    void removeObserver(HexObserver hexObserver);
    void notifyObservers();
}
