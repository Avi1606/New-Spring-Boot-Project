package org.avi1606.spring_boot__practice.services;


import org.avi1606.spring_boot__practice.dto.StudentAddDto;
import org.avi1606.spring_boot__practice.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getStudentData();

    StudentDto createStudent(StudentAddDto studentAddDto);

    void deleteStudent(Long id);

    StudentDto patchStudent(Long id, StudentAddDto studentAddDto);

    StudentDto putStudent(Long id, StudentAddDto studentAddDto);

}
