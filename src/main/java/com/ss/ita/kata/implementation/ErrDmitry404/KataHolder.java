package com.ss.ita.kata.implementation.ErrDmitry404;

import com.ss.ita.kata.*;

public class KataHolder extends Holder {
    private static KataHolder holder;

    private KataHolder() {
        eight = new EightImpl();
        seven = new SevenImpl();
        six = new SixImpl();
        five = new FiveImpl();
    }

    public static KataHolder getInstance() {
        if (holder == null) return holder = new KataHolder();
        else return holder;
    }

    @Override
    public Eight getEightImpl() {
        return eight;
    }

    @Override
    public Seven getSevenImpl() {
        return seven;
    }

    @Override
    public Six getSixImpl() {
        return six;
    }

    @Override
    public Five getFiveImpl() {
        return five;
    }
}
