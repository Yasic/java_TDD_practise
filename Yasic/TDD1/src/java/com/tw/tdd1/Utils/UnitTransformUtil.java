package com.tw.tdd1.Utils;

/**
 * Created by yasic on 16-7-2.
 */
public class UnitTransformUtil {
    private static final int BASEUNIT = 1;
    private static final int INCHUNIT = BASEUNIT;
    private static final int FEETUNIT = BASEUNIT * 12;

    private UnitTransformUtil(){
    }

    public static int getBASEUNIT() {
        return BASEUNIT;
    }

    public static int getINCHUNIT() {
        return INCHUNIT;
    }

    public static int getFEETUNIT() {
        return FEETUNIT;
    }
}
