package dev.erichaag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello world!", classUnderTest.getGreeting());
    }
}
