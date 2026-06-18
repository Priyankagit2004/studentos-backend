package com.studentos.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentos.backend.model.LearningLog;
import com.studentos.backend.repository.LearningLogRepository;

@Service
public class LearningLogService {

    @Autowired
    private LearningLogRepository learningLogRepository;

    public LearningLog saveLog(LearningLog log) {
        return learningLogRepository.save(log);
    }

    public List<LearningLog> getAllLogs() {
        return learningLogRepository.findAll();
    }
}