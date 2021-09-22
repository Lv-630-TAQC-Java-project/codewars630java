package com.ss.ita.kata.implementation.users;

import com.ss.ita.kata.Holder;

import java.util.Arrays;

public enum User {
    
	VLADYSLAV_DMYTRIV ("Vladyslav Dmytriv", com.ss.ita.kata.implementation.vladdmytriv.KataHolder.getInstance()),
	GRANT_VLAD("Grand Vlad", com.ss.ita.kata.implementation.VladGranat.KataHolder.getInstance()),
	HUZAR_DNITRY("Huzar Dmitry", com.ss.ita.kata.implementation.ErrDmitry404.KataHolder.getInstance()),
	VOLODYMYR_KOSTYRA("Volodymyr Kostyra", com.ss.ita.kata.implementation.Percifalll.KataHolder.getInstance()),
	TARAS_KRASITSKYI("Krasitskyi Taras", com.ss.ita.kata.implementation.TarasKr.KataHolder.getInstance()),
	YURIY_KURIAN("Kurian Yurii", com.ss.ita.kata.implementation.NyxLex.KataHolder.getInstance()),
	YEVGEN_ROMANOV("Romanov Yevgen", com.ss.ita.kata.implementation.YevgenAleksandrovich.KataHolder.getInstance()),
	SYDOR_ANASTASIA("Sydor Anastasia", com.ss.ita.kata.implementation.anastasia8755.KataHolder.getInstance()),
	NAZAR_YAKH("Yakh Nazar", com.ss.ita.kata.implementation.NazarYakh.KataHolder.getInstance()),
	DMYTRO_ZHYVKO("Zhyvko Dmytro", com.ss.ita.kata.implementation.dzhyv.KataHolder.getInstance());

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
