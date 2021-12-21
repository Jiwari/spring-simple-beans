package com.github.jiwari.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
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
