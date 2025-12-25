package ru.rksp.Fedotov.controller;

import ru.rksp.Fedotov.entity.Student;
import ru.rksp.Fedotov.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Tag(name = "Студенты", description = "Управление данными студентов")
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping
    @Operation(summary = "Получить всех студентов", description = "Возвращает список всех студентов из БД")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    @PostMapping
    @Operation(summary = "Создать студента", description = "Создает нового студента в БД")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    
    @GetMapping("/count")
    @Operation(summary = "Количество студентов", description = "Возвращает количество записей в таблице студентов")
    public Long countStudents() {
        return studentRepository.count();
    }
}
