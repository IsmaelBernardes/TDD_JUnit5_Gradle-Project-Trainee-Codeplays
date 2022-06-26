package com.example.tdd.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  
  private Calculator calculator = new Calculator();
  
  @Test
  public void should_return_zero_when_no_value_where_given() {
    
    double sum = calculator.sum();
    
    assertEquals(0, sum);
  }

  @Test
  public void should_return_the_sum_of_given_values() {
    
    double sum = calculator.sum(1, 1, 1, 1, 1, 1, 1);

    assertEquals(7, sum);
  }

  @Test
  public void should_throw_an_exception_when_the_given_number_where_then_zero() {
    
    IllegalArgumentException exption = assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

    assertEquals("Não existe raíz quadrada real para números negativos", exption.getMessage());
  }

  @Test
  public void should_return_the_square_Root_of_given_number() {
    
    double squareRoot = calculator.squareRoot(9);

    assertEquals(3, squareRoot);
  }

  @Test
  public void should_return_true_when_the_given_number_is_odd() {
    
    boolean isOdd = calculator.isOdd(5);

    assertTrue(isOdd);
  }

  @Test
  public void should_return_false_when_the_given_number_is_not_odd() {
    
    boolean isOdd = calculator.isOdd(2);

    assertFalse(isOdd);
  }
}
