package com.ss.ita.kata.implementation.users;

import com.ss.ita.kata.Holder;

import java.util.Arrays;

public enum UsersList {
    VOLODYMYR(6, "Volodymyr Kostyra", com.ss.ita.kata.implementation.Percifalll.KataHolder.getInstance());

    //  ***

    private final int number;
    private final String name;
    private final Holder holder;

    UsersList(int number, String name, Holder holder) {
        this.number = number;
        this.name = name;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public Holder getHolder() {
        return holder;
    }

    public String getName() {
        return name;
    }

    public static UsersList getUserByNum(int n) {
        return Arrays.stream(UsersList.values())
                .filter(a -> a.number == n)
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
