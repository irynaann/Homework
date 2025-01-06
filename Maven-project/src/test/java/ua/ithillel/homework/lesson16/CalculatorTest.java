package ua.ithillel.homework.lesson16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void add (){
        //give
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(2,3);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void subtract (){
        //give
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(8,3);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void multiply (){
        //give
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(2,5);
        //then
        Assertions.assertEquals(10, result);
    }
    @Test
    void divide (){
        //give
        Calculator calculator = new Calculator();
        //when
        int result = calculator.divide(3,3);
        //then
        Assertions.assertEquals(1, result);
    }
}