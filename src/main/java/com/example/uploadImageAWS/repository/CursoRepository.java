package com.example.uploadImageAWS.repository;

import com.example.uploadImageAWS.model.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
}
