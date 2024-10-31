package com.example.demo.repositorie;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	public Optional<Account> findById(Integer id);
}
