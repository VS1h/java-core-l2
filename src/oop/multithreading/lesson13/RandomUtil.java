package oop.multithreading.lesson13;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int DEFAULT_BOUND = 5;

    private RandomUtil() {
    }

    public static int getRandom() {
        return RANDOM.nextInt(DEFAULT_BOUND);
    }
}
