package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {
    @Test
    public void testMessage() {
        assertEquals("Hello from my CI/CD pipeline!", Greeting.message());
    }
}
