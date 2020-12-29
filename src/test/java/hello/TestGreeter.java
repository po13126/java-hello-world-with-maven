package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGreeter {

    @Test
    public void testsayhello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello world! Jabed Bangali", greeter.sayHello());
    }

}
