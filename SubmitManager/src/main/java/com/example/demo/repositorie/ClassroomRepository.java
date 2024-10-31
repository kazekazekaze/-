package com.example.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer>{
	public Classroom findByAccount(Integer account);
}
