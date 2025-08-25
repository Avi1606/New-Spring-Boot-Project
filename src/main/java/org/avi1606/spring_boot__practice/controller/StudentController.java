package org.avi1606.spring_boot__practice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.avi1606.spring_boot__practice.dto.StudentAddDto;
import org.avi1606.spring_boot__practice.dto.StudentDto;

import org.avi1606.spring_boot__practice.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudentData2(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentData());
    }

    @PostMapping
    public ResponseEntity<StudentDto> addStudent(@RequestBody @Valid StudentAddDto studentAddDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(studentAddDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id ,@RequestBody StudentAddDto studentAddDto) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.patchStudent(id ,studentAddDto));
    }


}

