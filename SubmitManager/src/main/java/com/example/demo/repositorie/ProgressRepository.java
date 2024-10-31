package com.example.demo.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Progress;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Integer>{

}
