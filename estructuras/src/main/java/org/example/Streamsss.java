package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsss {

    public static void main(String[] args) {

        List<String> coches = new ArrayList<>(Arrays.asList("Ford","Audi","Renault","Skoda","Mitsubushi"));

        Stream<String> streamito = Stream.of("Ford","Citroen");

        long num = coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>3)
                .map(String::toUpperCase)
                .count();
        System.out.println(num);

    }
}
