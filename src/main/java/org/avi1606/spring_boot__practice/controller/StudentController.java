package org.avi1606.spring_boot__practice.controller;

import lombok.RequiredArgsConstructor;
import org.avi1606.spring_boot__practice.dto.StudentAddDto;
import org.avi1606.spring_boot__practice.dto.StudentDto;
import org.avi1606.spring_boot__practice.entity.StudentEntity;
import org.avi1606.spring_boot__practice.repository.StudentRepository;
import org.avi1606.spring_boot__practice.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<List<StudentDto>> getStudentData2(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentData());
    }

    @PostMapping("/student")
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentAddDto studentAddDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(studentAddDto));
    }

}

