package com.example.pranay.repository;

import com.example.pranay.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    @Query("select sid from Student where name=?1")
    Long findByName(String name);
}