package com.rpsgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class MainTest {
    @Test
    public void testCheckInput_Rock() {
        String result = Main.checkInput("Rock");
        assertEquals("You chose Rock!", result);
    }

    @Test
    public void testCheckInput_Paper() {
        String result = Main.checkInput("Paper");
        assertEquals("You chose Paper!", result);
    }

    @Test
    public void testCheckInput_Scissors() {
        String result = Main.checkInput("Scissors");
        assertEquals("You chose Scissors!", result);
    }

    @Test
    public void testCheckReturn() {
        boolean result = Main.checkMatch("Rock");
        List<Boolean> expectedOutcomes = Arrays.asList(true, false);
        assertTrue(expectedOutcomes.contains(result));
    }



}