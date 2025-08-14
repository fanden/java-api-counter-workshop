package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    private int counter;

    public CounterController() {
        this.counter = 0;
    }

    @GetMapping("counter")
    public int getCounter() {
        return this.counter;
    }

    @GetMapping("counter/increment")
    public int addCounter() {
        counter++;
        return this.counter;
    }

    @GetMapping("counter/decrement")
    public int removeCounter() {
        counter--;
        return this.counter;
    }
}
