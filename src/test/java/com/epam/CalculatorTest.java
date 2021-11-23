package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    Calculator calculator= new Calculator();

    //////////////////////////////////////////////////////////////
    @Test
    public void testAddShouldAddWhenNumbersPositive()
    {   int result = calculator.add(5,9);
        assertEquals(14, result);
        
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative()
    {   int result = calculator.add(-5,-9);
        assertEquals(-14, result);
    }

    @Test
    public void testAddShouldAddWhenNumbersOfDifferentSigns()
    {   int result = calculator.add(-5,9);
        assertEquals(4, result);
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative()
    {   int result = calculator.subtract(-5,-9);
        assertEquals(4, result); 
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive()
    {   int result = calculator.subtract(5,9);
        assertEquals(-4, result);
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersOfDifferentSigns()
    {   int result = calculator.subtract(-5,9);
        assertEquals(-14, result);   
    }
    ////////////////////////////////////////////////
    @Test
    public void testMultShouldMultipliсateWhenNumbersOfDifferentSigns()
    {   int result = calculator.multiplicate(-5,9);
        assertEquals(-45, result);
    }

    @Test
    public void testMultShouldMultipliсateWhenNumbersPositive()
    {   int result = calculator.multiplicate(5,9);
        assertEquals(45, result);
    }

    @Test
    public void testMultShouldMultipliсateWhenNumbersNegative()
    {   int result = calculator.multiplicate(-5,-9);
        assertEquals(45, result);
    }

    ///////////////////////////////////
    @Test
    public void testDivShouldDivideWhenNumbersNegative()
    {   int result = calculator.divide(-45,-9);
        assertEquals(5, result);
    }
    @Test
    public void testDivShouldDivideWhenNumbersOfDifferentSigns()
    {   int result = calculator.divide(-45,9);
        assertEquals(-5, result);
    }
    @Test
    public void testDivShouldDivideWhenNumbersPositive()
    {   int result = calculator.divide(45,9);
        assertEquals(5, result);  
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(6,0);
    }
}
