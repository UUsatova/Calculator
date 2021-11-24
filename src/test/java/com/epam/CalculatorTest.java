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
    {   int calculationResult  = calculator.add(5,9);
        assertEquals(14, calculationResult );
        
    }

    @Test
    public void testAddShouldAddWhenNumbersNegative()
    {   int calculationResult  = calculator.add(-5,-9);
        assertEquals(-14, calculationResult );
    }

    @Test
    public void testAddShouldAddWhenNumbersOfDifferentSigns()
    {   int calculationResult  = calculator.add(-5,9);
        assertEquals(4, calculationResult );
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testSubtractShouldSubtractWhenNumbersNegative()
    {   int calculationResult  = calculator.subtract(-5,-9);
        assertEquals(4, calculationResult ); 
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersPositive()
    {   int calculationResult = calculator.subtract(5,9);
        assertEquals(-4, calculationResult );
    }

    @Test
    public void testSubtractShouldSubtractWhenNumbersOfDifferentSigns()
    {   int calculationResult = calculator.subtract(-5,9);
        assertEquals(-14, calculationResult );   
    }
    ////////////////////////////////////////////////
    @Test
    public void testMultipliсateShouldMultipliсateWhenNumbersOfDifferentSigns()
    {   var calculationResult  = calculator.multiplicate(-5,9);
        assertEquals(-45, calculationResult );
    }

    @Test
    public void testMultipliсateShouldMultipliсateWhenNumbersPositive()
    {   int calculationResult  = calculator.multiplicate(5,9);
        assertEquals(45, calculationResult );
    }

    @Test
    public void testMultipliсateShouldMultipliсateWhenNumbersNegative()
    {   int calculationResult  = calculator.multiplicate(-5,-9);
        assertEquals(45, calculationResult );
    }

    ///////////////////////////////////
    @Test
    public void testDivShouldDivideWhenNumbersNegative()
    {   int calculationResult  = calculator.divide(-45,-9);
        assertEquals(5, calculationResult );
    }
    @Test
    public void testDivShouldDivideWhenNumbersOfDifferentSigns()
    {   int calculationResult  = calculator.divide(-45,9);
        assertEquals(-5, calculationResult );
    }
    @Test
    public void testDivShouldDivideWhenNumbersPositive()
    {   int calculationResult  = calculator.divide(45,9);
        assertEquals(5, calculationResult );  
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(6,0);
    }
}
