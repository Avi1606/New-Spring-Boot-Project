package org.avi1606.spring_boot__practice.services.impl;

import lombok.RequiredArgsConstructor;
import org.avi1606.spring_boot__practice.dto.StudentAddDto;
import org.avi1606.spring_boot__practice.dto.StudentDto;
import org.avi1606.spring_boot__practice.entity.StudentEntity;
import org.avi1606.spring_boot__practice.repository.StudentRepository;
import org.avi1606.spring_boot__practice.services.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getStudentData() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        return studentEntities
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getFirstName(), student.getEmail())).toList();

    }

    @Override
    public StudentDto createStudent(StudentAddDto studentAddDto) {
        StudentEntity newStudentEntity = modelMapper.map(studentAddDto, StudentEntity.class);
        studentRepository.save(newStudentEntity);
        return modelMapper.map(newStudentEntity, StudentDto.class);
    }

    @Override
    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student with id " + id + " not found");
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto patchStudent(Long id, StudentAddDto studentAddDto) {
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student with id " + id + " not found");
        }
        StudentEntity studentEntity = studentRepository.findById(id).get();
        studentEntity.setFirstName(studentAddDto.getFirstName());
        studentEntity.setEmail(studentAddDto.getEmail());
        studentRepository.save(studentEntity);
        return modelMapper.map(studentEntity, StudentDto.class);
    }

    @Override
    public StudentDto putStudent(Long id, StudentAddDto studentAddDto) {
        studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student with id " + id + " not found"));
        StudentEntity studentEntity = modelMapper.map(studentAddDto, StudentEntity.class);
        studentEntity.setId(id);
        studentRepository.save(studentEntity);
        return modelMapper.map(studentEntity, StudentDto.class);
    }


}
