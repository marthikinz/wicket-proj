package com.mycompany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.model.Something;

public interface SomethingRepository extends JpaRepository<Something, Long>{
	List<Something> findByName(String name);
}
