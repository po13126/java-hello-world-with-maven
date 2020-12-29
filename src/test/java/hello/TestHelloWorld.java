package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestHelloWorld {

    @Test
    public void testnewGreeter() {
        Greeter testnewGreeter=new Greeter();
        assertNotEquals("Hello world",testnewGreeter.sayHello());
    }

}

