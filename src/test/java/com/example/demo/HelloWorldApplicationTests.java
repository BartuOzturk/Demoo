package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldApplicationTests {

    @Test
    void hello() {
        HelloController controller = new HelloController();
        String response = controller.hello("World");
        assertEquals("Hello, World", response);
    }

}

