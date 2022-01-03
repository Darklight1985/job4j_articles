package ru.job4j.articles.model;

import java.util.stream.IntStream;

public class IntChislo {
    public static void main(String[] args) {
        IntStream chislo = IntStream.iterate(0, i -> i < 10, i -> i + 1);
        chislo.forEach(s-> System.out.println(s));
    }
}
