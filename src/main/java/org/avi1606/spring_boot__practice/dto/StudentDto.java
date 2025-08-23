package org.avi1606.spring_boot__practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}
