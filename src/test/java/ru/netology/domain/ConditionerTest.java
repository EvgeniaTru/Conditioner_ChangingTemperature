package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldCheckCorrectCurrentTemp() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(45);
        assertEquals (0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(29);
        int tempBeforeIncreasing = conditioner.getCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(tempBeforeIncreasing + 1, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldnNotIncreaseMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(30);
        int tempBeforeIncreasing = conditioner.getCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(tempBeforeIncreasing, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(21);
        int tempBeforeDecreasing = conditioner.getCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(tempBeforeDecreasing - 1, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(17);
        conditioner.setCurrentTemperature(17);
        int tempBeforeDecreasing = conditioner.getCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(tempBeforeDecreasing, conditioner.getCurrentTemperature());
    }

}