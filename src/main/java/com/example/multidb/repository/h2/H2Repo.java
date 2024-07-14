package com.example.multidb.repository.h2;

import com.example.multidb.entity.h2.Employee;
import com.example.multidb.entity.mysql.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface H2Repo extends JpaRepository<Student,Long> {
}
