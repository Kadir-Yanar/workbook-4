package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    @Test
    void add() {
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.add(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);
    }

    @Test
    void subtract() {
        // arrange
        int firstNumber = 6;
        int secondNumber = 4;
        int expectedResult = 2;
        Calculator calc = new Calculator();
        // act
        int actualFunctionResult = calc.subtract(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult);
    }


}