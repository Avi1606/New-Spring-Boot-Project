package org.avi1606.spring_boot__practice.repository;

import org.avi1606.spring_boot__practice.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
