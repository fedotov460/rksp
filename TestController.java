package ru.rksp.Fedotov;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Fedotov Application is running! " + java.time.LocalDateTime.now();
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/test/db")
    public String testDb() {
        return "DB test endpoint - will check database later";
    }
}