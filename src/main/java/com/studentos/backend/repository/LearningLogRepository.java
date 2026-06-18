package com.studentos.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentos.backend.model.LearningLog;

public interface LearningLogRepository extends JpaRepository<LearningLog, Long> {

}