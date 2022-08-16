package com.DataBaseExample.DataBaseExample.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DataBaseExample.DataBaseExample.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
