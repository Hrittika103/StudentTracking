
package com.studentracking.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.studentracking.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}