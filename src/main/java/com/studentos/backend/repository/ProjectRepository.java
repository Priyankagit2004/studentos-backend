package com.studentos.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentos.backend.model.Project;

public interface ProjectRepository
        extends JpaRepository<Project, Long> {

}