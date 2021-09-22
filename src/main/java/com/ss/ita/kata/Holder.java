package com.ss.ita.kata;

public abstract class Holder {
    protected Eight eight;
    protected Seven seven;
    protected Six six;
    protected Five five;

    protected Holder() {
    }

    public abstract Eight getEightImpl();

    public abstract Seven getSevenImpl();

    public abstract Six getSixImpl();

    public abstract Five getFiveImpl();
}
