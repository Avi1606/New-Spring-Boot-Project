package org.avi1606.spring_boot__practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentAddDto {
    private String firstName;
    private String email;
}
