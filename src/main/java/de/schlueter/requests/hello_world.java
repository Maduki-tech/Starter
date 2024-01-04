package de.schlueter.requests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello_world
 */
@RestController
public class hello_world {
    @GetMapping("/")
    public String hello() {
        return "Hello David!";
    }
}
