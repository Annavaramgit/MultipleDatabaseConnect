package com.example.multidb.repository.mysql;

import com.example.multidb.entity.mysql.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MysqlRepo extends JpaRepository<Student,Long> {
}
