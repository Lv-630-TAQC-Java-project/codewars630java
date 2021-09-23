package com.ss.ita.kata.implementation.users;

import com.ss.ita.kata.Holder;

import java.util.Arrays;

public enum User {

	VLADYSLAV_DMYTRIV(1, "Vladyslav Dmytriv", com.ss.ita.kata.implementation.vladdmytriv.KataHolder.getInstance()),
	GRANAT_VLAD(2, "Granat Vlad", com.ss.ita.kata.implementation.VladGranat.KataHolder.getInstance()),
	HUZAR_DMITRY(3, "Huzar Dmitry", com.ss.ita.kata.implementation.ErrDmitry404.KataHolder.getInstance()),
	VOLODYMYR_KOSTYRA(4, "Volodymyr Kostyra", com.ss.ita.kata.implementation.Percifalll.KataHolder.getInstance()),
	TARAS_KRASITSKYI(5, "Krasitskyi Taras", com.ss.ita.kata.implementation.TarasKr.KataHolder.getInstance()),
	YURIY_KURIAN(6, "Kurian Yurii", com.ss.ita.kata.implementation.NyxLex.KataHolder.getInstance()),
	YEVGEN_ROMANOV(7, "Romanov Yevgen", com.ss.ita.kata.implementation.YevgenAleksandrovich.KataHolder.getInstance()),
	SYDOR_ANASTASIA(8, "Sydor Anastasia", com.ss.ita.kata.implementation.anastasia8755.KataHolder.getInstance()),
	NAZAR_YAKH(9, "Yakh Nazar", com.ss.ita.kata.implementation.NazarYakh.KataHolder.getInstance()),
	DMYTRO_ZHYVKO(10, "Zhyvko Dmytro", com.ss.ita.kata.implementation.dzhyv.KataHolder.getInstance());

	// ***
	private final int id;
	private final String name;
	private final Holder holder;

	User(int id, String name, Holder holder) {
		this.id = id;
		this.name = name;
		this.holder = holder;
	}

	public int getId() {
		return id;
	}
	public Holder getHolder() {
		return holder;
	}

	public String getName() {
		return name;
	}

	public static void print() {
		int nb = 1;
		for (User element : User.values()) {
			System.out.println("\t" + nb + ". " + element.getName());
			nb++;
		}
	}

}
