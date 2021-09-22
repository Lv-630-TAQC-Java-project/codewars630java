package com.ss.ita.kata;

import com.ss.ita.kata.implementation.Percifalll.KataHolder;

public abstract class Holder {
    protected Eight eight;
    protected Seven seven;
    protected Six six;
    protected Five five;

    public abstract Eight getEightImpl();

    public abstract  Seven getSevenImpl();

    public abstract Six getSixImpl();

    public abstract Five getFiveImpl();
}
