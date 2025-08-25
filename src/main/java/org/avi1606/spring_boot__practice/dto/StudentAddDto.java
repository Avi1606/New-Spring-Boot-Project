package org.avi1606.spring_boot__practice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentAddDto {
    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;

    @Email
    private String email;
}
