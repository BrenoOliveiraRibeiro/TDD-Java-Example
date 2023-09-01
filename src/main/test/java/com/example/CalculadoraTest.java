import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
package com.calculadoraTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class TesteCalc {
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(3, 2);
        assertEquals(1.5, result);
    }
}
