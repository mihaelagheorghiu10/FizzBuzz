package com.accenture.kata1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testcuandoSeaMultiploPor3DevuelveFizz() {
        //GIVEN
        var fizzBuzz = new FizzBuzz();
        //acabamos de instanciar esta clase con palabra reservada new
        //WHEN
        var exec = fizzBuzz.execute(3);

        //THEN
        assertEquals("Fizz", exec);
    }

    @Test
    void testcuandoSeaMultiploDe5DevuelveFizz() {
        var fizzBuzz = new FizzBuzz();
        var exect = fizzBuzz.execute(5);
        assertEquals("Buzz", exect);
    }
    @Test
    void testParaNúmerosMúltiplosDeTresYCincoDevuelvaFizzBuzz(){
        var fizzBuzz = new FizzBuzz();
        var ex = fizzBuzz.execute(45);
        assertEquals( "FizzBuzz",ex);
    }
    @Test
    void testCuandoNoSeaMultiploDe3Y5DevuelveElMismoNumero(){
        var fizzBuzz = new FizzBuzz();
        var ex = fizzBuzz.execute(13);
        assertEquals( "13",ex);
    }
}
