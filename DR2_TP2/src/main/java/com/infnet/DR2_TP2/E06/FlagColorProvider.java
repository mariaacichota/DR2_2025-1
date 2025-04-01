package com.infnet.DR2_TP2.E06;

import java.util.*;

public class FlagColorProvider {
    public enum Nationality {
        DUTCH, GERMAN, BELGIAN, FRENCH, ITALIAN, UNCLASSIFIED
    }

    public enum Color {
        RED, WHITE, BLUE, BLACK, YELLOW, GREEN, GRAY
    }


    private static final Map<Nationality, List<Color>> flagColors = new HashMap<>();

    static {
        flagColors.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flagColors.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flagColors.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flagColors.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flagColors.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    }

    public List<Color> getFlagColors(Nationality nationality) {
        return flagColors.getOrDefault(nationality, Arrays.asList(Color.GRAY));
    }
}
