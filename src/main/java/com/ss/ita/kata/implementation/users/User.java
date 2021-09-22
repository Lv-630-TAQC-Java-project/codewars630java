package com.ss.ita.kata.implementation.users;

import com.ss.ita.kata.Holder;

import java.util.Arrays;

public enum User {
    VOLODYMYR("Volodymyr Kostyra", com.ss.ita.kata.implementation.Percifalll.KataHolder.getInstance());

    //  ***

    private final String name;
    private final Holder holder;

    User(String name, Holder holder) {
        this.name = name;
        this.holder = holder;
    }

    public Holder getHolder() {
        return holder;
    }

    public String getName() {
        return name;
    }
}
