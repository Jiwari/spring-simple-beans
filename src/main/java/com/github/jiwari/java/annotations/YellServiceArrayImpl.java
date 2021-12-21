package com.github.jiwari.java.annotations;

import java.util.Random;

public class YellServiceArrayImpl implements YellService {

    private final Random random = new Random();
    private final String[] yells = {
            "NEVER GIVE UP!",
            "YOU MISS 100% OF THE SHOTS YOU DON'T TAKE",
            "EAT YOUR VEGETABLES"
    };

    @Override
    public String yell() {
        return yells[random.nextInt(yells.length)];
    }
}
