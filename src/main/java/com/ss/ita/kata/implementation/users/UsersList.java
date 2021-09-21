package com.ss.ita.kata.implementation.users;

import com.ss.ita.kata.Holder;
import java.util.Arrays;

public enum UsersList {
    VOLODYMYR(6, com.ss.ita.kata.implementation.Percifalll.KataHolder.getInstance());

    //  ***

    private final int number;
    private final Holder holder;

    UsersList(int number, Holder holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public Holder getHolder() {
        return holder;
    }

    public static UsersList getUserByNum(int n) {
        return Arrays.stream(UsersList.values())
                .filter(a -> a.number == n)
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
