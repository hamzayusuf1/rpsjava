package com.rpsgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testCheckInput_Rock() {
        String result = Main.checkInput("Rock");
        assertEquals("You chose Rock!", result);
    }    @Test
    public void testCheckInput_Paper() {
            String result = Main.checkInput("Paper");
        assertEquals("You chose Paper!", result);
    }    @Test
    public void testCheckInput_Scissors() {
        String result = Main.checkInput("Scissors");
        assertEquals("You chose Scissors!", result);
    }





}