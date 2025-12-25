package ru.rksp.Fedotov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name = "Тестовый контроллер", description = "Для проверки работы приложения")
public class HelloController {
    
    @GetMapping("/hello")
    @Operation(summary = "Приветствие", description = "Возвращает приветственное сообщение")
    public String hello() {
        return "Лабораторная работа №1 успешно запущена!";
    }
}
